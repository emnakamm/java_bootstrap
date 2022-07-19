FROM openjdk:11
EXPOSE 8080
ADD target/java_bootstrap.jar java_bootstrap.jar
ENTRYPOINT ["java","-jar","/java_bootstrap.jar"]
