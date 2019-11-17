FROM python:alpine

WORKDIR /opt/rfserver

ADD requirements.txt .

RUN pip install -r requirements.txt

ADD * ./

ENTRYPOINT ["python","main.py"]