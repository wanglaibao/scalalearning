package com.laibao.chapter04.singletonexample

/**
  * @author laibao wang
  */
class Marker (val color:String){
  println("Creating "+this)

  override def toString: String = "marker color is "+color
}
