package com.laibao.chapter01

object AbstractClassApp {
  def main(args: Array[String]): Unit = {
    val personTwo:PersonTwo = new StudentTwo()
    println(personTwo.name)
    println(personTwo.age)
    personTwo.speak
  }
}

/**
  * 类的一个或者多个方法没有实现(只有声明没有实现)
  */
abstract class PersonTwo {
  val name:String
  val age:Int
  def speak
}

class StudentTwo extends PersonTwo {

  override val name: String = "jinge"

  override val age: Int = 10

  override def speak: Unit = {
    println("stuenttwo is speaking")
  }
}
