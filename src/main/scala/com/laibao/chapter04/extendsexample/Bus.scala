package com.laibao.chapter04.extendsexample

/**
  * @author laibao wang
  */
class Bus (override val id:Int,override val year:Int,val fuelLevel:Int) extends Vehicle(id,year){

  override def toString: String = super.toString + "fuelLevel is "+fuelLevel

  override def run(){
    println("Bus is running!")
  }

  override def stop(){
    println("Bus is stopping")
  }

  override def startOn(){
    println("Bus is startint on!")
  }
}
