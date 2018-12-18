package com.laibao.chapter01
object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new Person("金戈",100)
    println(person.name + " and old is "+person.age)
    println(person.eat)
    person.watchFootBall("baba")
  }
}

class Person ( val name:String,val age:Int){

  def eat(): String = name + " is eating meal"

  def watchFootBall(teamName:String): Unit = {
    println(name + s" is watching foot ball match of $teamName")
  }

}
