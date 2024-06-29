FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/REGLOG-0.0.1-SNAPSHOT.jar REGLOG.jar
EXPOSE 8086
ENTRYPOINT [ "java","-jar","REGLOG.jar" ]