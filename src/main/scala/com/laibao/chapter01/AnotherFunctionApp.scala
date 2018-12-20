package com.laibao.chapter01

/**
  * 匿名函数的定义如下
  *  (参数名称:参数类型) => 函数体
  */
object AnotherFunctionApp extends App{

  sayHello("金戈")

  def sayHello(name:String): Unit = {
      println(s"hello,$name,welcome to scala world")
  }
}
