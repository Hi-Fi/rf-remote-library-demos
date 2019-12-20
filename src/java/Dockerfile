FROM maven:latest

WORKDIR /opt/rfserver

ADD . ./

RUN mvn clean package && mvn dependency:go-offline dependency:resolve-plugins

ENTRYPOINT ["mvn","exec:exec"]