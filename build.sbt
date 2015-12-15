import sbt.Keys._
import android.Keys._

name := "firstsbt"

version := "1.0"

scalaVersion := "2.10.4"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

platformTarget in Android := "android-23"
minSdkVersion in Android := "15"

scalacOptions in Compile ++= Seq("-deprecation","-feature","-language:implicitConversions","-unchecked")
unmanagedBase := baseDirectory.value / "libs"

// proguard help
proguardScala in Android := true
useProguard in Android := true

//set dependencies
libraryDependencies ++= Seq(
  "com.android.support" %  "cardview-v7" % "23.1.1",
  //aar("com.android.support" % "appcompat-v7" % "23.1.1")
  "com.android.support" % "appcompat-v7"  % "23.1.1",
  "com.android.support" % "recyclerview-v7" % "23.1.1",
  "com.android.support" % "gridlayout-v7" % "23.1.1",
  "com.android.support" % "support-v4" % "23.1.1"
  //aar("com.android.support" % "recyclerview-v7" % "23.1.1")
  //aar("com.github.chrisbanes.actionbarpulltorefresh" % "library" % "0.9.3")
  //aar("net.simonvt.menudrawer" % "menudrawer" % "3.0.4"),
  //"com.google.android" % "support-v4" % "r7",
  //"io.spray" % "spray-json_2.10" % "1.2.6",
  //"net.minidev" % "json-smart" % "1.2")
)