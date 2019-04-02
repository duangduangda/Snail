package org.dean.snail.core
import collection.mutable.ArrayBuffer
import util.Sorting._

/**
 * @description: 数组操作
 * @author: dean 
 * @create: 2019/03/26 13:18 
 */
object ArrayHandler {
  def main(args: Array[String]): Unit = {
    array_initial
    array_buffer
    array_transfer
    array_trim_end
    array_calculate
    multiple_dim_array
    random_num(8)
    replace_num_loop
    array_distinct
  }

  def array_distinct: Unit ={
    println("array distinct>>>>>>")
    val a = Array(1,2,1,2,3,4,3,4,5)
    val b = a.distinct
    output_array(b)
    output_array(b.reverse)
  }

  def replace_num_loop: Unit ={
    val a = Array(1,2,3,4,5)
    for (i <- 0 until a.length){
    }
  }

  def random_num(n: Int): Unit ={
    val a = new Array[Int](n)

  }

  def multiple_dim_array: Unit = {
    println("multiple_dim_array>>>>>>>>>>>>>>>")
    val matrix = Array.ofDim[Double](3,4)
    matrix(0)(1) = 22
    matrix(1)(3) = 12
    for (i <- 0 until 3){
      for (j <- 0 until 4){
        print(matrix(i)(j) + "  ")
      }
      println()
    }
    println("triangle ")
  }

  def array_calculate: Unit ={
    println("array_sum>>>>>>>>>>")
    val b = Array(1,2,5,3,4)
    println(b.sum)
    println(b.max)
    println(b.min)
    println(b.take(2).last)
    println("make a quick sort>>>>>")
    quickSort(b)
    output_array(b)
    println(b.mkString(">"))
  }

  def array_trim_end: Unit ={
    val  b = ArrayBuffer(1, -1, 2,3,4,8)
    var first = true
    val indexes = for (i <- 0 until b.length if first || b(i) >= 0) yield {
     if (b(i) < 0) first = false
      i
    }

    for (j <- 0 until indexes.length) {
      b(j) = b(indexes(j))
      b.trimEnd(b.length - indexes.length)
    }
    println(b.last)
  }

  def array_transfer: Unit ={
    val a = Array(2, 3, 5, 7,11)
    for (elem <- a)
      yield 2 * elem
  }

  def array_buffer: Unit ={
    println("start array buffer>>>>")
    val b = ArrayBuffer[Int]()
    println(b)
    b += 1
    println(b.last)
    println("b+=>>>>>>>>>>>>>>")
    b += (1, 2, 3, 4, 5)
    println(b.last)
    output_array(b.toArray)
    println("b++=>>>>>>>>>>>>")
    b ++= Array(4,5,6,7,8,9)
    output_array_buffer(b)
    println("remove the last 5 element>>>>>>")
    b.trimEnd(5)
    output_array_buffer(b)
    println("insert element to Array")
    b.insert(2,3)
    output_array_buffer(b)
    println("remove element from Array")
    b.remove(4,2)
    output_array_buffer(b)
  }

  def output_array_buffer(data:ArrayBuffer[Int]): Unit ={
    for (i <- 0 to data.length - 1){
      println(data(i))
    }
  }

  def array_initial: Unit ={
    println("start array initial>>>>>>")
    val array1 = new Array[Int](10)
    for (i <- 0 to array1.length - 1){
      println(array1(i))
    }
    val array2 = new Array[String](10)
    for (j <- 0 to array2.length - 1){
      println(array2(j))
    }
    val var3 = Array("Hello","Scala")
    println(var3(0))
    println(var3(1))
    var3(0) = "Awsome"
    println(var3(0))
  }

  def output_array(data:Array[Int]): Unit ={
    for (i <- 0 until data.length){
      print(data(i) + " ")
    }
    println()
  }
}
