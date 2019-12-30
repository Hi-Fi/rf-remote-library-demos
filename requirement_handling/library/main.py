import sys
from robotremoteserver import RobotRemoteServer
from DatabaseLibrary import DatabaseLibrary

if __name__ == '__main__':
    RobotRemoteServer(DatabaseLibrary(), host="0.0.0.0", *sys.argv[1:])

