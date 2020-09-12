FROM jenkins/jenkins:latest
LABEL maintainer=”caleb.mortensen@live.com”
RUN mkdir /var/log/jenkins
USER root
RUN chown -R  jenkins:jenkins /var/log/jenkins
USER jenkins
ENV JAVA_OPTS="-Xmx8192m"
ENV JENKINS_OPTS=" --handlerCountMax=300 --logfile=/var/log/jenkins/jenkins.log"



####################################


FROM java:8
EXPOSE 8080
ADD /jenkins.war jenkins.war
ENTRYPOINT ["java","-jar","jenkins.war"]