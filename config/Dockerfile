FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/config-0.0.1-SNAPSHOT.jar config.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config.jar"]
EXPOSE 9090
