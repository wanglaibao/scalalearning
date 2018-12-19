package com.laibao.chapter03

object TypeMatchApp extends App{
  matchType(1000)
  matchType(2000L)
  matchType("金戈")
  matchType(1::Nil)
  matchType(Set(1,2,3))
  matchType(Map("jinge" -> "金戈来了啊"))
  matchType('A')
  matchType(null)

  def matchType(obj:Any): Unit = {
    obj match {
      case c : Char => println("char")
      case x : Int => println("Int")
      case y : Long => println("Long")
      case str : String => println("String")
      case list:List[String] => println("list")
      case set:Set[String] => println("Set")
      case map:Map[String,String] => println("Map[String,String]")
      case _ => println("I can not understand what you mean")
    }
  }
}
