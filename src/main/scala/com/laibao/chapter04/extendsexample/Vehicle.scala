package com.laibao.chapter04.extendsexample

/**
  * @author laibao wang
  */
class Vehicle (val id:Int,val year:Int) {

  override def toString: String = super.toString

  def startOn(){
      println("vehicle is startint on!")
  }

  def run(){
      println("vehicle is running!")
  }

  def stop (){
     println("vehicle is stopping")
  }

}
