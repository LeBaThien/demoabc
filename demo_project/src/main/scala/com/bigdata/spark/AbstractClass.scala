package com.bigdata.spark

// Khai báo một abstract class
// giống Java abstract class có thể có pthuc non-abstract và pthuc abstract
abstract class AbstractClass{
  def run()
}

//Một class mà extend abstract class thì phải cung cấp thực thi cho tất các các phương thức trong abstract class
//Chúng ta sẽ không thể tạo một object cho abstract class.

class Hero extends AbstractClass{
  override def run(): Unit = {
      println("pthuc của hero ke thua tu Abstract class")
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    var h = new Hero ()
    h.run()
  }
}

