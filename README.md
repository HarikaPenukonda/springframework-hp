## Annotations
1. Components - create the object and registers that object in Spring IOC container
2. ComponentScan - Scans the base packages and if Component annotation is found it creates and registers the object in the IOC container
3. Configuration - Marks that particular class as a configuration file where the container reads the file and creates, registers, and manages spring beans
4. Bean - This annotation is used to create spring bean
5. Autowired - automatically wires the vales to their respective dependencies, automatic dependency injection
6. Value - This annotation is used to inject values into fields, method parameters, and constructor arguments
7. Primary - designates a bean as the default candidate when there are multiple beans of the same type exist
8. Qualifier - Provides more granular control by specifying which bean should be implemented when multiple beans are available. Qualifier > Primary
9. PropertySource - used in the config file to provide the location of the properties file
10. Required - when the field is marked as required, we need to provide the value otherwise it throws an exception
11. PostConstruct - Runs after the bean is created and dependencies are injected.Used to perform any initialization tasks (e.g., setting up resources).Example: Connecting to a database after the bean is ready.
12. PreDestroy - Runs before the bean is destroyed.Used to perform cleanup tasks (e.g., closing connections or releasing resources).Example: Closing a database connection before shutting down.
13. Controller - Creates the bean of that particular class and stores in the container also indicates that the particular class is a controller.

## Spring-core
1. What is Inversion of Control (IoC) in Spring, and why is it important?

2. What is the role of the Spring IoC container in an application?

3. What are the two types of Spring IoC containers?

4. Explain the difference between ApplicationContext and BeanFactory.

5. How do you define a bean in a Spring application? Provide an example of a basic XML or annotation-based configuration.

6. What is the purpose of the @Component, @Service, @Repository, and @Controller annotations in Spring?

7. What is the default scope of a bean in Spring? How can you change it?

8. What is dependency injection (DI), and what are the different ways to implement it in Spring?

9. What is the difference between setter injection and constructor injection? Which one would you prefer and why?

10. How does Spring IoC handle circular dependencies between beans?

11. What is the role of the @Qualifier annotation in Spring? How does it work with @Autowired?

12. Can a Spring bean be lazy-initialized? How do you configure it?

13. What is the use of the @PostConstruct and @PreDestroy annotations in a Spring bean?

14. How do you define and use custom initialization and destruction methods for a bean?

15. What is the difference between a prototype-scoped bean and a singleton-scoped bean in Spring?

16. Explain the concept of BeanPostProcessor and its use cases.

17. What is the purpose of the @Configuration annotation in Spring? How does it differ from the traditional XML-based configuration?

18. How can you externalize configuration in Spring applications using properties files?

19. What is the purpose of the @Value annotation in Spring? Provide an example.

20. How does the @Primary annotation help resolve bean conflicts in Spring?
