package org.dean.snail.core

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/09 00:05
  */
object sumFunc {
  def main(args: Array[String]): Unit = {
    sum(x => x)(1)(5)
    sum(x => x * x)(1)(5)
  }

  def sum(f: Int => Int)(a: Int)(b: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, acc: Int): Int = {
      if (n > b) {
        println(s"n = ${n},acc = ${acc}")
        acc
      } else {
        println(s"n = ${n},acc = ${acc}")
        loop(n + 1, acc + f(n))
      }
    }
    loop(a, 0)
  }
}
