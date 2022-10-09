FROM maven:3.8.6-openjdk-18-slim as builder

COPY ./pom.xml ./pom.xml

RUN mvn -B dependency:resolve

COPY ./src ./src
RUN mvn -B clean package -DskipTests

FROM openjdk:19-jdk-slim

COPY --from=builder /target/firedevback.jar firedevback.jar

ENTRYPOINT [ "java" , "-Xmx1g", "-XX:+UseG1GC" , "-XX:+UseStringDeduplication" , "-jar", "firedevback.jar" ]
