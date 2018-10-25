#java -d64 -Xmx256m -jar nextgen-ai-orch.jar

RED='\033[0;31m'
LGREEN='\033[1;32m'
LBLUE='\033[1;34m'
NC='\033[0m'


printf "${RED}Stoping service..${NC}"
echo

sudo service nextgen-ai-orch stop
sleep 30

echo
printf "${LBLUE}Copying deployable package..${NC}"
echo

sudo rm -f /opt/app/nextgen-ai-orch.war
sudo cp ./target/nextgen-ai-orch.war /opt/app/nextgen-ai-orch.jar

echo
printf "${LBLUE}Updating execute permission..${NC}"
echo 

sudo chown ec2-user:ec2-user /opt/app/nextgen-ai-orch.jar
sudo chmod 555 /opt/app/nextgen-ai-orch.jar

echo
printf "${LGREEN}Setting log permission..${NC}"
echo

sudo chown ec2-user:ec2-user /opt/logs/ngrental.log
sudo chmod 664 /opt/logs/ngrental.log

echo
printf "${LGREEN}Starting service..${NC}"
echo
echo

sudo service nextgen-ai-orch start

