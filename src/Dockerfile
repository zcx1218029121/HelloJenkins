FROM openjdk:8u212-jre
MAINTAINER loafer 1218029121@qq.com
COPY ./target/hello-jenkins-0.0.1-SNAPSHOT.jar /jar/hello-jenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Xmx256m", "-jar", "/jar/hello-jenkins-0.0.1-SNAPSHOT.jar"]
