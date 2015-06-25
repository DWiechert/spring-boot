# spring-boot

## Table of Contents
* **[Overview](#overview)**
* **[Features](#features)**
* **[Starting](#starting)**
* **[Dependencies](#dependencies)**
* **[Running](#running)**
* **[Annotations](#annotations)**
* **[Entities](#entities)**
* **[Interfaces](#interfaces)**

### Overview
A quick and easy way to get a Spring project up and running. By following Spring conventions and using certain third-party applications, one can have a Spring project up in a few minutes.

### Features
* Stand-alone Spring applications
* Uses embedded servlet (Tomcat default) so no need to deploy a WAR
* Provides "starter poms" to bring in all dependencies and versions
* No code generation or XML configuration

### Starting
* [start.spring.io](http://start.spring.io/)
 * Easy website to start a new Spring Boot application
 * Select metadata items
   * POM information
     * Group
      * Artifact
      * Name
      * Description
    * Java version
    * Spring Boot version
    * Packaging
 * Select starter dependencies
   * Core
    * Web
    * Template Engines
    * Data
    * Cloud
    * Database
    * Social
    * I/O
    * Ops

### Dependencies
For this demo, I have selected the following dependencies:

* Data
 * JPA
 * JDBC
* Database
 * H2
* Web
 * Web
 * Rest Repositories

### Running
This application can be ran in multiple ways:

* From Eclipse as a Java Application
* From Maven via `mvn spring-boot:run`
* From a packaged JAR `java -jar spring-boot-0.0.1-SNAPSHOT.jar`

Since this is just a JAR, this project has a main class, [DemoApplication](src/main/java/demo/DemoApplication.java). For convenience, there is a static method that can be invoked to start the whole application:
```
SpringApplication.run(DemoApplication.class, args);
```
Where `DemoApplication` is the name of the main class in my project and args are the same arguments passed into `main`.

### Annotations
Several annotations are used throughout this project:

* `@SpringBootApplication` - This is equivalent to using `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan` with their default attributes. This sets up the Spring application to look for all other annotations, scan for beans, and autowire everything.
* `@Component` - Indicates a class should be picked up by auto-detection for running.
* `@Order` - Indicates the order in which a specific component should be ran.
* `@RestController` - This is equivalent to using `@Controller` and `@ResponseBody`. It indicates a class is a controller for REST requests. It also implicitly makes each method return a JSON response body.

### Entities

### Interfaces

### Links
* http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
* http://projects.spring.io/spring-boot/
* http://start.spring.io/
