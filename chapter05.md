#                                                      第五章  Scala类的初阶
##  一：序言
  本章主要介绍Scala中的单例对象,伴生类和伴生对象的有关知识以及Scala中类继承的基础知识。
  
##  二：单例对象
  单例指的是一个类在系统中有且只有一个实例对象，单例对象可以实现对象工厂之类的操作；
  Scala中创建单例对象十分简单，只需采用object关键词来定义一个类就可以了，无需使用class关键词。
  由于单例对象是无法初始化的，因此不可以给单例对象的主构造函数传替参数。
  
  首先我们定义一个Apple类
    
      class Apple(val color: String) {
      	println("Creating " + this)
      
      	override def toString(): String = {
      		"the color is " + color
      	}
      }
      
  接着我们实现一个单例对象AppleMaker来生产不同颜色的Apple
  
  object AppleMaker {
  	private val applesCache = Map(
  									"red" 		-> new Apple("red"),
  									"green" 	-> new Apple("green"),
  									"yellow"	-> new Apple("yellow"),
  									"orange"	-> new Apple("orange"),
  									"blue"		-> new apple("blue"),
  									"indigo"	-> new Apple("indigo"),
  									"purple"	-> new Apple("purple")
  								)
  												
  	def getAppleByColor(color: String): Apple = {
  		if(applesCache.contains(color)) 
  			applesCache()
  		else 
  			null
  	}
  }


  println(AppleMaker 	getAppleByColor "red")
  println(AppleMaker	getAppleByColor "green")
  println(AppleMaker	getAppleByColor "yellow")
  println(AppleMaker	getAppleByColor "orange")
  println(AppleMaker	getAppleByColor "blue")
  println(AppleMaker	getAppleByColor "indigo")
  println(AppleMaker	getAppleByColor "purple")
  println(AppleMaker	getAppleByColor "other color")

  编译并且运行上面的例子就可以得到如下的结果:
  E:\program_scala_learning\chapter5>scalac Apple.scala
  
  E:\program_scala_learning\chapter5>scala AppleMaker.scala
  Creating the color is red
  Creating the color is green
  Creating the color is yellow
  Creating the color is orange
  Creating the color is blue
  Creating the color is indigo
  Creating the color is purple
  the color is red
  the color is green
  the color is yellow
  the color is orange
  the color is blue
  the color is indigo
  the color is purple
  null
  
##  三：伴生类和伴生对象
  在Scala中存在另外一种单例对象，与类同名并且和类位于同一个文件中，这样的单例对象叫做伴生对象，类叫做伴生类。
  在Scala中，伴生类和伴生对象之间没有明显的界限，他们之间可以相互访问彼此的private字段和private方法，在有伴生对象的
  情况下，我们可以将伴生类的主构造函数定义为私有的，这样就可以屏蔽外界对伴生类的实例化了。
  我们可以用伴生类和伴生对象来改写上面的单例对象。
  
  class Apple private(val color: String) {
    	println("Creating " + this)
    
    	override def toString(): String = {
    		"the color is " + color
    	}
  }

  object Apple {
  	private var applesCache = Map(
  								"red"  		-> new Apple("red"),
  								"green"		-> new Apple("green"),
  								"yellow"	-> new Apple("yellow"),
  								"orange"	-> new Apple("orange"),
  								"blue"		-> new Apple("blue"),
  								"indigo"	-> new Apple("indigo"),
  								"purple"	-> new Apple("purple")	
  							)
  							
  	
  	def getAppleByColor(color: String): Apple = {
  		if(applesCache.contains(color))
  			applesCache(color)
  		else
  			null
  	}
  	
  } 
  
##  四：如何实现Java中的static方法和static字段
  我们知道相对于Java来说，Scala是一门更纯的面向对象的语言【pure object language】,在Scala语言中没有static filed or static method。
  但是Scala可以通过类的伴生对象来完成Java的static field or static method的功能。
  在Scala中，伴生对象里面的方法就是相当于Java语言类的static方法，参看下面的例子，来了解Scala是如何实现static的功能的。
  
  class Apple private(val color: String) {
  	println("Creating " + this)
  
  	override def toString(): String = {
  		"the color is " + color
  	}
  }

  object Apple {
  	
  	private var applesCache = Map(
  								"red"  		-> new Apple("red"),
  								"green"		-> new Apple("green"),
  								"yellow"	-> new Apple("yellow"),
  								"orange"	-> new Apple("orange"),
  								"blue"		-> new Apple("blue"),
  								"indigo"	-> new Apple("indigo"),
  								"purple"	-> new Apple("purple")	
  							)
  							
  	
  	def getPrimaryColors() : String = {
  		"red, green, yellow, orange, blue, indigo, purple"
  	}
  	
  	def apply(color: String): Apple = {
  		if(applesCache.contains(color))
  			applesCache(color)
  		else
  			null
  	}
  	
  } 
  
  println(Apple("red"))
  println(Apple("green"))
  println(Apple("yellow"))
  println(Apple("orange"))
  println(Apple("blue"))
  println(Apple("indigo"))
  println(Apple("purple"))
  println(Apple("other color"))
  println()
  println("primary colors are "+ Apple.getPrimaryColors())
  
  运行上面的代码，结果参看如下：
  
  E:\program_scala_learning\chapter5>scala Apple.scala
    Creating the color is red
    Creating the color is green
    Creating the color is yellow
    Creating the color is orange
    Creating the color is blue
    Creating the color is indigo
    Creating the color is purple
    the color is red
    the color is green
    the color is yellow
    the color is orange
    the color is blue
    the color is indigo
    the color is purple
    null
    
    primary colors are red, green, yellow, orange, blue, indigo, purple
  
    我们在伴生对象中定义了方法getPrimaryColors，这个方法就类似于Java中的static方法；伴生对象还有一个好处就是利用伴生对象来创建实例的
    时候没有必要使用new关键词了，我们可以通过apply()方法来完成对象实例的创建，这个特性是Scala语言提供的一个语法糖。该语法糖能够让对象
    实例的创建更容易。

##  五：Scala类之间的继承关系
  Scala中类的继承类似Java，类之间的继承语法也是通过extends关键字来实现的，不过与Java相比有两点要注意:
      1:子类覆盖父类方法【override mehtod】的时候,必须在方法名前加上override关键字
      2:Scala中只有主构造函数才能够向基类的构造函数传替参数
      
  Scala的副构造函数必须调用主构造函数或者另外的副构造函数,只有主构造函数才可以向基类的主构造函数传替参数,主构造函数就类似于
  一道关卡。
  
  
  
  
  
                                                      
