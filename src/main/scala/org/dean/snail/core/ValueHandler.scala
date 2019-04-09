package org.dean.snail.core

/**
  * @description: 求值策略
  * @author: dean
  * @create: 2019/04/08 23:39
  */
object ValueHandler {
  // call by value(对实参进行表达式求值，而且仅求一次)
  def test1(x: Int, y: Int) = x * x
  // call by name（函数实参每次在函数体内被用到时都会求值）
  def test2(x: => Int, y: => Int) = x * x

  def main(args: Array[String]): Unit = {
    println(test1(3 + 4, 8))
    println(test2(3 + 4, 8))
    println(test1(7, 2 * 4))
    println(test2(7, 2 * 4))
  }

}
