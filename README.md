# microservices-demo
Microservices demo

Each service have it's own docker file and depends on a jar file of the service.
Create it by running `gradle bootJar` command for each service.

Before we start, make sure you've already done this:

`sudo usermod -a -G docker $USER`

[Link for more info](https://techoverflow.net/2017/03/01/solving-docker-permission-denied-while-trying-to-connect-to-the-docker-daemon-socket/)

If you receive 404 error with this: "Cannot clone or checkout repository" for config service,
fix your docker networking as described here:

https://superuser.com/questions/1130898/no-internet-connection-inside-docker-containers/1274161#1274161

## Running containers together

Docker compose is used for this. Install it if not yet:

`sudo apt-get install python-pip`

`sudo pip install --upgrade pip`

`sudo apt-get install -y python-setuptools`

`sudo pip install docker-compose`

And from project root folder: `docker-compose up --build`.

Check these URLs:

`http://localhost:9090/config/default` for configuration service

`http://localhost:9091/` is for service discovery

`http://localhost:8081/dashboard/feign/peers` is user dashboard

`http://localhost:8084/usersUI/dashboard/feign/1` is a gateway for user dashboard

`http://localhost:8080/users/1` is direct access for user service
