import org.apache.spark.{SparkConf, SparkContext}

object ReadCsv {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Word Count").setMaster("local")
    val sc = new SparkContext(conf)
//    val input = sc.textFile("text.txt")
//    val count = input.flatMap(line => line.split(" "))
//      .map(word=>(word,1))
//      .reduceByKey(_+_)
//    count.saveAsTextFile("output")
//    println("Scala Spark")

  }
}
