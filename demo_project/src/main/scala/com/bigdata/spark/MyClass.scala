package com.bigdata.spark

class MyClass {
  var myField = 0
// Cách khai báo một constructor
// Khi gọi 1 constructor ko tham số, nghĩa là đang gọi đến this()
//  Tất cả các constructor ngoại trừ contructor mà không có tham số,
//  phải gọi một constructor khác khi bắt đầu trong body.
  def this (value: Int) = {
    this();
    this.myField = value;
  }

//  method trong class được định nghĩa như sau: example
    def getMyField() : Int = {
      return this.myField;
    }
//  ten gọi pthuc là getMyField, Kiểu trả về là kiểu Int,
//  NOTE: các phương thức trả về có một giá trị nên có dấu = ở đây

//  ví dụ bên dưới là hàm ko có giá trị trả về, method này ko có dấu bằng và cũng ko có kiểu dữ liệu trả về
  def addToMyField(value : Int) {
    this.myField += value;
  }

}
