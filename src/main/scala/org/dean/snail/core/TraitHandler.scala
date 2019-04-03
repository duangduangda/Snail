package org.dean.snail.core

/**
 * @description: 特征。相当于java接口，但是可以定义属性和方法的实现
 * @author: dean 
 * @create: 2019/04/03 10:44 
 */
object TraitHandler {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(2,3)
    val p2 = new Point(2,3)
    val p3 = new Point(2,4)

    println(p1.isEqual(p2))
    println(p1.isEqual(p3))
    println(p2.isNotEqual(p3))
  }
}
