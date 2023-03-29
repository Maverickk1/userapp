FROM openjdk:8
ADD target/userapp-0.0.1-SNAPSHOT.jar userapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/userapp-0.0.1-SNAPSHOT.jar"]
