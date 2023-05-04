FROM maven:3.8.3-openjdk-17
WORKDIR /usr/src/app
COPY . /usr/src/app/
RUN mvn clean package 
EXPOSE 8080
