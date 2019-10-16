# REST API documented using Swagger 2.0


## Post

You can read it here: [Contract testing using Swagger, Prism and Dredd](https://medium.com/@m_arlandy/contract-testing-for-microservices-using-swagger-prism-and-dredd-efdd463b9433)

## API documentation

You can see the <a href="https://github.com/marlandy/contracttesting/blob/master/src/main/webapp/ApiV1.yaml" target="_blank">API documentation (Swagger)</a>

## Environment
* JDK 1.8
* Apache Tomcat 8.0.21
* Apache Maven 3.1


## Instructions

* **mvn clean install** in ${PROJECT_HOME} folder (where pom.xml file is)
* Starting embeded Tomcat:
  * Run **mvn tomcat7:run**
  * http://localhost:8080/awesomesite (index.html page)
* To manually deploy on your server
  * copy target/awesomesite.war file into ${APACHE_TOMCAT_HOME}/webapps/ folder
  * start Apache Tomcat
  * http://localhost:8080/awesomesite
 
## Running Dredd

 * Start the service 
 * Install dredd: **npm install -g dredd**
 * Execute: **dredd http://localhost:8080/awesomesite/ApiV1.yaml http://localhost:8080**

## Starting Prism server

 * Install prism from https://stoplight.io/platform/prism/
 * Execute: prism run --mock --list --spec ${PROJECT_HOME}/src/main/webapp/ApiV1.yaml 
 * Now you can send request to http://localhost:4010/awesomesite/api/v1/... (you can import <a href="https://raw.githubusercontent.com/marlandy/contracttesting/master/src/main/resources/SwaggerPrismDredd.postman_collection.json" target="_blank">this postman collection</a>)
