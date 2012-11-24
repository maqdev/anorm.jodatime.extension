name := "anorm.jodatime.extension"

version := "1.0"

scalaVersion := "2.10.0-RC2"

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "joda-time" % "joda-time" % "2.1"

libraryDependencies += "org.joda" % "joda-convert" % "1.2"

libraryDependencies += "play" %% "anorm" % "2.1-RC1"