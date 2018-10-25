#!/bin/bash
RED='\033[1;31m'
LGREEN='\033[1;32m'
LBLUE='\033[1;34m'
NC='\033[0m'

echo 
printf "${RED}This will remove existing data from system and re-initialize the environment. Do you want to continue?${NC}"
echo

echo 
printf "${LBLUE}Press enter to continue.. ${NC} "
echo 
echo 
read -p ''
 

#switch to super user and navigate to FS root
cd /

# delete and create folders
sudo rm -rf /opt/logs /opt/app
sudo mkdir /opt/logs /opt/app
sudo rm -rf /logs
sudo ln -s /opt/logs /logs


# permission to folders
sudo chown ec2-user:ec2-user /opt/app 
sudo chown ec2-user:ec2-user /opt/logs 
chmod 775 /opt/app /opt/logs 

# create dummy files
touch /opt/logs/ngrental.log 
touch /opt/app/nextgen-ai-orch.war 
echo "DUMMY LOG FILE FOR FIRST TIME SETUP" > /opt/logs/ngrental.log 


#setup as service - System V Init
sudo ln -sf /opt/app/nextgen-ai-orch.jar /etc/init.d/nextgen-ai-orch 


