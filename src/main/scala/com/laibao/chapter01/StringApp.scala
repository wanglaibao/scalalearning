package com.laibao.chapter01

object StringApp extends App{

  val greeting = "nice to meet you"
  val name = "金戈"

  //建议不要这样做，这么做比较差
  println("Hello, "+name + greeting)
  println()
  println(s"Hello, $name! $greeting")

  val mutiLineStr =
    """
      |这是一个多行字符串的例子
      |Hello,World
      |金戈
      |你在忙什么啊
    """.stripMargin

  println(mutiLineStr)
}
