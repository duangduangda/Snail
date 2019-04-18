package org.dean.snail.core.pattern

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/18 11:09
  */
object MatchHandler {
  def main(args: Array[String]): Unit = {
    example1()
    example2()
    example3()
  }

  // 字符模式匹配+守卫
  def example1() = {
    val ch = '1'
    ch match {
      case '+' => println("add")
      case '-' => println("substract")
      case '*' => println("multiple")
      case _ if Character.isDigit(ch) =>
        println(Character.digit(ch, 10)) //guard
      case _ => println(ch)
    }
  }

  // 列表模式匹配
  def example2() = {
    val list1 = List(0)
    val list2 = List(2, 3)
    val list3 = List(0, 1, 2, 3)
    val list4 = List(1, 2, 3, 3, 4)
    val result = list4 match {
      case 0 :: Nil  => "0"
      case 0 :: tail => "0...."
      case x :: y    => x + "  " + y
      case _         => "something else"
    }
    println(result)
  }

  def example3() = {
    val pair = (1, 0)
    val result = pair match {
      case (0, x) => "0 ..."
      case (y, 0) => y + " 0"
      case _      => "neither is 0"
    }
    println(result)
  }

}
