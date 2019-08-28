FROM gcr.io/google-appengine/openjdk
RUN apk add --update --no-cache netcat-openbsd
RUN apk add --no-cache curl

MAINTAINER manish_bansal01@infosys.com
LABEL description="sample"

RUN ["mkdir", "-p", "/opt/app"]
WORKDIR /opt/app

COPY ["couchbase-spring-data-sample/target/sample*.jar", "sample.jar"]

EXPOSE 8080

ENTRYPOINT ["java", "-Xmx200m", "-jar", "sample.jar"]