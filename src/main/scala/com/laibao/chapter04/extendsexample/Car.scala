package com.laibao.chapter04.extendsexample

/**
  * @author laibao wang
  */
class Car (id:Int,year:Int,val fuelLevel:Int) extends Vehicle(id,year) {

  override def toString: String = super.toString + "fuelLevel is "+fuelLevel

  override def run(){
    println("Car is running!")
  }

  override def stop() {
    println("Car is stopping")
  }

  override def startOn(){
    println("Car is startint on!")
  }

}
