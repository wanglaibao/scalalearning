#                                                          第四章 Scala类的基础知识
##  一：序言
    本章的学习主要比较Java和Scala在创建类方面的差异，首先从一个简单的Java类开始，接着将该Java类转换成Scala类，看看Scala是如何简化类的创建的。
    接下来学习Scala创业类方面的知识点。
  
##  二：创建类
  Student.java
  
  public class Student {
  
  
	private String name;
	private int age;
	private String address;
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
    }
    
    Student.scala
    
    class Student(var name: String, var age: Int, var address: String)
    
    从上面的Student.java 和 Student.scala 对比中，我们可以看出Scala大大降低了代码量，通常一个同样功能由Scala来实现的话，其代码量
    
    一般为Java实现代码量的一半以下。因此Scala还是值得我们这些Java屌丝学习的。
    
    在上面的Student.scala的定义中，我们可以猜想到Scala能够将构造函数中的参数定义成类中的字段，并且生成对应的getXXX 和 setXXX方法。
    
 
## 三：Scala类的定义
     从上面的Student.scala的定义中，我们可以看出Scala定义一个类是很简单的事情，Scala将主构造函数【Primary Constructor】放在类的定义，
     让我们定义字段和对应的getXXX,setXXX方法变得很简单。类定义看上去很简单，但是背后隐含了很多信息，下面我们通过编译和反编译看看背后的
     秘密。
     
     
     
     	E:\program_scala_learning\chapter4>scalac Student.scala



	E:\program_scala_learning\chapter4>javap -private Student
	Compiled from "Student.scala"
	public class Student {
	  private java.lang.String name;
	  private int age;
	  private java.lang.String address;
	  public java.lang.String name();
	  public void name_$eq(java.lang.String);
	  public int age();
	  public void age_$eq(int);
	  public java.lang.String address();
	  public void address_$eq(java.lang.String);
	  public Student(java.lang.String, int, java.lang.String);
	}
     
     
     
     1： Scala将会把这个类变成public的，在Scala中，任何没有标记为private,protected的数据默认都是public的；
     
     
     2： 主构造函数中var定义的变量，会在类中定义成private的字段，并且有对应的public getXXX,setXXX方法，【例如Student.scala中name字段的
          定义】
          	  private java.lang.String name;
	          public java.lang.String name();
	          public void name_$eq(java.lang.String);
		  
	          
     3： 主构造函数中val定义的变量，会在类中定义成private final的字段，并且有对应的public getXXX方法，【例如Teacher.scala中name字段的
          定义】
          	 
		 
		 class Teacher(val name: String, val age: Int, val address: String)
          	 
          	  E:\program_scala_learning\chapter4>javap -private Teacher
		  Compiled from "Teacher.scala"
		  public class Teacher {
		   private final java.lang.String name;
		   public java.lang.String name();
		   public Teacher(java.lang.String, int, java.lang.String);
		  }
		  
		  
		  
     4: 主构造函数中如果参数既没有被val修饰也没有被var修饰的话，Scala就会创建一个private类型的字段以及private的getXXX,setXXX,
        这样外界就无法访问了。
        
	
	
     5: 位于类中定义的任何表达式或者可执行语句都是主构造函数定义的一部分执行。例如下面的例子
     
     
     
     	class Sample{
		println("I am creating an instance of Sample class")
	}



	new Sample

	E:\program_scala_learning\chapter4>scala Sample.scala
	I am creating an instance of Sample class
        
	
	
## 四：副构造函数和类中定义变量
 除了在主构造函数里面定义变量以外，我们还可以在类里面定义其他字段和定义方法，还可以定义一个或者多个副构造函数【this() or this(param1, param2,param3)】。
 参考下面的Person.scala类
 
 
 
	 class Person(val firstName: String, val lastName: String) {
		var age: Int = _
		
		var position: String = _
		
		def this(firstName: String, lastName: String, age: Int) {
			this(firstName, lastName)
			this.age = age
		}
	
		override def toString(): String = {
			firstName + " " + lastName + " is " + age + " old , and hold " + position +" position"  
		}
	
	}
	
	
	
