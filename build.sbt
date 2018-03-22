name := """json-perf"""

version := "1.0"

scalaVersion := "2.12.4"

val json4sVersion = "3.5.3"
val playVersion = "2.6.9"
val circeVersion = "0.9.2"

resolvers += Resolver.bintrayRepo("commercetools", "maven")

libraryDependencies ++=
  "io.circe"                              %% "circe-core"           % circeVersion  ::
  "io.circe"                              %% "circe-generic"        % circeVersion  ::
  "io.circe"                              %% "circe-parser"         % circeVersion  ::
  "com.fasterxml.jackson.module"          %% "jackson-module-scala" % "2.9.4"       ::
  "org.json4s"                            %% "json4s-native"        % json4sVersion ::
  "org.json4s"                            %% "json4s-jackson"       % json4sVersion ::
  "io.sphere"                             %% "sphere-json"          % "0.9.5"       ::
  "com.typesafe.play"                     %% "play-json"            % playVersion   ::
  "io.spray"                              %% "spray-json"           % "1.3.4"       ::
  "io.argonaut"                           %% "argonaut"             % "6.2.1"       ::
  "com.github.plokhotnyuk.jsoniter-scala" %% "macros"               % "0.21.4"      ::
  Nil

libraryDependencies ++=
  "org.scalatest"                         %% "scalatest"            % "3.0.5"       ::
  Nil map (_ % Test)

parallelExecution in Test := false

enablePlugins(JmhPlugin)
