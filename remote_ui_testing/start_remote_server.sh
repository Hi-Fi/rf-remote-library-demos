#!/bin/bash

cd /javafx && java -jar ./javafxlibrary-0.5.3-jar-with-dependencies.jar &> /javafx/javafxlibrary.log &
/dockerstartup/vnc_startup.sh --wait
