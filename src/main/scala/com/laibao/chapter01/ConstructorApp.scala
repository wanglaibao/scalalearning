package com.laibao.chapter01


object ConstructorApp {

  def main(args: Array[String]): Unit = {
    val student = new Student("jinge",120)
    println(s"name is ${student.name} and age is ${student.age} and school is  ${student.school}")
  }
}
// major constructor
class Student (val name:String,val age:Int){
  println("Student Constructor enter")
  val school = "ustc"
  println("Student Constructor leave")

  var gender:String = _

  // minor constructor
  def this() = this("金戈",30)

  // minor constructor
  def this(name:String,age:Int,gender:String) {
    this(name,age)
    this.gender = gender
  }

}
