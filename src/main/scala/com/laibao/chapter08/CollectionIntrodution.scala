package com.laibao.chapter08

/**
  * @author laibao wang
  */
class CollectionIntrodution private (){

    def createIntSet():Set[Int] = Set(1,2,3,4,5,6)

    private def createStringSet():Set[String] = Set("A","B","C")

    def createPersonSet():Set[Person] = Set(Person("wang","dabao"),Person("wang","xiaobao"),Person("wang","laobao"))

    def createIntList():List[Int] = List(100,200,300,400,500,600,700,800,900,1000)

    def createStringList():List[String] = List("A","B","C","D","E","F","G","H","I","J")

    def createPersonList():List[Person] = List(Person("wang","dabao"),Person("wang","xiaobao"),Person("wang","laobao"),Person("wang","laobao"))

    def createIntMap():Map[Int,Int] = Map(1 -> 1,2 -> 2,3 -> 3,4 -> 4,5 -> 5,6 -> 6)

    def createStringMap():Map[String,String] = Map("A" -> "wanglaibao","B" -> "xiaolaibao","C" -> "panxiaoming")

    def createPersonMap():Map[String,Person] = Map("A" -> Person("wang","dabao"),"B" -> Person("wang","xiaobao"),"C" -> Person("wang","laobao"))
}

object CollectionIntrodution {

  def main(args: Array[String]): Unit = {

    val collectionIntrodution = new CollectionIntrodution()

    val strSet = collectionIntrodution.createStringSet()
    strSet.foreach(str => println(str))
    strSet.map(str => str.toLowerCase).foreach(str => println(str))

    val intSet = collectionIntrodution.createIntList()
    intSet.map(value => value * 10).foreach(value => println(value))

    val strList = collectionIntrodution.createStringList()
    strList.foreach(str => println(str))
    strList.map(str => str+"...").foreach(str => println(str))

    val strMap = collectionIntrodution.createStringMap()
    strMap.foreach{case (key,value) => println(value)}
    strMap.foreach{case (key: String, value: String) => println(">>> key=" + key + ", value=" + value)}
    strMap.foreach((element:(String,String)) => println(element._1 + "=" + element._2))
  }

}
