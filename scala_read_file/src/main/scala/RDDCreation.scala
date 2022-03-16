import org.apache.spark.{SparkConf, SparkContext}

object RDDCreation {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("createRDD").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val data = (1 to 100).toList
    val data_rdd = sc.parallelize(data)

    data_rdd.foreach(println)
//    val rdd2 = sc.textFile()
  }
}
