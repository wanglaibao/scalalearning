package com.laibao.chapter04.singletonexample

/**
  * @author laibao wang
  */
object MarkerFactoryTest {

  def main(args: Array[String]): Unit = {
    val marker1:Marker = MarkerFactory getMarker "red"
    println(marker1)
    println()

    val marker2:Marker = MarkerFactory getMarker "green"
    println(marker2)
    println()

    val marker3:Marker = MarkerFactory.getMarker("blue")
    println(marker3)
    println()

  }
}
