FROM netflixoss/java:8
VOLUME /tmp
ADD users-1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8000:8000 8002 8009 8761 7777