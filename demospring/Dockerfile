FROM openjdk:17
WORKDIR /usr/src/myapp
COPY . /usr/src/myapp
ADD target/springbootdemo.jar springbootdemo.jar
ENTRYPOINT ["java","-jar","springbootdemo.jar"]
EXPOSE 9094