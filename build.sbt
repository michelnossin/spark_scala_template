organization := "com.example"
scalaVersion := "2.12.4"
version      := "0.1.0-SNAPSHOT"

name := "Sparky"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0",
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

