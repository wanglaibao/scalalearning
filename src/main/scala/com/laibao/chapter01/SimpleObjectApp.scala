package com.laibao.chapter01

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new Person("金戈",100)
    person.address = "杭州市"
    println(person.name + " and old is "+person.age)
    println(person.eat)
    person.watchFootBall("baba")
    println(person.address)
    person.printInfo()
  }
}

class Person ( val name:String,val age:Int){

  var address:String = _

  def eat(): String = name + " is eating meal"

  def watchFootBall(teamName:String): Unit = {
    println(name + s" is watching foot ball match of $teamName")
  }

  //  private [this] 这个只能在当前的Class内部使用
  private [this] val gender = "male"

  def printInfo(): Unit = {
    println("the person's gender is " + gender)
  }
}
