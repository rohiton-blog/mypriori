FROM openjdk:8-jdk-alpine
COPY target/mypriori-app.jar mypriori-app.jar
ENTRYPOINT ["java","-jar","/mypriori-app.jar"]
