package com.laibao.chapter01

import scala.io.Source._

object LazyInitializeApp extends App{

  val filePath = "D:\\IdeaProjects\\git\\scalalearning\\src\\main\\scala\\com\\laibao\\chapter01\\AbstractClassApp.scala"

  //延时初始化
  lazy val fileInfo = fromFile(filePath).mkString

  println(s"the fileInfo is $fileInfo")

}
