name := "timeserieslab.github.io"

version := "0.1.0"

scalaVersion := "2.12.1"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true