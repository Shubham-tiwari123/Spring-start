## Spring using Maven and Netbeans IDE

### Steps to start a spring project in netbeans IDE

1. File-> New Project-> Maven-> Web Application

2. Inside Project Files open **pom.xml** 

3. Edit pom.xml to convert simple maven into Spring project

4. Inside Source Packages folder create a **main method** inside a package

   	(Note:- Refer JAVA/SpringMaven.java)
 
5. Inside Source Packages create a new package for controller

   	(Note:- Refer JAVA/controller/ContentController.java)
   
6. Clean and build the maven project and then run the project. 

7. To see output go on browser and type **localhost:8080**

8. To change the default port of tomcat

	inside project->Other Sources-> src/main/resources-> create application.properties
	
	and add the following code
	
		**server.port=8888** 
 
