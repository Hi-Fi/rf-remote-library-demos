FROM consol/ubuntu-icewm-vnc

USER root
RUN mkdir /javafx && chmod 777 /javafx && cd /javafx && \
    wget https://repo1.maven.org/maven2/org/robotframework/javafxlibrary/0.5.3/javafxlibrary-0.5.3-jar-with-dependencies.jar && \
    wget https://repo1.maven.org/maven2/org/robotframework/javafxlibrary/0.5.3/javafxlibrary-0.5.3-tests.jar
RUN apt-get -qq update && apt-get install -qq --no-install-recommends --allow-unauthenticated -y \
    openjdk-8-jre \
    # Install older version of openjfx, current version is incompatible with openjdk8
    # Bug ticket: https://bugs.launchpad.net/ubuntu/+source/openjfx/+bug/1799946
    openjfx \
    libopenjfx-java \
    libopenjfx-jni \
    openjfx-source \
    && apt-get clean && rm -rf /var/lib/apt/lists/*
USER 1000
ADD start_remote_server.sh /javafx/
ENTRYPOINT [ "/javafx/start_remote_server.sh" ]
CMD [""]
