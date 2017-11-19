package com.laibao.chapter04.singletonexample

/**
  * @author laibao wang
  */
object MarkerFactory {

  private val markers:Map[String,Marker] = Map("red" -> new Marker("red"),
                                                "green" -> new Marker("green"),
                                                "blue" -> new Marker("blue"))

  def getMarker(color:String):Marker = if(markers.contains(color)) markers(color) else null
}
