FROM openjdk:8u312-jre

ARG APP_NAME=datasource-1.0-SNAPSHOT.jar
ARG APP_FOLDER=./target/${APP_NAME}
ARG HOST_DESTINATION=/usr/local/payment-management/datasource

ENV APP=test

WORKDIR ${HOST_DESTINATION}

COPY ${APP_FOLDER} ${HOST_DESTINATION}

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "datasource-1.0-SNAPSHOT.jar"]