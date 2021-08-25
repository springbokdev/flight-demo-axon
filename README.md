# Getting Started with Axon Framework and Server

## Running Axon Server with Docker

```
docker run -d -p 8024:8024 -p 8124:8124 --name axonserver axoniq/axonserver
```

## Using Axon Framework with Spring Boot

When you use Maven
Add the following dependency to your pom.xml:
```
<dependency>
   <groupId>org.axonframework</groupId>
   <artifactId>axon-spring-boot-starter</artifactId>
   <version>${axon.version}</version>
</dependency>
```

When you use Gradle
Add the following dependency to your build configuration:

```
implementation 'org.axonframework:axon-spring-boot-starter'
```
