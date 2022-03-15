package com.bigdata.spark

object DemoOption {
  case class User(
                   id: Int,
                   firstName: String,
                   lastName: String,
                   age: Int,
                   gender: Option[String])

  object UserRepository {
    private val users = Map(
      1 -> User(1, "John", "Doe", 32, Some("male")),
      2 -> User(2, "Johanna", "Doe", 30, None))
    def findById(id: Int):
    Option[User] = users.get(id)
    def findAll = users.values
  }

//  Option có thể được sử dụng như một collection và cung cấp map, flatMap, filter
  def main(args: Array[String]): Unit = {
   println(UserRepository.findById(1).filter(_.age > 30)) // Some(user), because age is > 30
   println(UserRepository.findById(2).filter(_.age > 30)) // None, because age is <= 30
   println(UserRepository.findById(3).filter(_.age > 30)) // None, because user is already None

//    Nếu bạn muốn lấy gender của một User, chúng ta có thể áp dụng for comprehension
    for {
      user <- UserRepository.findById(1)
      gender <- user.gender
    } yield gender

  }
}
