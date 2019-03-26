package org.dean.snail.core

import math._

object FunctionHandler {
  def main(args: Array[String]): Unit = {
    println(sqrt(2))
    println(pow(2, 4))
    println(min(3, Pi))
    println(decorate("hello"))
    println(decorate("hello", "[", "]"))
    println(decorate1(str = "scala", right = "}"))
    println(sum(1, 2, 3))
    println(sum(1, 2))
    println(recursiveSum(1, 2, 3, 4, 5))
    countdown(10)
  }

  def countdown(n: Int): Unit ={
    println("start of countdown function>>>")
    for ( i<- n until 0 by -1){
      println(i)
    }
    println("end of countdown function>>>")
  }

  /**
    * 默认参数
    *
    * @param str
    * @param left
    * @param right
    * @return
    */
  def decorate(str: String, left: String = "<<<<", right: String = ">>>") =
    left + str + right

  /**
    * 指定参数名称
    *
    * @param left
    * @param str
    * @param right
    * @return
    */
  def decorate1(left: String = "<<<<", str: String, right: String = ">>>") =
    left + str + right

  /**
    * 变长参数
    *
    * @param args
    * @return
    */
  def sum(args: Int*): Int = {
    var result: Int = 0
    for (arg <- args) result += arg
    result
  }

  /**
    * 使用_*代表入参为一个序列
    *
    * @param args
    * @return
    */
  def recursiveSum(args: Int*): Int = {
    if (args.length == 0) 0
    else args.head + recursiveSum(args.tail: _*)
  }
}
