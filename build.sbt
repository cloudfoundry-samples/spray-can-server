import com.twitter.sbt._

seq(StandardProject.newSettings: _*)

organization := "cc.spray"

name := "simple-http-server"

packageDistZipName := "simple-http-server.zip"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  "Typesafe repo" at "http://repo.typesafe.com/typesafe/releases/",
   "spray repo" at "http://repo.spray.cc/"
)


libraryDependencies ++= Seq(
   "cc.spray" % "spray-server" % "1.0-M1",
    "cc.spray" % "spray-can" % "1.0-M1",
   "com.typesafe.akka" %   "akka-actor" % "2.0"
)

EclipseKeys.withSource := true