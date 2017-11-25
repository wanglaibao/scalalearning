package com.laibao.chapter08

/**
  * @author laibao wang
  */
object UsingSet {

  def main(args: Array[String]): Unit = {
    val feed1 = Set("blog.toolshed.com","pragdave.pragprog.com","pragmactic-osxer.blogspot.com","vita-contempativa.blogspot.com")

    val feed2 = Set("blog.toolshed.com","martainflower.com/bliki")

    //1: 循环打印
    feed1.foreach(element => println(element))
    feed2.foreach(element => println(element))

    //2: 筛选符合条件的数据记录
    val filterFeed = feed1.filter(_.contains("blogspot"))
    filterFeed.foreach(element => println(element))

    //3: mkString
    println(feed1.mkString(", "))

    //4: 集合合并 并集
    val mergedFeed = feed1.++(feed2)
    println(mergedFeed.size)
    mergedFeed.foreach(element => println(element))
    mergedFeed.map(element => element.toUpperCase()).foreach(element => println(element))



    //5:集合交集
    val commonFeed = feed1.&(feed2)
    println(commonFeed.size)
    commonFeed.foreach(element => println(element))

    //6 map
    val urlFeed = feed1.map("https://"+_)
    urlFeed.foreach(element => println(element))

    val strArray = urlFeed.toArray
    for(i <- 0 to strArray.length -1 ) {
      println(strArray(i))
    }

  }
}
