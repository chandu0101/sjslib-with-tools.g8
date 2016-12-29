import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {


  object Version {

    val scala211 = "2.11.8"

    val scala212 = "2.12.0"

    val scalaAsync = "0.9.6"

    val upickle = "0.3.1"

    val scalatest = "3.0.0"

    val utest = "0.3.0"

    val scalaJSDOM = "0.9.1"

    val chandu0101Macros = "2016.11.0"

    val scalaMeta = "1.4.0"

  }


  val utestJS = libraryDependencies += "com.lihaoyi" %%% "utest" % Version.utest % Test

  val scalatestJS = libraryDependencies += "org.scalatest" %%% "scalatest" % Version.scalatest % Test

  val scalaAsync = libraryDependencies += "org.scala-lang.modules" %% "scala-async" % Version.scalaAsync

  val scalaJSUpickle = libraryDependencies += "com.lihaoyi" %%% "upickle" % Version.upickle

  val scalaJSDOM = libraryDependencies += "org.scala-js" %%% "scalajs-dom" % Version.scalaJSDOM

  val chandu0101Macros = libraryDependencies += "com.github.chandu0101" %%% "macros" % Version.chandu0101Macros

  val scalaReflect = libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value % Provided

  val scalaMeta = libraryDependencies += "org.scalameta" %% "scalameta" % Version.scalaMeta % Provided

  val coreModuleDeps = Seq(
    scalaJSDOM,
    chandu0101Macros
  )



  val toolsModuleDeps = Seq(scalaMeta)


 

}