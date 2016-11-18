lazy val root = (project in file(".")).
  settings(
    name := "spark-seed-project",
    version := "1.0",
    scalaVersion in ThisBuild := "2.11.8",
    mainClass in Compile := Some("it.polimi.dice.spark.PiExample.scala")
  )

resolvers ++= Seq(
  "All Spark Repository -> bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.1"
)

// META-INF discarding
mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
   {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
   }
}
