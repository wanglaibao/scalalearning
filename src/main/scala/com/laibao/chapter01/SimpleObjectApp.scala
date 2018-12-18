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

    val zheDaPerson = new ZheDaPerson("浙大人",120,"应用物理")
    println(s"name is ${zheDaPerson.name} and age is ${zheDaPerson.age} and major is  ${zheDaPerson.major}")

  }
}

class Person ( val name:String,val age:Int){

  println("Person Constructor enter")

  val sex:String = "asfdsafd"

  var address:String = _

  println("Person Constructor leave")

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

class ZheDaPerson(name:String,age:Int,val major:String) extends Person(name,age) {

  println("ZheDaPerson Constructor enter")

  override val sex:String = "assadfasdffdsafd"

  println("ZheDaPerson Constructor leave")

  override def toString: String = "asfasfdasf"


}
