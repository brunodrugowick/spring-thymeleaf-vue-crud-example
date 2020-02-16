# spring-thymeleaf-vue-crud-example

Complete (ongoing) 
CRUD example project with Spring Boot, Thymeleaf, Vue.js and Axios.

I started this app adding simple Vue.js scripts to Thymeleaf templates, but this architecture started to become confuse when I started to think about security.

Now, thanks to [this blog post](https://blog.codecentric.de/en/2018/04/spring-boot-vuejs/) I'm rethinking the architecture.

## Building and Running

At this stage of the development, the developer experience is not completed, but running is easy:

```shell script
mvn clean install
```

This command builds the frontend (static) and copy the files to the backend, where Spring Boot serves static files. Everything is configured on the `pom.xml`.

After that the backend is packaged as a jar file (a normal Spring Boot build) and can be executed with:

```shell script
java -jar backend/target/backend-0.0.1-SNAPSHOT.jar
```

Note: at this point the index is being served by the Spring controller with a Thymeleaf rendered page. The Vue.js is there, but it's not being used right now.

