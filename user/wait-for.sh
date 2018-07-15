#!/bin/sh

while ! nc -z config-server 9090 ; do
    echo "Waiting for the Config Server"
    sleep 1
done

while ! nc -z discovery-service 9091 ; do
    echo "Waiting for the Eureka Server"
    sleep 1
done

java -Djava.security.egd=file:/dev/./urandom -jar /user.jar
