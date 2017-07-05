# About
It is a sample **SpringBoot** application that shows how transactional-bound
events work and what should we keep in mind while using them.

# Building
In order to build the application, simply run a following command

    mvn clean install

# Running
## Maven
If you want to run the app with **maven**, hit:
    
    mvn spring-boot:run
    
## Java
If you have already built your application and want to run it from
**jar** file, hit:

    java -jar transactional-event-listener-${version}.jar
    
Where **${version}** is current maven build version.