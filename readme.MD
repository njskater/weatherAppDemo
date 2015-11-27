# A Weather App Demo
This is a demo application to display weather condition.

------------------------------------
Framework used:
------------------------------------
Front end: AngularJS, BootStrap

Back end: Spring Boot

Unit test: JUnit, Mockito

------------------------------------
Design Overview
------------------------------------

The application is a typical layered design, it has following layers:

* client side: including html pages and javascript files
* web tier: Restful controllers
* service tier: City list Service and Weather service

Services are loosed coupled components so they can be easily
replaced by other implementations.

At the moment the backend weather API used is: Open Weather Map -- http://openweathermap.org

Unit tests covers critical code path and used mocked object when necessary.

Spring boot is used for quick turn around and container-less deployment.


------------------------------------
System Requirement:
------------------------------------
Application tested on Mac OSX 10.10 and 10.11  
Requires:  
JDK 1.8+  
MAVEN 3.0+


------------------------------------
To build and run unit test this appication:
------------------------------------
```
mvn clean test
```

------------------------------------
To run this application:
------------------------------------
```
mvn spring-boot:run
```

-------------------------
Extra Configuration
-------------------------
This application is using spring boot as the container and default listening port is 8080.  
If this required to be changed, please modify application.properties file under src/main/resources.  

