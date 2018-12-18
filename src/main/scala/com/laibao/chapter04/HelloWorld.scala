package com.laibao.chapter04

object HelloWorld {
  def main(args: Array[String]): Unit = {
      println("this is the hello world scala example")

    val scalaCar:ScalaCar = new ScalaCar(2017,"jin ge","hang zhou")

    println(scalaCar.year)
    println()
    println(scalaCar.brand)
    println()
    println(scalaCar.manufacturer)
    println()
    scalaCar.drive(1000)
    println()
    println(scalaCar.milesDriven())


    new Sample

    val people = new People("wang","laibao","Programmer")
    println(people.getFirstName)
    println(people.getLastName)
    println(people.getPosition)


    val people1 = new People("mao","zedong")
    println(people1.getFirstName)
    println(people1.getLastName)
    println(people1.getPosition)
  }

  def sum(a:Int,b:Int):Int = a + b

  def sum(a:Int,b:Int,c:Int):Int = a + b + c

  def sum2(numbers:Int*):Int = {
    var result = 0
    for (number <- numbers) {
      result += number
    }
    result
  }
}
