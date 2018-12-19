package com.laibao.chapter03

object ExceptionProcessApp extends App{

  val result0 = 100 / 20
  println(result0)

  try{
    val result1 = 1000 / 0
    println(result1)
  }catch {
    case ex:ArithmeticException => println("运算错误了啊")
    case ex:RuntimeException => println(ex.getMessage)
    case ex:Exception => println(ex.getCause)
  }finally {
    println("这个里面的代码一定会执行的啊")
  }




}
