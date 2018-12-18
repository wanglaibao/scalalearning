package com.laibao.chapter01

object CaseClassApp {

  def main(args: Array[String]): Unit = {
    val dog = Dog("wangcai",120)
    println(dog.name)
    println(dog.age)
  }
}

// case class 无须用new 构造函数
// 通常用在模式匹配中
case class Dog(name:String,age:Int)
