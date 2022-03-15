package com.bigdata.spark

object Iterators {
  def main(args: Array[String]): Unit = {
//    Iterator cho phép người dùng thực hiện lặp trên các collection
//    do đó truy cập tất cả các phần tử
//    Có 2 phương thức quan trọng trong Iterator là next và hasNext
//     hasNext => dùng để kiểm tra phần tử đó có tồn tại hay không,
//    => kết quả trả về true or false
//    Next => liệt kê các phần tử kế tiếp trả về

//    example
    val car = Iterator("Santro", "Ounto", "Wagon","Polo", "Audi")
    val num = Iterator(1,2,51,3,5,3,45)
//    while (car.hasNext){
//      println(car.next())
//    }

//    Muốn trả về độ dài, hay số phần tử của Iterator thì dùng size, length

//    println(car.size)
//    println(car.length)
//    Min , max ko áp dụng cho iterator chuỗi
//    println("Phần tử nhỏ nhất: " + car.min)
//    println("Phần tử lớn nhất: " + car.max)
//
//    áp dụng cho iterator số, cjir chạy được min or max
//    println("Phẩn tử lớn nhất: " + num.max)
//    println("Phần tử nhỏ nhất: " + num.min)

//    def foreach(f: (X) => Unit): Unit → Dùng để lặp tất cả các phần tử trong Iterator
//      với tham số đầu vào là một function
  }

}
