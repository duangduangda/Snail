package org.dean.snail.core

/**
 * @description: 迭代器
 * @author: dean 
 * @create: 2019/04/02 18:46 
 */
object IteratorHandler {
  def main(args: Array[String]): Unit = {
    val it = Iterator("Baidu","AliBaba","Tencent")
    val numIt = Iterator(1,31,1,2,34,2)
    println(it.length)
    println(numIt.size)
    while (it.hasNext){
      println(it.next())
    }
    println(numIt.contains(2))

    println(numIt.max)
    println(numIt.min)
  }
}
