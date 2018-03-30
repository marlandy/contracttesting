# REST API documented using Swagger 2.0

## Environment
* JDK 1.8
* Apache Tomcat 8.0.21
* Apache Maven 3.1

## Instructions
* **mvn clean install** in ${PROJECT_HOME} folder (where pom.xml file is)
* Starting embeded Tomcat:
  * Run **mvn tomcat7:run**
  * http://localhost:8080/awesomesite (index.html page)
* To manually deploy on your server
  * copy target/awesomesite.war file into ${APACHE_TOMCAT_HOME}/webapps/ folder
  * start Apache Tomcat
  * http://localhost:8080/awesomesite
 
# API documentation

You can see the <a href="#" target="_blank">API documentation (Swagger)</a>
