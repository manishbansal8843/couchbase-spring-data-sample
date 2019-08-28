FROM gcr.io/google-appengine/openjdk

MAINTAINER manish_bansal01@infosys.com
LABEL description="sample"

RUN ["mkdir", "-p", "/opt/app"]
WORKDIR /opt/app

COPY ["target/sample*.jar", "sample.jar"]

EXPOSE 8080

ENTRYPOINT ["java", "-Xmx200m", "-jar", "sample.jar"]