FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gateway.jar"]
EXPOSE 8084
