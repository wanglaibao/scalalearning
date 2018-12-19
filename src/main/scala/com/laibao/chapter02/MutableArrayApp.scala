package com.laibao.chapter02
import scala.collection.mutable.ArrayBuffer
object MutableArrayApp extends App{
  val d = ArrayBuffer[Int]()
  println(d.length)
  d += 1
  d += 2
  d += 3
  d += 4
  d += 5
  d += 6
  d += 7
  d += 8
  d += 9
  d += 10
  println(d)
  for (element <- d) {
    println(element)
  }
  println(d)
  println()
  d += (11,12,13,14,15,16,17,18,19,20)
  for (element <- d) {
    println(element)
  }
  println(d)
  println()

  d ++= Array(100,200,300,400)
  for (element <- d) {
    println(element)
  }

  d.insert(0,100000)
  for (element <- d) {
    println(element)
  }
  println()
  println()
  d.remove(0)
  for (element <- d) {
    println(element)
  }

  d.remove(0,3)
  println(d)

  d.trimEnd(2)
  println(d)

  val e = d.toArray
  for (element <- e) {
    println(element)
  }

  println()
  println(e.mkString)

  for (element <- 0 until e.length) {
    println(e(element))
  }
  println()

  for (element <- 0 to e.length -1) {
    println(e(element))
  }

  val f = e.reverse
  for (element <- f) {
    println(element)
  }
}
