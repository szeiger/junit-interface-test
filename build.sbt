name := "junit-interface-test"

organization := "com.novocode"

version := "0.9-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
	 "com.novocode" % "junit-interface" % "0.9-SNAPSHOT" % "test",
	 "info.cukes" % "cucumber-junit" % "1.0.7" % "test",
	 "info.cukes" % "cucumber-java" % "1.0.7" % "test"
	)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-s", "-a")

parallelExecution in Test := false
