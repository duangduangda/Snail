package org.dean.snail.core

import math._
import scala.io.StdIn
import util.control.Breaks._
import scala.io.Source

object LogicalControlHandler {

  def main(args: Array[String]): Unit = {
    condition(9)
    statement_break
    statement_continue
    statement_return
    block_setting_value(2, 3, 4, 5)
    input_output
    loop
    high_level_for_statement_1
    high_level_for_statement_2
    high_level_for_statement_3
    high_level_for_statement_4
    function_handler
    lazy_value
    exception_handler
  }

  def exception_handler: Unit = {
    try {
      val n = 1 / 0
      println(n)
    } catch {
      case ex: RuntimeException => ex.printStackTrace
      case _: Exception         => println("Exception>>>>>>>>>>>>>")
    }
  }

  def lazy_value: Unit = {
    println("start lazy value>>>>>")
    lazy val words = Source.fromFile("/usr/dean")
    println(words)
    println("end of lazy value>>>>")
  }

  def function_handler: Unit = {
    println("function handler>>>>>>>")
    def abs(x: Double) = if (x >= 0) x else -x
    println(abs(-1))
    println("end of function handler>>>>>>>")
  }

  def high_level_for_statement_1: Unit = {
    println("high level for statement1>>>>>>>>")
    for (i <- 1 to 3; j <- 1 to 3)
      print((10 * i + j) + "  ")
    println()
    println("end of high level for statement1>>>>>>")
  }

  def high_level_for_statement_2: Unit = {
    println("high level for statement2>>>>>>>>")
    for (i <- 1 to 3; j <- 1 to 3; if i != j)
      print((10 * i + j) + "  ")
    println()
    println("end of high level for statement2>>>>>>")
  }

  def high_level_for_statement_3: Unit = {
    println("high level for statement3>>>>>>>>")
    for (i <- 1 to 3; from = 4 - i; j <- from to 3)
      print((10 * i + j) + "  ")
    println()
    println("end of high level for statement3>>>>>>")
  }

  def high_level_for_statement_4: Unit = {
    println("high level for statement4>>>>>>>>")
    for (i <- 1 to 10)
      yield i % 3
    println()
    println("end of high level for statement4>>>>>>")
  }

  def loop: Unit = {
    var n = 1
    println("while loop>>>>>>>>>>>")
    while (n < 5) {
      println(n)
      n += 1
    }
    println("for loop>>>>>>>>>")
    for (i <- 1 to 5) {
      println(i)
    }
    println("until loop>>>>>")
    val s = "Hello"
    var sum = 0
    for (i <- 0 until s.length)
      sum += s(i)
    println(sum)

  }

  def input_output(): Unit = {
    val name = StdIn.readLine("Your Name:")
    println(s"your name is :${name}")
  }

  def condition(x: Int): Unit = {
    val s = if (x > 0) 1 else -1
    println(s)
    val s1 = if (x > 0) "hello" else -1
    println(s1)
  }

  def statement_continue: Unit = {
    println("replace continue statement with breakable statement>>>>>>>>")
    for (i <- 1 to 5) {
      breakable(
        if (i % 2 == 0) break
        else println(i)
      )
    }
    println(
      "end of replacing continue statement with breakable statement>>>>>>>>"
    )
  }

  def statement_break: Unit = {
    println("replace break statement with breakable statement >>>>>")
    breakable(for (i <- 1 to 5) {
      if (i % 2 == 0) break
      println(i)
    })
    println("end of replacing break statement with breakable statement")
  }

  def statement_return: Unit = {
    println("using return statement>>>>>")
    for (i <- 1 to 5) {
      if (i == 2)
        return
      println(i)
    }
    println("end of using return statement>>>")
  }

  def block_setting_value(x: Int, x0: Int, y: Int, y0: Int): Unit = {
    val distance = { val dx = x - x0; val dy = y - y0; sqrt(dx * dx + dy * dy) }
    println(distance)
  }
}
