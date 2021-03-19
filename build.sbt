
ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "lists",
    addCompilerPlugin("org.typelevel" %% "kind-projector"     % "0.11.3" cross CrossVersion.full),
    resolvers += Resolver.bintrayRepo("dimitarg", "maven"),
    testFrameworks += new TestFramework("weaver.framework.TestFramework"),
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "2.4.2",
      "io.github.dimitarg"  %%  "weaver-test-extra"     % "0.4.2" % "test"

    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
