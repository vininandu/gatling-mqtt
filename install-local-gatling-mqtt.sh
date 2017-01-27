#!/bin/sh

sbt assembly

mvn install:install-file -Dfile=target/scala-2.11/gatling-mqtt-assembly-0.1.0-SNAPSHOT.jar -DgroupId=com.github.mnogu -DartifactId=gatling-mqtt -Dversion=1.0.0 -Dpackaging=jar