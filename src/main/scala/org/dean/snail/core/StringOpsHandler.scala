package org.dean.snail.core

object StringOpsHandler {
  def main(args: Array[String]): Unit = {
    println("Hello".intersect("World"))
    println("Hello".distinct)
    println("Hello,Scala".distinct.apply(4))
    println(BigInt.apply("123") * BigInt.apply("34"))
    println("Hello".take(3))
    println("Hello".drop(1))
    println("Hello".takeRight(3))
    println("Hello".dropRight(1))
    println("Hello" * 3)
  }
}
