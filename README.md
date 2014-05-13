- Development:

1. Open plugin with IJ;
2. ./gradlew clean build pTML - clean, build, and publish to local maven repo
3. ./gradlew publish - publish to remote Nexus server

- Consume:

1. Enter consumer;
2. ./gradlew tasks - to list all of the tasks
3. ./gradlew triggerJenkinsJob - to try to trigger Jenkins' job
