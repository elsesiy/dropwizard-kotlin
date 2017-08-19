FROM openjdk:8-jre
EXPOSE 8080

COPY sample.yml /app/config.yml
COPY build/libs/Dropwizard-Sample.jar /app/app.jar

CMD java -jar /app/app.jar server /app/config.yml