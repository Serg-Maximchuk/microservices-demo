FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/user-dashboard-0.0.1-SNAPSHOT.jar user-dashboard.jar
COPY wait-for.sh wait-for.sh
RUN chmod 755 wait-for.sh
EXPOSE 8081
