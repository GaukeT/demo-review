FROM openjdk:8-jdk-alpine

LABEL maintainer="GaukeT"

WORKDIR /
RUN ls
ADD ./build/libs/demo-review-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080
CMD java -jar app.war
