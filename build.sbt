name := "junit-interface-test"

organization := "com.novocode"

version := "0.9-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies += "com.novocode" % "junit-interface" % "0.9-SNAPSHOT" % "test"

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v", "-s", "-a")

parallelExecution in Test := false
