# 1. 빌드 단계
FROM gradle:7.6.0-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon -x test

# 2. 실행 단계
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"] 