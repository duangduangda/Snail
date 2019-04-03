package org.dean.snail.core
import scala.collection.mutable

/**
 * @description: set
 * @author: dean 
 * @create: 2019/04/02 13:28 
 */
object SetHandler {

  def main(args: Array[String]): Unit = {
    val set = mutable.Set(1,2,2,2,3)
    println(set)
    println(set.getClass.getName)
    set += 4
    println(set)
    println(set.getClass.getName)
    set.add(5)
    println(set)
    set.remove(2)
    println(set)
    println(set.max)
    println(set.min)
    println(set.head)
    println(set.tail)
    println(set.isEmpty)
    set += (10)
    println(set)
    val set1 = mutable.Set(7,8,9,0)
    println(set.intersect(set1))
    set ++= set1
    println(set)
    println(set.diff(set1))
    println(set.apply(3))
    // 返回所有的元素，除了最后一个
    println(set.init)
    println(set.init ++ set.tail)
    // 查询不可变集合中满足指定条件的所有元素
    println(set.filter(p => p % 2 == 0))
    println(set.find(p=>p > 3))
  }

}
