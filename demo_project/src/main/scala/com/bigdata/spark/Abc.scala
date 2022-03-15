package com.bigdata.spark

object Abc {
  def main(args: Array[String]) {
    val s: Map[Int, String] = Map(16 -> "Russel", 22 -> "Mark", 33 -> "Steve")
    s.keys.foreach { key =>
      println("Key = " + key)
    }

    println("Min element: " + s.min)
    println("Max element: " + s.max)
  }
}
