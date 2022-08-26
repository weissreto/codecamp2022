# Code Camp 2022 - Seesion Replication using Redis

Runs an Axon.ivy Cluster with two nodes and a redis memory database where session data is stored. 
This allows to shutdown Axon.ivy Cluster Nodes without losing a user session. 
You can even shutdown all nodes and restart them and you will not loose a session. 
Also no sticky session is necessary. 

## How to build:
1. Run the product build on branch codecamp/redis of the ivy-core repo
2. Build the docker-image using the URL of engine build on step 1. See docker-image/build.bat
3. Build kubernetes.yaml: `kubectl kustomize . > kubernetes.yaml`
4. Run everything in kubernetes: `kubectl apply -f kubernetes.yaml`

The dev-workflow-ui-*.jar is build using the codecamp/redis branch of the dev-workflow-ui repo
The redisson-*.iar is build with ivy from the ivy project located in redisson folder.


