//package spark.template
//
//final case class Person(firstName: String, lastName: String,
//                        country: String, age: Int)
//
//object Main extends InitSpark {
//  def main(args: Array[String]) = {
//
//    val version = spark.version
//    println("SPARK VERSION = " + version)
//
////    val sumHundred = spark.range(1, 101).reduce(_ + _)
////    println(f"Sum 1 to 100 = $sumHundred")
//
//    println("Reading from csv file: people-example.csv")
////    val persons = reader.csv("people-example.csv").as[Person]
////    persons.show(2)
////    val averageAge = persons.agg(avg("age"))
////                     .first.get(0).asInstanceOf[Double]
////    println(f"Average Age: $averageAge%.2f")
//
//    close
//  }
//}
