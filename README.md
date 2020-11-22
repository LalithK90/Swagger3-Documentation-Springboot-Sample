# Swagger3-Documentation-Springboot-Sample
 

## Getting Started with Swagger-3 in Springboot Rest API

### For new projects

#### For Maven:-

```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```

#### For Gradle:-

```
  implementation "io.springfox:springfox-boot-starter:<version>"
```

Now there is *no extra configuration* to *activate swagger* on the spring-boot project like the previous. if try to configure with security, there is some configuration. plz refer to this article.

In swagger version 3 remove the ```@EnableSwagger2``` annotation base config also.

And most of the user tries to find HTML swagger document file using ```host}/swagger-ui.html``` or ```{host}/swagger-ui``` those are now removed.

**use** ```{host}/swagger-ui/``` to see the HTML document

This is a sample project link on GitHub Refer to [documentation] (https://swagger.io/docs/open-source-tools/swagger-ui/usage/configuration/) io.springfox
