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

  }
}
