package com.laibao.chapter04.staticexample

/**
  * @author laibao wang
  */
class Marker private (val color:String) {
  println("Creating "+this)

  override def toString: String = "marker color is "+color
}

object Marker {
  private val markers:Map[String,Marker] = Map("red" -> new Marker("red"),
    "green" -> new Marker("green"),
    "blue" -> new Marker("blue"))


  def getPrimaryColors:String = "red,green,blue"


  def apply(color:String):Marker = if (markers.contains(color)) markers(color) else null


  def main(args: Array[String]): Unit = {
    println(Marker.getPrimaryColors)

    val marker1:Marker = Marker("red")
    println(marker1)
    println()

    val marker2:Marker = Marker("green")
    println(marker2)
    println()

    val marker3:Marker = Marker("blue")
    println(marker3)
    println()
  }
}
