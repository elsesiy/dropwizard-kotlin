# Containerized Dropwizard-Example written in Kotlin, built with Gradle

This is the official [Dropwizard-Sample](http://www.dropwizard.io/1.1.2/docs/getting-started.html) written in [Kotlin](https://github.com/JetBrains/kotlin) and built with [Gradle](https://gradle.org/).

I'm also using the [Gradle Shadow](https://github.com/johnrengelman/shadow) plugin to create a self-contained executable Jar, which is then executed in a [Docker](https://www.docker.com/) container.

## Getting Started

Clone the repo & `./gradlew shadowJar`.

### Docker

**Pre-Reqs:** Docker, Docker-Compose.

Just `docker-compose up -d` in the root project dir.

If you `docker ps` you should be seeing a running container with the name `dropwizard-sample`.

### Manual

You can either manually run the artifact by `java -jar build/libs/dropwizard-sample.jar server sample.yml` in the project root or just use `./gradlew run` which does the heavy-lifting for you.

### Demo
Just go ahead and check [http://localhost:8080/api/hello-world?name=GitHub](http://localhost:8080/api/hello-world?name=GitHub) after doing either of the getting started parts.