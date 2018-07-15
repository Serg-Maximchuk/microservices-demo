# microservices-demo
Microservices demo

Each service have it's own docker file and depends on a jar file of the service.
Create it by running `gradle bootJar` command for each service.

Before we start, make sure you've already done this:

`sudo usermod -a -G docker $USER`

[Link for more info](https://techoverflow.net/2017/03/01/solving-docker-permission-denied-while-trying-to-connect-to-the-docker-daemon-socket/)

## Config service
Config service lives in directory `config`.
To start with, execute the below command in config directory to create the base Docker image:

`docker build -t config-server:latest .`

Then run it:

`docker run --name config-server -p 9090:9090 config-server:latest`

If you receive 404 error with this: "Cannot clone or checkout repository", fix your docker networking as described here:

https://superuser.com/questions/1130898/no-internet-connection-inside-docker-containers/1274161#1274161

## Service discovery

Similar thing needs to be done for eureka service discovery in folder `discovery`.

`docker build -t service-discovery:latest .`

`docker run --name discovery-service -p 9091:9091 service-discovery:latest`
