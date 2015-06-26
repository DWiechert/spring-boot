# spring-boot

## Table of Contents
* **[Overview](#overview)**
* **[Features](#features)**
* **[Starting](#starting)**
* **[Dependencies](#dependencies)**
* **[Running](#running)**
* **[Annotations](#annotations)**
* **[Entities](#entities)**
* **[Repositories](#repositories)**
* **[Controllers](#controllers)**
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
* `@Autowired` - Autowires in objects/dependencies.
* `@RequestMapping` - Indicates a REST endpoint inside of a controller.
* `@ResponseBody` - Indicates that the response body should be JSON.
* `@Param` - Indicates a REST request parameter.
* `@Entity` - Indicates an entity which should be stored in a database. With no other config, the database table is the name of the class.
* `@Id` - Indicates which field is the primary id on an entity.
* `@GeneratedValue` - Indicates that the id field should be an auto-generated number.

### Entities
* Customer - Compromised of a first and last name.
* Person - Compromised of a first and last name.

### Repositories
* CustomerRepository - A `CrudRepository` with extra search methods.
* PersonRepository - A `PagingAndSortingRepository` with extra search methods. 

### Controllers
* CustomerController - A REST controller built on top of the `CustomerRepository`. Provides simple REST endpoints with request parameters and returns results in JSON.
* PersonRepository - A very simple REST controller built in the repository itself. Provides searches based on the interface methods, and sorting/pagination based on interface it extends.

### Interfaces
* Banner - Used to create a custom banner on startup.
* CrudRepository - Basic repository interface that provides simple CRUD operation methods:
 * Save
   * One
   * Multiple
 * Find
   * One by id
   * Multiple by id
   * All
 * Exists by id
 * Count
 * Delete
   * One by id
   * One by entity
   * Multiple by entity
   * All
* PagingAndSortingRepository - Repository built on top of the `CrudRepository`. Adds pagination and sorting operations:
 * Find all
   * By some sorting
   * By pagination

### Links
* http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
* http://projects.spring.io/spring-boot/
* http://start.spring.io/
