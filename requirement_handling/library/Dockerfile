FROM binarycat/cx_oracle:6

WORKDIR /opt/rfserver
RUN pip install robotframework-databaselibrary robotremoteserver robotframework
ADD main.py ./
ENTRYPOINT ["python","main.py"]
