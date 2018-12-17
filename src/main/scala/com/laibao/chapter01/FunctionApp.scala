package com.laibao.chapter01

object FunctionApp {

  def main(args: Array[String]): Unit = {

    val maxValue = max(100,200)
    println(s"the max value is $maxValue")
    println(add(100,200))
    sayHeHeHe()
    sayHello()
    sayHello("金戈")
    sayName()
    sayName("我们来了")
    loadConfig()
    println()
    println(s"speed(1000,20): ${speed(1000,20)}")
    println()
    println(s"speed(distance = 1000,time = 20): ${speed(distance = 1000,time = 20)}")
    println()
    println(s"speed(time = 1000,distance = 2000000): ${speed(time = 1000,distance = 2000000)}")
  }

  def max(x:Int,y:Int):Int = if (x > y) x else y

  def add(numberA:Int,numberB:Int):Int = numberA + numberB

  def sayHello() {
      println("afasfdasfa")
  }

  def sayHello(name:String = "前程阿拉丁金戈") {
    println(s"afasfdasfa $name")
  }

  def sayName(name:String = "前程阿拉丁金戈"): Unit ={
    println(s"afasfdasfa $name")
  }

  def sayHeHeHe(): Unit ={
    println("afasfdasfa")
    println("afasfdasfa")
    println("afasfdasfa")
  }

  def loadConfig(config:String = "spark-defaults.conf"): Unit = {
    println(config)
  }

  def speed(distance:Double,time:Double) : Double = distance / time
}
