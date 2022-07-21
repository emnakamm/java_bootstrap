FROM  maven:3.8-openjdk-11
WORKDIR /eclipse-workspace/Java_bootstrap
COPY JavaBootstrapApplication.java /eclipse-workspace/Java_bootstrap/
EXPOSE 8080
ADD target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"] 
