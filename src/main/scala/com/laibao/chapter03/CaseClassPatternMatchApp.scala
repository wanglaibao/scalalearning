package com.laibao.chapter03

object CaseClassPatternMatchApp extends App{

  caseClassMatch(Cto("jinge","200"))
  println()
  caseClassMatch(Programmer("alading","20"))
  println()
  caseClassMatch(OtherPerson("qiancheng","2"))
  println()
  def caseClassMatch(person: Person): Unit = {
    person match {
      case Cto(name,floor) => println(s"Cto name is $name he is working at floor $floor")
      case Programmer(name,floor) => println(s"Programmer name is $name he is working at floor $floor")
      case OtherPerson(name,floor) => println(s"OtherPerson name is $name he is working at floor $floor")
    }
  }
}

class Person

case class Cto(name:String,floor:String) extends Person
case class Programmer(name:String,floor:String) extends Person
case class OtherPerson(name:String,floor:String) extends Person
