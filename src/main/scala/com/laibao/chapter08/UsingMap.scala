package com.laibao.chapter08

/**
  * @author laibao wang
  */
object UsingMap {

  def main(args: Array[String]): Unit = {
      val feeds:Map[String,String] = Map("Andy Hunt" -> "blog.toolshed.com",
                                        "Dave Thomas" -> "pragdave.pragprog.com",
                                        "Dan Steinberg" -> "pragmactic-osxer.blogspot.com",
                                        "Martain Flower "-> "vita-contempativa.blogspot.com")


      feeds.foreach{case (key,value) => println(key+" , "+value)}
      println()
      feeds.keySet.foreach(key => println(feeds(key)))
      println()
      feeds.values.foreach(value => println(value))
      println()
      val feedsNameStartWithD = feeds.filterKeys(_ startsWith("D"))
      println()
      feedsNameStartWithD.foreach{case (key,value) => println(value)}

      val feeds1 = feeds.filter{case (key,value) => key.startsWith("D") && value.contains("blogspot")}
      feeds1.values.foreach(value => println(value))
      println()
      println()
      println()
      val blogUrl = feeds.getOrElse("Andy Hunt","Wanglaibao")
     println("blogUrl: "+blogUrl)

     val blog = feeds.get("Dave Thomas")

     if (!blog.isEmpty) {
       println(blog.get)
     } else {
       println("none")
     }
     try{
          val url = feeds("wanglaibao")
     }catch {
       case ex: java.util.NoSuchElementException => println("afdasfdafda")
     }
  }
}
