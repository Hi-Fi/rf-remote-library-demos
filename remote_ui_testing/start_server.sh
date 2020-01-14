docker container run -d --name remote_ui_testing -p 8270:8270 --rm -p 6901:6901 remote_ui_testing

echo "noVNC at http://localhost:6901/?password=vncpassword" 

