
FROM adoptopenjdk:11-jre-hotspot

COPY ./target/ecs-demo-app-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch ecs-demo-app-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","ecs-demo-app-0.0.1-SNAPSHOT.jar"]