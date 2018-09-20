FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/lumgraal.jar /lumgraal/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/lumgraal/app.jar"]
