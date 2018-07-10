# microservices-demo
Microservices demo

Before we start, make sure you've already done this:

`sudo usermod -a -G docker $USER`

[Link for more info](https://techoverflow.net/2017/03/01/solving-docker-permission-denied-while-trying-to-connect-to-the-docker-daemon-socket/)

## Config service
Config service lives in directory `config`.
To start with, execute the below command in config directory to create the base Docker image:

`docker build --tag=config-server:latest --rm=true .`

Then run it:

`docker run --name=config-server --publish=9090:9090 config-server:latest`

