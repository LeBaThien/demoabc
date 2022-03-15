package com.bigdata.spark



import scala.Console.println
import scala.Predef.println
import scala.collection.mutable
import scala.collection.mutable.Set


import scala.collection.JavaConversions._
object CollectionDemo {
  //  Collection trong scala gồm

  //  COLLECTION lIST


  //  + List, Set, Tuple, Map, Iterator
  //  + Collection có thể là mutable hoặc immutable
  //  Đặc điểm của list
  //
  //  khai báo một list

  //  val StudentName = List("Thiện", "Tuấn","Nam")
  //  val StudentName1 : List [String] = List("Thiện", "Tuấn","Nam")


  //  khai báo list rỗng
  //  val em: List[Nothing] = List()

  //  Các hoạt động cơ bản bao gồm
  //
  //  head: trả về phần tử đầu tiên của List
  //  tail: Trả về tất cả các phần tử trừ phần tử đầu tiên
  //  isEmpty: Trả về true nếu list là trống

  //  def main(args: Array[String]): Unit = {
  //    println("Phần tử đầu tiên của list: " + StudentName.head)
  //    println("Trả về tất cả ngoại trừ phần tử đàu tiên: " + StudentName.tail)
  //    println("Trả về true nếu list rỗng: " + em.isEmpty)
  //  }

  // THAO TÁC VỚI LIST

  //1. Nối các List lại với nhau
  //  Có 3 cách
  //    + :::
  //    + List().:::
  //    + phương thức concat()
  //    example
  //def main(args: Array[String]): Unit = {
  //    val country_1 = List("India","SriLanKa","Algeria")
  //  val country_2 = List("Austria", "Belgium", "Canada")
  //  val country = country_1 ::: country_2
  //  println("country_1 ::: country_2 : " + country)
  //
  //  val cont = country_1.:::(country_2)
  //  println("country_1.:::(country_2) : " + cont)
  //
  //  val con = List.concat(country_1, country_2)
  //  println("List.concat(country1, country_2 : " + con)
  //}

  //  2. Đảo ngược mảng
  //  def main(args: Array[String]): Unit = {
  //    val country = List("Denmark", "Sweden", "France")
  //    println("Country list before reversal : " + country)
  //    println("Country List after reversal : " + country.reverse)
  //  }

  //  3. Tạo List giống nhau
  //def main(args: Array[String]): Unit = {
  //  val name = List.fill(6)("Thien")
  //  println("Name : " + name)
  //  val id = List.fill(6)(12)
  //  println("Id : " + id)
  //}

  //  MỘT SỐ PHƯƠNG THỨC THAO TÁC VỚI LIST

  //  def distinct: List[X] → Tạo một List mới từ một List mà không có phần tử nào trùng nhau
  //  def indexOf(elem: X, from: Int): Int → Tìm index của giá trị xuất hiện đầu tiên trong List sau hoặc tại index bắt đầu.
  //  def length: Int → Trả về độ dài của List
  //  def sorted[Y >: X]: List[X] → Sắp xếp List theo thứ tự
  //  def sum: A → Tính tổng của tất cả các phần tử trong List này
  //  def toString(): String → Chuyển đổi List thành String
  //  def min: A → Tìm phần tử nhỏ nhất
  //  def max A → Tìm phần tử lớn nhất
  //  def lastIndexOf(elem: A, end: Int): Int → Tìm index của giá trị xuất hiện cuối cùng trước hoặc tại index cuối cùng
  //  def toMap[X, Y]: Map[X, Y] →  Chuyển đổi List thành Map


  //  COLLECTION SET
  //  Các đặc điểm:
  //  + Set không chứa các phần tử bị trùng lặp
  //  + Set có thể là mutable hoặc immutable
  //  + import thư viện : scala.collection.mutable.Set

  //  MỘT SỐ THAO TÁC CƠ BẢN TRÊN SET

  //  1. Khai báo Set
  //  val country = Set ("Russia", "Denmark", "Sweden")
  //  val id : Set[Int] = Set (1,3,4,2,4,1)
  //   kết quả sẽ ntn : Set(1, 2, 3, 4),  set chủ động loiaj bỏ các phần tử lặp nhau
  //  Set rỗng
  //  var age = Set()

  //  def main(args: Array[String]): Unit = {
  //    println(country)
  //    println(id)
  //    println(age)
  //  }

  //  2. Các hàm cơ bản tương tự list
  //  head → Trả về phần tử đầu tiên của một Set
  //  tail → Trả về tất cả các phần tử ngoại trừ phần tử đầu tiên của Set
  //  isEmpty → trả về true nếu Set là trống, ngoài ra trả về false
  //def main(args: Array[String]) {
  //  val name = Set("Smith", "Brown", "Allen")
  //  val id: Set[Int] = Set()
  //
  //  println( "Head of name : " + name.head )
  //  println( "Tail of name : " + name.tail )
  //  println( "Check if name is empty : " + name.isEmpty )
  //  println( "Check if id is empty : " + id.isEmpty )
  //}

