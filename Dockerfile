FROM openjdk:8

WORKDIR /data
COPY demo.jar /data/demo.jar

EXPOSE 4242

ENTRYPOINT ["java", "-jar", "demo.jar"]