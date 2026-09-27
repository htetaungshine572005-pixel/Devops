FROM eclipse-temurin:25
LABEL authors="Htet Aung Shine"
WORKDIR /tmp
COPY ./target/semApp.jar /tmp/semApp.jar
ENTRYPOINT ["java", "-jar", "semApp.jar"]