package com.laibao.chapter04

/**
  *  @author laibao wang
  *  @version 1.0
  */
class ScalaCar(val year: Int, val brand: String, val manufacturer: String){

    private var miles: Int = _

    def milesDriven(): Int = miles;

    def drive(distance: Int): Unit = {
        miles += distance
    }
}
