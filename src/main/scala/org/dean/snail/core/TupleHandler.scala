package org.dean.snail.core

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/03 20:03
  */
object TupleHandler {
  def main(args: Array[String]): Unit = {
    val tuple1 = Tuple2[Int, String](1, "eric")
    getElementValue(tuple1)
    listElement(tuple1)
    convertToString(tuple1)
    swapElement(tuple1)
  }

  def swapElement(tuple: (Int, String)): Unit = {
    println("交换前元组为：" + tuple)
    println("交换后元组为：" + tuple.swap)
  }

  def convertToString(tuple: (Int, String)): Unit = {
    println(tuple.toString())
  }

  def listElement(tuple: (Int, String)): Unit = {
    tuple.productIterator.foreach(x => println(x))
  }

  def getElementValue(tuple: (Int, String)): Unit = {
    println(tuple._1)
    println(tuple._2)
  }

}
