package org.dean.snail.core

/**
 * @description:
 * @author: dean 
 * @create: 2019/04/02 19:38 
 */
object ClassHandler {
  def main(args: Array[String]): Unit = {
    val point = new Point(10, 20)
    point.move(10,10)
    val location = new Location(10,20,15)
    location.move(10,10,5)

  }
}


