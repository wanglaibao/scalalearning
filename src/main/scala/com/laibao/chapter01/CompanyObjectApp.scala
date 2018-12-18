package com.laibao.chapter01

object CompanyObjectApp {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 100) {
      ApplyTest.incr
    }
    println(ApplyTest.getCount)

    val aaa = ApplyTest()  // 伴生对象里面的apply()函数的调用
    aaa.sayHello()

    println("----------------------")
    val bbb = new ApplyTest()
    println(bbb)
    bbb()

    // 类名()  ===> Object.apply()
    // 对象()  ===> Class.apply()
  }
}

class ApplyTest{

  def sayHello() = {
    println("Let us say hello")
    println("Let us say hello")
    println("Let us say hello")
    println("Let us say hello")
    println("Let us say hello")
  }

  //最佳实践 在Object 的apply里面进行 new Class
  def apply() = {
    println("Class ApplyTest apply")
  }
}

object ApplyTest {

  println("Object ApplyTest enter")

  private var count: Int = 0

  def incr = {
    count += 1
  }

  def getCount = count

  def apply(): ApplyTest = {
    println("Object ApplyTest apply")
    new ApplyTest()
  }

  println("Object ApplyTest leave")
}