Introduction
============
This work is an attempt at implementing the requirements detailed in [`Platform Enablement Technical Test`](https://github.com/MYOB-Technology/ops-technical-test). 
The solution uses following components to demonstrate the functionality required:
- AWS EC2 (Amazon Linux) - to host Java, Jenkins and Springboot Tomcat
- Maven - For build and dependency management
- Jenkins - To set up CI CD pipeling
- Github - public SCM repository

Prerequisites
=============
You will need access to Jenkins instance installed @ http://ec2-13-126-212-110.ap-south-1.compute.amazonaws.com:9090 to review/manage the CI/CD pipeline.
User name and password will be shared with you in an email. 

Deployment & Running Instructions
=================================
The github repository at https://github.com/nitinpune55/springboot-assignment will need to be forked to allow changes to source. 
The resulting repository will need to be updated in Jenkins to trigger CI/CD. 
In Jenkins, look for project called 'springboot_devops_pipeline'. 
It is currently configured to poll github scm (https://github.com/nitinpune55/springboot-assignment) every 5 mins. 0 to 5 minutes after a commit, the pipeline invokes a maven build of the source. 

Maven will execute clean, compile, test and package phases. A JUnit test is executed during the test phase. 
After the successful build, maven will deliver package called "springboot-assignment-0.0.1-SNAPSHOT.jar" under /home/ec2-user/assignments/springboot-assignment/target location on the EC2. 
Following that, Jenkins will stop and start the system service "myapp", which is an alias for Springboot embedded tomcat container. This will launch tomcat on port 8080, on which following URLs can be invoked for:

- [Welcome/Hello page](http://ec2-13-126-212-110.ap-south-1.compute.amazonaws.com:8080/hello)
- [Metadata Endpoint](http://ec2-13-126-212-110.ap-south-1.compute.amazonaws.com:8080/metadata)
- [Health-check Endpoint](http://ec2-13-126-212-110.ap-south-1.compute.amazonaws.com:8080/health)
- [Site Metrics](http://ec2-13-126-212-110.ap-south-1.compute.amazonaws.com:8080/metrics)
- [HTTP requests](http://ec2-13-126-212-110.ap-south-1.compute.amazonaws.com:8080/trace)

Author
======
Nitin Bhalla

Date
====
27/11/2017
