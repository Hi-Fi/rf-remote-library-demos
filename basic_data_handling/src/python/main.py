import sys
import os

from robotremoteserver import RobotRemoteServer
from keywords import RemoteDemoLibrary

if __name__ == '__main__':
    PORT = os.getenv('PORT', 8270)
    RobotRemoteServer(RemoteDemoLibrary(), host="0.0.0.0", port=PORT, *sys.argv[1:])
