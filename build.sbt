name := "scala-spark-streaming"

version := "1.0"

scalaVersion := "2.11.1"



//val sparkVersion = "2.3.1"
val sparkVersion = "1.5.2"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-flume-assembly" % sparkVersion





//    compile group: 'org.apache.spark', name: 'spark-core_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-mllib_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-sql_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-streaming_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-streaming-flume-assembly_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-graphx_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-launcher_2.11', version: "${sparkVersion}"
//compile group: 'org.apache.spark', name: 'spark-catalyst_2.11', version: "${sparkVersion}"

)
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.4"
libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "4.0.4"

libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.6.3"
//https://stackoverflow.com/questions/38893655/spark-twitter-streaming-exception-org-apache-spark-logging-classnotfound/39194820
//libraryDependencies += "org.apache.bahir" %% "spark-streaming-twitter" % "2.2.1"

