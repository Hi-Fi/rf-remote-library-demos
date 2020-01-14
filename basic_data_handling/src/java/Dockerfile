FROM maven:3-jdk-8 as builder

WORKDIR /opt/rfserver

ADD . ./

RUN mvn clean package

FROM maven:3-jdk-8

WORKDIR /opt/rfserver

ADD image_from_remote.png .
COPY --from=builder /opt/rfserver/target/robotframework-remote-server-example-1.0.0-jar-with-dependencies.jar .
ENTRYPOINT ["java", "-jar", "robotframework-remote-server-example-1.0.0-jar-with-dependencies.jar"]
CMD ["--library", "ExampleLibrary:/", "--port", "8270"]