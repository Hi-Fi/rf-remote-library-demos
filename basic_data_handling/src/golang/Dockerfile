FROM golang as builder

WORKDIR /opt/golang

ADD . ./

RUN CGO_ENABLED=0 go build -o /opt/golang/grobotremoteserver && chmod a+x grobotremoteserver

FROM scratch

COPY --from=builder /opt/golang/grobotremoteserver /opt/golang/grobotremoteserver
ADD image_from_remote.png /opt/golang/image_from_remote.png

ENTRYPOINT ["/opt/golang/grobotremoteserver"]