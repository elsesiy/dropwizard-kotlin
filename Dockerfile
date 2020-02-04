FROM openjdk:8-jre-alpine
EXPOSE 8080

COPY sample.yml /app/config.yml
COPY build/libs/dropwizard-sample.jar /app/app.jar

CMD java -jar /app/app.jar server /app/config.yml
