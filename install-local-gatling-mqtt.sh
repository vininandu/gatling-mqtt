#!/bin/sh

sbt assembly

# install gatling mqtt jar file into local maven repository
# these classes are used in thingsboard performance-tests project
mvn install:install-file -Dfile=target/scala-2.11/gatling-mqtt-assembly-0.1.0-SNAPSHOT.jar -DgroupId=org.thingsboard -DartifactId=gatling-mqtt -Dversion=1.0.0 -Dpackaging=jar