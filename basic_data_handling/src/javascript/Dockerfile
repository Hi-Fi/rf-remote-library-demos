FROM node:10-alpine

WORKDIR /opt/jsserver

ADD . ./

RUN npm install

ENTRYPOINT ["npm","start"]