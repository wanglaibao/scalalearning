package com.laibao.chapter02

/**
  * Created by A on 2018/12/19.
  */
object ArrayApp {
  def main(args: Array[String]): Unit = {
    println("test")

    val a = new Array[String](5)  //元素的默认值都是null


    // 给数组的各个元素赋值
    a(0) = "aaa"
    a(1) = "bbb"
    a(2) = "ccc"
    a(3) = "ddd"
    a(4) = "eee"

    println(a.length)
    //通过循环取数组中的数值
    for (element <- a) {
      println(element)
    }
    println()
    println()
    val b = Array("hadoop","spark","flink","storm")
    for (element <- b) {
      println(element)
    }
    b(2) = "BigData"
    println()
    println()
    for (element <- b) {
      println(element)
    }

    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
    //b(4)
  }
}
