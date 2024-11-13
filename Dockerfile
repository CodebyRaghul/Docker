FROM eclipse-temurin:17
COPY target/automation.jar automation.jar
CMD [ "java","-jar","automation.jar" ]