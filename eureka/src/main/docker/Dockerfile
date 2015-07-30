FROM java:8
VOLUME /tmp
ADD eureka-1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Deureka.datacenter=cloud","-jar","/app.jar"]
EXPOSE 8761 7777