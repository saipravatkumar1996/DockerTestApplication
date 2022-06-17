FROM openjdk:11
VOLUME /tmp
EXPOSE 9090
ADD target/DockerTestApplication-1.0.jar DockerTestApplication-1.0.jar
ENTRYPOINT ["java","-jar","/DockerTestApplication-1.0.jar"]
