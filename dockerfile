FROM openjdk:17
EXPOSE 8080
ADD target/PFE-2.jar PFE-2.jar
ENTRYPOINT ["java","-jar","/PFE-2.jar"]