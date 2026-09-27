FROM eclipse-temurin:25
LABEL authors="Htet Aung Shine"
COPY ./target/Devops-0.1-alpha-2.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Devops-0.1-alpha-2.jar"]