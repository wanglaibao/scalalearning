package com.laibao.chapter04.extendsexample

/**
  * @author laibao wang
  */
object VehicleTest {

  def main(args: Array[String]): Unit = {
     val vehicle = new Vehicle(1,1900)
     println(vehicle.id)
     println(vehicle.year)
     println(vehicle.startOn())
     println(vehicle.run())
     println(vehicle.stop())
     println()

     val car = new Car(2,1901,2)
      println(car.id)
      println(car.year)
      println(car.fuelLevel)
      println(car.startOn())
      println(car.run())
      println(car.stop())
      println()


     val bus = new Bus(3,1903,3)
     println(bus.id)
     println(bus.year)
     println(bus.fuelLevel)
     println(bus.startOn())
     println(bus.run())
     println(bus.stop())
     println()
  }

}
