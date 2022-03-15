package com.bigdata.spark

object Demo {
  def main(args: Array[String]): Unit = {
    var myVar : Int =10;
    val myval : String = " Hello Scala wwith datatype declaration"
    var myVar1 = 20
    val myVal1 = "Hello Scala new without data type declaration."
    val m2 = myVal1 + "123";

//    val được sử dụng để định nghĩa các hằng số. val nghĩa là hằng số hoặc immutable,
// nghĩa là chúng ta sẽ không thể thay đổi giá trị sau khi nó được tạo ra.
//    ngược lại thì var thay đổi được
//    lazy val a = 10
//    sử dụng lazy val để định nghĩa một dữ liệu immutable, giống với val
//    val vs lazy val
//    Ở đây chúng ta sẽ thảo luận về một số điểm tương đồng và khác biệt giữa cấu trúc val và lazy val
//
//    Giống nhau giữa cấu trúc val và lazy val
//
//    Cả hai đều được sử dụng để định nghĩa hằng số hoặc dữ liệu immutable
//      Cả hai đều được tính toán một lần duy nhất
//      Khác nhau giữa cấu trúc val và lazy val
//
//    val được tính toán tại thời điểm định nghĩa gọi là Eagerly
//    lazy val  chỉ được tính toán khi chúng ta truy cập nó lần đầu tiên gọi là Lazy
    println(myVar)
    println(myval)
    println(myVar1)
    println(myVal1)
    println(m2)

//  note
//    Object fields can be both mutable and immutable types and can be defined using either var or val.

  }
}
