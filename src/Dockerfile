FROM openjdk:11-jdk-slim
VOLUME /tmp
ADD target/docker-to-aws-with-java-0.0.1-SNAPSHOT.jar target.jar
EXPOSE 8081
RUN bash -c 'touch /target.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/target.jar"]