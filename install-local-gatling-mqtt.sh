#!/bin/sh

sbt assembly

cd target/scala-2.11

mvn install:install-file -Dfile=gatling-mqtt-assembly-0.1.0-SNAPSHOT.jar -DgroupId=com.github.mnogu -DartifactId=gatling-mqtt -Dversion=1.0.0 -Dpackaging=jar