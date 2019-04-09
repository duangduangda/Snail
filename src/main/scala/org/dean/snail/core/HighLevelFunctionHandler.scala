package org.dean.snail.core

/**
  * @description: 高阶函数
  * @author: dean
  * @create: 2019/04/08 23:54
  */
object HighLevelFunctionHandler {

  def curriedAdd(i: Int)(j: Int) = i + j

  // 递归（存在堆栈溢出的风险）
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  //尾递归
  @annotation.tailrec
  def tailFactorail(n: Int, m: Int): Int =
    if (n <= 0) m
    else tailFactorail(n - 1, m * n)

  def main(args: Array[String]): Unit = {
    //柯里化
    println(curriedAdd(2)(3))
    //递归
    println(factorial(5))
    //尾递归
    println(tailFactorail(5, 1))
  }
}
