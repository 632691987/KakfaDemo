1, How to create develop environment

There is a StartKafka.yml, just start it, remember to rename to docker-compose.yml first, command:

```shell
docker-compose up -d
```

2, How to create topic, send event, receive event in docker

```shell
docker exec -it <container id> /bin/bash
cd /usr/bin

## create topic
./kafka-topics --create --bootstrap-server localhost:29092 --topic topic1

## send message / event
./kafka-console-producer --topic topic1 --bootstrap-server localhost:29092

## receive message / event
./kafka-console-consumer --topic topic1 --from-beginning --bootstrap-server localhost:29092
```