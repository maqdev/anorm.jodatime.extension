name := "anorm.jodatime.extension"

version := "1.0"

scalaVersion := "2.9.1"

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "joda-time" % "joda-time" % "2.1"

libraryDependencies += "org.joda" % "joda-convert" % "1.2"

libraryDependencies += "play" %% "play" % "2.0.3"