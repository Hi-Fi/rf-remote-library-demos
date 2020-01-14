FROM python:3

WORKDIR /opt/rfserver
RUN pip install robotframework-databaselibrary robotremoteserver robotframework psycopg2-binary
ADD main.py ./
ENTRYPOINT ["python","main.py"]
