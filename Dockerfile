FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/person-0.0.1-SNAPSHOT.jar boot-app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /boot-app.jar