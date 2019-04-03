package org.dean.snail.core

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/03 10:32
  */
class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("(x,y,z) = (" + x + "," + y + "," + z + ")")
  }
}
