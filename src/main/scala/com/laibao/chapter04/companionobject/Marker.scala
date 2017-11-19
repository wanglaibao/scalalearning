package com.laibao.chapter04.companionobject

import com.laibao.chapter04.singletonexample.{Marker, MarkerFactory}

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

  def getMarker(color:String):Marker = if (markers.contains(color)) markers(color) else null


  def main(args: Array[String]): Unit = {
    val marker1:Marker = Marker getMarker "red"
    println(marker1)
    println()

    val marker2:Marker = Marker getMarker "green"
    println(marker2)
    println()

    val marker3:Marker = Marker.getMarker("blue")
    println(marker3)
    println()
  }
}