我们对他进行编译和反编译看看内部的本质吧



	E:\program_scala_learning\chapter4>javap -private Person
	Compiled from "Person.scala"
	public class Person {
	  private final java.lang.String firstName;
	  private final java.lang.String lastName;
	  private int age;
	  private java.lang.String position;
	  public java.lang.String firstName();
	  public java.lang.String lastName();
	  public int age();
	  public void age_$eq(int);
	  public java.lang.String position();
	  public void position_$eq(java.lang.String);
	  public java.lang.String toString();
	  public Person(java.lang.String, java.lang.String);
	  public Person(java.lang.String, java.lang.String, int);
	}
 
 我们可以看到在类里面定义的var age, var position变量，会被自动加上private修饰符，并且提供了对应的public getXXX, setXXX
 
  	  private int age;
	  public int age();
	  public void age_$eq(int);
 可以看出，这个跟在主构造函数里面进行定义是一致的。一旦我们给age和position加上private修饰符如下所示：
 	  private var age: Int = _
		
	  private var position: String = _
 此时，我们进行反编译，看看如何
 	public class Person {
	  private final java.lang.String firstName;
	  private final java.lang.String lastName;
	  private int age;
	  private java.lang.String position;
	  public java.lang.String firstName();
	  public java.lang.String lastName();
	  private int age();
	  private void age_$eq(int);
	  private java.lang.String position();
	  private void position_$eq(java.lang.String);
	  public java.lang.String toString();
	  public Person(java.lang.String, java.lang.String);
	  public Person(java.lang.String, java.lang.String, int);
	}
  此时，age, position字段的getXXX,setXXX都变成了private了，外界就无法访问了。
  
  另外对副构造函数来说，我们要特别注意：副构造函数内的第一条语句必须调用主构造函数或者其他副构造函数，二者必须其一；
  还有一点要注意：我们在类里面用下划线“_”来定义age,position变量，这个“_”表示他们的默认值，对Int类型来说，默认值是0,
  对Double类型来说，默认值是0.0,对Boolean类型来说，默认值是false,对引用类型来说，其默认值为null;
  
  但是在Scala中，只能用"_"来初始化var类型的变量，无法初始化val类型的变量，因为val类型的变量无法修改的。
  
## 五：迎合JavaBean风格的getXXX,setXXX


   到目前为止我们看到Scala类中的getXXX,setXXX方法，跟我们比较熟悉的JavaBean风格的有很大差异；
   我们可以通过 Scala.beans.Property 注解实现具有JavaBean风格的getXXX,setXXX, 请看下面的例子：
   
   	import scala.beans.BeanProperty

	class Human(@BeanProperty var firstName: String,
	             @BeanProperty var lastName: String) {
				 
		@BeanProperty
		var age: Int = _
		
		@BeanProperty
		var position: String = _
		
		
		override def toString(): String = {
			firstName+" "+lastName+" "+age+" old and hold "+position+" position"
		}
	}
	
	
	接下来我们看看反编译之后的结果吧：
	
	E:\program_scala_learning\chapter4>scalac Human.scala

	E:\program_scala_learning\chapter4>javap -p Human
	Compiled from "Human.scala"
	public class Human {
	  private java.lang.String firstName;
	  private java.lang.String lastName;
	  private int age;
	  private java.lang.String position;
	  public java.lang.String firstName();
	  public void firstName_$eq(java.lang.String);
	  public void setFirstName(java.lang.String);
	  public java.lang.String lastName();
	  public void lastName_$eq(java.lang.String);
	  public void setLastName(java.lang.String);
	  public int age();
	  public void age_$eq(int);
	  public void setAge(int);
	  public java.lang.String position();
	  public void position_$eq(java.lang.String);
	  public void setPosition(java.lang.String);
	  public java.lang.String toString();
	  public java.lang.String getFirstName();
	  public java.lang.String getLastName();
	  public int getAge();
	  public java.lang.String getPosition();
	  public Human(java.lang.String, java.lang.String);
	}
	   
   
  	从上面的结果中，我们看到了只要给Scala的字段添加@scala.beans.Property注解，我们就可以实现按照Java风格的getXXX和setXXX了，
  	
  	这样可以方便我们在Java代码中使用Scala的代码。
 
        
     
     
     
     



