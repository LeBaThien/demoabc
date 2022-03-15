package com.bigdata.spark

object Tuple {
//Khai báo Tuple Collection
//Đặc điểm của Tuple Collection
//  + Chứa nhiều giá trị giống nhau hoặc khác nhau
//  + Tuple có thể chứa các object với kiểu khác nhau
//  + Scala Tuple là immutable
//  + Tuple giới hạn đối đa chỉ chứa được 22 phần tử
//  c1:
def main(args: Array[String]): Unit = {
  val s1 = (12, "Harry")
  println(s1)
  //  c2:
  val s2 = new Tuple2(13,"thien")
  println(s2)

//  cách truy cập vào phần tử trong Tuple
  println(s2._1)
  println(s2._2)

//  truy cập và tính toán với tuple
  val m1 = (20, 12, 16, 4)

  val mul = m1._1 * m1._2 * m1._4

  println("Result is : " + mul)
//  Sử dụng tuple.productIterator() để lặp
  m1.productIterator.foreach( i => println(" Value = " + i))


  //  Sủ dujg tuple.swap để hoán đổi các phần tử của tuple
//  chỉ swap được giữa 2 phần tử, với s2, m1 thì ko
  println("Swapped Tuple Id is: " + s2.swap)

//  Chuyển tất cả các phần tử trong Tuple thành String
  val student = new Tuple3(12,"Thien", "IT")

  println("Concatenated String: " + student.toString())

  }

}
