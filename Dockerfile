FROM openjdk:11
#VOLUME /tmp
ARG APP_NAME="DockerTestApplication"
ARG APP_VERSION="1.0"
ARG JAR_FILE="/target/${APP_NAME}-${APP_VERSION}.jar"
COPY ${JAR_FILE} apps.jar
EXPOSE 8989
#ADD target/JenkinApplication-1.0.jar JenkinApplication-1.0.jar
ENTRYPOINT ["java","-jar","apps.jar"]

#FROM openjdk:11
#VOLUME /tmp
#EXPOSE 9090
#ADD DockerTestApplication-1.0.jar DockerTestApplication-1.0.jar
#ENTRYPOINT ["java","-jar","/DockerTestApplication-1.0.jar"]
