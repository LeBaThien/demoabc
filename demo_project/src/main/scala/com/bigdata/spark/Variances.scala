package com.bigdata.spark


class Animal[+T](val animial:T)
class Dog
class Puppy extends Dog

class AnimalCarer(val dog:Animal[Dog])
class AnimalLeg(val puppy: Animal[Puppy])

object Variances {
  def main(args: Array[String]) {
    val puppy = new Puppy
    val dog = new Dog

    val puppyAnimal:Animal[Puppy] = new Animal[Puppy](puppy)
    val dogAnimal:Animal[Dog] = new Animal[Dog](dog)

    val dogCarer = new AnimalCarer(dogAnimal)
    val puppyCarer = new AnimalCarer(puppyAnimal)

    println("Done.")
  }
}
//---------------------------------------
//Cú pháp Contravariance
abstract class Type [-T]{
  def typeName : Unit
}

class SuperType extends Type[AnyVal]{
  override def typeName: Unit = {
    println("SuperType")
  }
}
class SubType extends Type[Int]{
  override def typeName: Unit = {
    println("SubType")
  }
}

class TypeCarer{
  def display(t: Type[Int]){
    t.typeName
  }
}

object ScalaContravarianceTest {

  def main(args: Array[String]) {
    val superType = new SuperType
    val subType = new SubType

    val typeCarer = new TypeCarer

    typeCarer.display(subType)
    typeCarer.display(superType)
  }

}
