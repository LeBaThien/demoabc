package com.bigdata.spark.application

import org.apache.spark.sql.SparkSession

object ReadCsv extends  App {
val sparkSession = SparkSession.builder().appName("READ_CSV").master("local").getOrCreate()
 val dataSet = sparkSession.read.format("com.databricks.spark.csv").load("D:\\de_tma\\demoabc\\etl_demo_scala\\month1.csv")

  dataSet.show(2,100, false)
}
