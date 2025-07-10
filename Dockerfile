FROM eclipse-temurin:17-jre
WORKDIR /app
COPY ./build/libs/my-spark-app.jar  app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
