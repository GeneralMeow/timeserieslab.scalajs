name := "timeserieslab"

version := "0.1.0"

scalaVersion := "2.12.1"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

lazy val copyjs = TaskKey[Unit]("copyjs", "Copy javascript files to target directory")
copyjs := {
  val outDir = baseDirectory.value / "scripts"
  val inDir = baseDirectory.value / "target/scala-2.12"
  val files = Seq("timeserieslab-fastopt.js", "timeserieslab-fastopt.js.map", "timeserieslab-jsdeps.js") map { p =>
    (inDir / p, outDir / p)
  }
  IO.copy(files, true)
}

addCommandAlias("buildjs", ";fastOptJS;copyjs")