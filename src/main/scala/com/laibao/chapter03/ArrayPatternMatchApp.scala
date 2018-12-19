package com.laibao.chapter03

object ArrayPatternMatchApp extends App{

  SayHelloToPersons(Array("jinge"))
  println()
  SayHelloToPersons(Array("jinge","alading"))
  println()
  SayHelloToPersons(Array("jiasdfange","aladiasfdang"))
  println()
  SayHelloToPersons(Array("jinge","alading","fafafs","fafasdfasf","asdfasfasf"))

  def SayHelloToPersons(persons:Array[String]): Unit = {
    persons match {
      case Array("jinge") => println("nihao,金戈")
      case Array("jinge","alading") => println("你好 金戈 和 阿拉丁")
      case Array(x,y) => println("你好，"+x + ", 还有 "+ y + "你也好啊")
      case Array("jinge",_*) => println("兄弟们，你们好呀，你们都在忙什么啊")
      case _ => println("哎，都错误了啊都不对啊")
    }
  }
}
