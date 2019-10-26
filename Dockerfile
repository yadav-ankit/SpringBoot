FROM openjdk:8-jdk-alpine

ADD target/phonekart.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080