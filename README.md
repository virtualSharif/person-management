# person-management

#### Description 
Parent, child, favourite meal and house relationship management

#### Technology Stack
Spring Boot Application,
Java 8,
H2 in memory database (SQL),
RESTful WebServices, Spring scheduling,
Docker container integrated

    Hours took to build : Approximately 6 hours.
------------------------------------------------------------------------------------------------------------------------
## Steps to run the project:

#### Step 1. Build the project and run the project

  ##### a. Using Maven (if java is installed on the system):
    You must to have 'Java 8' installed on your machine :
    If java is not installed, use  https://www.java.com/en/download/help/download_options.xml to install.

    You much have 'Maven' installed on your machine :
    If maven is not installed, use https://maven.apache.org/install.html to install.
    If maven is already installed :

    	mvn clean install spring-boot:run

    Output:
    Last line on the terminal will look like similar to the below line :

        2017-11-07 01:41:36.456  INFO 7774 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8888 (http)
        2017-11-07 01:41:36.717  INFO 7774 --- [           main] c.w.p.scheduler.ParentSummaryScheduler   : Startup data is populated into in memory database


#### OR

   ##### b. Using Docker and Maven :
    You don't need to install java or any other dependency

         mvn clean install dockerfile:build

    Once your docker image is successfully created please run the below command to run the application

        docker run -p 8888:8888 -t spring-boot-app/person

------------------------------------------------------------------------------------------------------------------------
#### Step 2. Checking the running project

    To check whether REST APIs of application is working or not. Open browser and go to below url:

    	http://localhost:8888/api/v1/hello

    Output:
    You will get below text as response.

    	Hello Engineer @ Wagawin

    Hurray !
    Application is ready to use.
    
------------------------------------------------------------------------------------------------------------------------
#### Step 3 : REST documentation

    To check, the REST apis of web application. Open browser and go to below url :

    	 http://localhost:8888 or  http://localhost:8888/swagger or http://localhost:8888/swagger-ui.html

------------------------------------------------------------------------------------------------------------------------
## Project Modules :
	This project consists of only RESTful webservices build using in Spring boot Application.
------------------------------------------------------------------------------------------------------------------------
## Project architectural points:
	Points regarding the development phase:

##### i. Modularise :
	For the time being I have modularise the project on package level.
	Later we can also modularise in maven modules.

------------------------------------------------------------------------------------------------------------------------
##### ii. DTO :
	It stands for Data Transfer Object.
	In this project DTO are used to send as response object from rest controller.

------------------------------------------------------------------------------------------------------------------------
##### iii. RESTful API design :
	Backend consists following restful apis i.e.

	You can find all the available api's after running the application in Swagger documentation at http://localhost:8888
------------------------------------------------------------------------------------------------------------------------
##### iv. Exception Handler via Aspect :
	Added aspect for exception handling at rest layer and send appropriate http status and error messages.

------------------------------------------------------------------------------------------------------------------------
##### v. Testing and documentation for RESTful apis:
	Integrated Swagger, for more details please visit here : http://swagger.io/
	I’ve added swagger framework for testing the apis.

------------------------------------------------------------------------------------------------------------------------
##### vi. Comments :
	Entire code styling is influenced by Clean Code principle - Robert Martin
	Which says
	'Truth can only be found in one place: the code’.
	So you may not found any comments anywhere in the project.
	Keeping in mind that git can be used to manage version of file and method name should be kept as self explanatory.

	However, if you need comments on each file. I can do that too.

------------------------------------------------------------------------------------------------------------------------
##### vii. Design principles used in Project :
	a. SOLID (single responsibility, open-closed, Liskov subsitution, interface segragation, dependency inversion) principle,
	b. Composition over inheritance,
	c. DRY(Don’t repeat yourself),
	d. Test only exceptions,
	e. KISS(Keep it simple, stupid)
	f. and some experience principle ;)
