# projectmgmt
Checkout the master branch 
edit the <projectcheckout>/src/main/resources/application.properties to update the username and password and url of the data base
Before running the server create the schema and default data by running the <projectcheckout>/fullsqldump.sql
Build the spring jar file  by executing  gradlew boot jar from the  <projectcheckout> directory
start the server  with command  
  to build use the command 
  <projectcheckout> ./gradlew bootjar
    edit the application.properties to point oteh right database 
    then run 
  ./gradlew bootRun  -Dspring.config.location=.
