package redisson;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionBean implements Externalizable {
  private long counter = 100;

  public long getCounter() {
    return counter;
  }

  public void increase() {
    counter++;
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeUTF(Long.toString(counter));
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    counter = Long.parseLong(in.readUTF());
  }


}
