

name := "spring-data-polyglot"

version := "1.0"

scalaVersion := "2.11.8"

autoScalaLibrary := false

crossPaths := false

seq(groovy.settings :_*)

seq(testGroovy.settings :_*)

//groovySource in Compile := (sourceDirectory in Compile).value / "groovy"

//groovySource in Test := (sourceDirectory in Test).value / "groovy"

libraryDependencies ++= Seq(
  "org.codehaus.groovy" % "groovy-all" % "2.1.8",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final",
  "org.springframework" % "spring-context" % "4.2.4.RELEASE",
  "org.springframework.data" % "spring-data-jpa" % "1.9.2.RELEASE",
  "org.projectlombok" % "lombok" % "1.16.6",
  "org.springframework" % "spring-test" % "4.2.4.RELEASE" % "test",
  "com.h2database" % "h2" % "1.4.191",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.10-M1" % "test"
)