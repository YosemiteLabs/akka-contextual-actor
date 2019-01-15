name := "akka-contextual-actor"

organization := "io.yosemite"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.8"

resolvers += "Typesafe Snapshot Repository" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.5.17",
    "com.typesafe.akka" %% "akka-slf4j" % "2.5.17"
)
