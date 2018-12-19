package com.laibao.chapter03

object ListPatternMatchApp extends App{
  SayHelloToPersons(List("jinge"))
  println()
  SayHelloToPersons(List("jinge","alading"))
  println()
  SayHelloToPersons(List("jiasdfange","aladiasfdang"))
  println()
  SayHelloToPersons(List("jinge","alading","fafafs","fafasdfasf","asdfasfasf"))

  def SayHelloToPersons(persons:List[String]): Unit = {
    persons match {
      case "jinge" :: Nil => println("nihao,金戈")
      case "jinge"::"alading"::Nil => println("你好 金戈 和 阿拉丁")
      case x::y::Nil => println("你好，"+x + ", 还有 "+ y + "你也好啊")
      case "jinge" :: tail => println("兄弟们，你们好呀，你们都在忙什么啊")
      case _ => println("哎，都错误了啊都不对啊")
    }
  }

}
