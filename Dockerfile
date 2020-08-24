# Maven build container 

FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /usr/

COPY src /usr/src/

WORKDIR /usr/

RUN mvn package

FROM openjdk:8

#expose port 8080
EXPOSE 8080

#default command
CMD java -jar /data/BootHibernate-0.0.1-SNAPSHOT.jar#copy hello world to docker image from builder image

COPY --from=maven_build /usr/target/BootHibernate-0.0.1-SNAPSHOT.jar /data/BootHibernate-0.0.1-SNAPSHOT.jar