  //  3. Ghép nối các Set
  //  Sử dụng các cách sau:
  //   ++
  //  Set.++()
  //def main(args: Array[String]): Unit = {
  //  val furniture_1 = Set("Sofa", "Table", "Chair")
  //  val furniture_2 = Set("Bed", "Door")
  //
  //  var furniture = furniture_1 ++ furniture_2
  //  println("funiture_1 + furniture_2 : " + furniture)
  //
  //  var furn = furniture_1.++(furniture_2)
  //  println("Furniture_1.++(furniture_2) : " + furn)
  //}
  //  4. Giá trị chung trong các Set
  //  Cách xác định giá trị chung trong các Set
  //  + Set.&
  //  + Set.intersect
  //  example
  //def main(args: Array[String]): Unit = {
  //  val n1 = Set(11,45,67,78,89,90)
  //  val n2 = Set(10,20,45,67,34,78,98,89)
  //
  //  println("n1.&(n2): " + n1.&(n2))
  //  println("n1.intersect(n2) : " + n1.intersect(n2))
  //}

  //  5. Phần tử lớn nhất và nhỏ nhất trong Set
  //  Cách dùng:
  //  + Set.min
  //  + Set.max
  //def main(args: Array[String]): Unit = {
  //  val num1 = Set(125,2,4,24,6,2,3,6,12)
  //  println("Max number: " + num1.max)
  //  println("Min number : " + num1.min)
  //}

  //  6. Các phương thúc hữu ích
  //  def contains(elem: X): Boolean → Trả về True nếu phần tử được chứa trong Set, ngoài ra trả về false
  //  def last: X → Trả về phần tử cuối cùng
  //  def size: Int → Trả về số lượng các phần tử trong immutable Set
  //  def product: X →  Trả về tíc các phần tử trong immutable Set sử dụng toán tử *
  //  def sum: X → Trả về tổng các phần tử trong immutable Set sử dụng toán tử +
  //  def toList: List[X] → Chuyển đổi Set sang List
  //  def toSeq: Seq[X] → Chuyển đổi Set sang Seq
  //  def toArray: Array[X] → Chuyển đổi Set sang Array
  //  def subsetOf(that: Set[X]): Boolean → Trả về true nếu Set này là tập con của that ví dụ tất cả phần tử của Set cũng là phần tử của that
  //  def mkString: String → Hiển thị tất cả các phần tử của Set trong một string.

  //  3. COLLECTION MAP
  //  Các đặc trưng"
  //  + map là collection lưu trữ theo cặp key và value
  //  + key phải là duy nhất, value thì có thể trùng nhau
  //  + mutbale hoặc immutable, mặc định là immutable
  //  + improt thêm scala.collection.mutable.Map để dùng
  //
  //  1. Cách khai báo một Map
  //  val student = Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")
  //
  //  2. Các phương thức cơ bản được hỗ trợ gồm:

  //  keys: Trả về iterator chứa các key trong Map
  //  values: Trả về một iterator chứa các key trong Map
  //  isEmptyL Trả về True nếu Map rỗng
  //  example

//  def main(args: Array[Int]) {
//    val student = Map(12 -> "Reenam", 13 -> "Micheal", 14 -> "Peter")
//    //tạo một Map rỗng
//    val marks: Map[Int, String] = Map()
//
//    println("Key : " + student.keys)
//    println("Values : " + student.values)
//    println("Check if student is empty : " + student.isEmpty)
//    println("Check if marks is empty : " + marks.isEmpty)
//  }

  //  3. Nối các Map lại với nhau
  //   + Dùng ++
  //   + Dùng Map.++()
  //def main(args: Array[String]): Unit = {
  //  val s = Map(1->"T", 2->"H", 3->"I")
  ////  Nếu s1 sử dụng key trùng nhau, thì nó sẽ lấy key của s1, và khác biệt của s , gom lại
  ////  val s1 = Map(1 -> "E", 2 -> "N")
  ////  gom những thèn khác nhau giữa s và s1
  //  val s1 = Map(4 -> "E", 5 -> "N")
  //
  //  val s2 = s ++ s1
  //  println(s2)
  //
  //  val s3 = s.++(s1)
  //  println(s3)
  //}

  //  4. Sử dụng foreach để lặp key và value trong MAP


//  def main(args: Array[String]): Unit = {
//    val s: Map[Int, String] = Map(16 -> "Russel", 22 -> "Mark", 33 -> "Steve")
//    s.keys.foreach { key =>
//      println("Key = " + key)
//    }
    //    val m1 = Map("fname" -> "Al", "lname" -> "Alexander")
    //    for ((k, v) <- m1) printf("key: %s, value: %s\n", k, v)
    //  }

//  }
}
