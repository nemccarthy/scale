import sbt._

object Dependencies {

  object Versions {
    val scala = "2.12.2"
    val scalas = Seq("2.11.8", "2.12.2")

    val akkaHttp = "10.0.6"
    val akka = "2.5.1"
    val scalatest = "3.0.3"
    val json4sVersion = "3.5.2"
    val sprayV = "1.3.3"
  }

  val testLibs = Seq(
    "org.scalatest" %% "scalatest" % Versions.scalatest,
    "com.typesafe.akka" %% "akka-http-spray-json" % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-testkit" % Versions.akkaHttp
  ).map(_ % Test)

  def mainLibs(scalaVersion: String) = Seq(
    "com.typesafe.akka" %% "akka-slf4j" % Versions.akka,
    "com.typesafe.akka" %% "akka-actor" % Versions.akka,
    "com.typesafe.akka" %% "akka-stream" % Versions.akka,
    "com.typesafe.akka" %% "akka-http" % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json" % Versions.akkaHttp,
    "org.slf4j" % "slf4j-simple" % "1.7.23",
    "com.lightbend.akka" %% "akka-stream-alpakka-awslambda" % "0.9",
    "com.lightbend.akka" %% "akka-stream-alpakka-sns" % "0.9"
  )

  def allLibs(scalaVersion: String) = mainLibs(scalaVersion) ++ testLibs

}