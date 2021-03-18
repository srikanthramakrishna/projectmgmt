# projectmgmt
Checkout the master branch 
edit the <projectcheckout>/src/main/resources/application.properties to update the username and password and url of the data base
Before running the server create the schema and default data by running the <projectcheckout>/fullsqldump.sql
Build the spring jar file  by executing  gradlew boot jar from the  <projectcheckout> directory
start the server  with command  java -jar <projectcheckout>/build/libs/ProjectMangement-0.0.1-SNAPSHOT.jar
