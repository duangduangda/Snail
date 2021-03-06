package org.dean.snail.core

/**
  * @description: 类
  * @author: dean
  * @create: 2019/04/02 19:39
  */
class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = x + dy
    println("(x,y) = (" + x + "," + y + ")")
  }

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x &&
      obj.asInstanceOf[Point].y == y
  }
}
