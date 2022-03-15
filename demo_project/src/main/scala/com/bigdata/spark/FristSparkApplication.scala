package com.bigdata.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object FristSparkApplication {
//  def parsLine(line:string) ={
//    val fields = line.split(",")
//  }


  def main(args: Array[String]): Unit = {
//    Logger.getLogger("org").setLevel(level.ERROR)
    val sc  =  new SparkContext("local[*]","FristSparkApplication")
    val lines = sc.textFile("month1.csv")
//    print(x = lines)
  print("Hello scala")
  }

//  var myVar : String = "Foo" khai báo cụ thể
//  khai báo ngầm hiểu
//  val myVar1 = 10
//  val myVar2 = "thien"
//val (myVar1: Int, myVar2: String) =  (40, "Foo")
//val (myVar1, myVar2) = (40, "Foo")

}
