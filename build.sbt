organization := "com.example"
scalaVersion := "2.12.4"
version      := "0.1.0-SNAPSHOT"

name := "Sparky"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.0" % "provided",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"

// Scala 2.12, Spark 2.4+
libraryDependencies += "MrPowers" % "spark-fast-tests" % "0.17.1-s_2.12"
