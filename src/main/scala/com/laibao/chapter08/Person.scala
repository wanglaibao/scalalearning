package com.laibao.chapter08

/**
  * @author laibao wang
  */
class Person private (val firstName:String,val lastName:String)

object Person{
  def apply(firstName: String, lastName: String) : Person = new Person(firstName,lastName)
}
