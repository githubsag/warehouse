FROM openjdk: 8u131-jdk-alpine

MAINTAINER sohrab azami "contact@gmail.com"

EXPOSE 8080

WORKDIR /usr/local/bin

COPY maven/warehouse-0.0.1-SNAPSHOT.jar warehouse.jar

CMD ["java", "-jar", "warehouse.jar"]