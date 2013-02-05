import com.typesafe.sbt.SbtStartScript

name := "PlayMiniSample"

version := "0.1"

scalaVersion := "2.9.2"

seq(SbtStartScript.startScriptForClassesSettings :_*)
