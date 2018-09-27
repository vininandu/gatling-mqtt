name := "gatling-mqtt"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
"io.gatling" % "gatling-core" % "2.2.3" % "provided",
"org.fusesource.mqtt-client" % "mqtt-client" % "1.14"
)
//dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value
// Gatling contains scala-library
assemblyOption in assembly := (assemblyOption in assembly).value
  .copy(includeScala = false)
