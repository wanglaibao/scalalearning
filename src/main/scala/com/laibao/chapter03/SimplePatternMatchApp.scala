package com.laibao.chapter03

import scala.util.Random

object SimplePatternMatchApp extends App{

  val names:Array[String] = Array("jinge","alading","qiancheng")

  val name = names(Random.nextInt(names.length))

  name match {
      case "jinge" => println("金戈")
      case "alading" => println("阿拉丁")
      case "qiancheng" => println("前程")
      case _ => println("一个都不认识啊")
  }

  judgeGrade("A")
  println()
  judgeGrade("B")
  println()
  judgeGrade("C")
  println()
  judgeGrade("D")
  println()
  judgeGrade("FFFF")

  def judgeGrade(level:String): Unit = {
      level match {
        case "A" => println("很棒啊")
        case "B" => println("不错啊")
        case "C" => println("还好啊")
        case "D" => println("哦要加油了啊")
        case _ => println("你怎么搞的啊")
      }
  }
}
