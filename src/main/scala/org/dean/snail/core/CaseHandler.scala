package org.dean.snail.core

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/03 16:21
  */
object CaseHandler {
  def matchTest1(x: Int): Unit = x match {
    case 1 => println("one")
    case 2 => println("two")
    case _ => println("any")
  }

  def matchTest2(data: Any): Unit = data match {
    case 3     => println("this is a num")
    case "one" => println("i am a string")
    case _     => println("I don't know what this is ")
  }

  def caseClassTest: Unit ={
    val eric = new Person("Eric",20)
    val duang = new Person("Duang",19)
    val selina = new Person("Selina", 18)
    val nobody = new Person("",-1)
    for (person <- List(eric,duang,selina,nobody)){
      person match {
        case Person("Eric",20) => println("I am eric")
        case Person("Duang",19) => println("I am duang")
        case Person("Selina",18) => println("I am selina")
        case _ => println("Illegal person instance")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    matchTest1(3)
    matchTest2("one")
    matchTest2(3)
    matchTest2("*")
    caseClassTest
  }

  // case class
  case class Person(name:String,age:Int)
}
