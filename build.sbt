name := "smartbot"

version := "0.0.1"

scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  "org.scala-tools.testing" %% "specs" % "1.6.9" % "test",
  "pircbot" % "pircbot" % "1.5.0" from "http://www.bertails.org/pircbot.jar"
)

scalacOptions ++= Seq("-encoding", "UTF8")
