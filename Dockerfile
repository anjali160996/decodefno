FROM openjdk:17-jdk-slim

WORKDIR /usr/src/decodefno

COPY /build/libs/decodefno-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]