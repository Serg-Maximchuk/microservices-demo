FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/discovery-0.0.1-SNAPSHOT.jar discovery.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config.jar"]
EXPOSE 9091
