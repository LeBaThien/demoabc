package com.bigdata.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}


object DemoEtl {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[*]").setAppName("my app")
    val sc = new SparkContext(conf)
    val sparkSession = SparkSession.builder
      .config(conf = conf)
      .appName("BigDataLocalSetup")
      .getOrCreate()

    val path = "etl_demo_scala/month1.csv"
    val base_df = sparkSession.read.option("header","true").
      csv(path)

    println(base_df)
  }
}
