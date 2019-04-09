package org.dean.snail.core

/**
 * @description: ${TODO} 
 * @author: dean 
 * @create: 2019/04/08 16:12 
 */
object CombinatorHandler {
  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,5,6,7,8,9)
    // map
    println(numbers.map(i=> i * 2))
    println(numbers.map(doubleData))
    // foreach
    numbers.foreach(println)
    numbers.foreach(outputDouble)
    // filter
    println(numbers.filter(i => i % 2 == 0))
    //zip
    val chars = List("A","B","C","D")
    println(numbers.zip(chars))
    // partition
    println(numbers.partition(_ % 2 == 0))
    // find
    println(numbers.find((i:Int) => i > 2))
    // drop
    println(numbers.drop(3))
    // dropWhile(将删除第一个匹配条件的值)
    println(numbers.dropWhile(_ % 2 != 0))
    // foldLeft(0为初始值（记住numbers是List[Int]类型），m作为一个累加器)
    println(numbers.foldLeft(0){
      (m: Int, n: Int) => println("m: " + m + " n: " + n)
        m + n
    })
    // foldRight
    println(numbers.foldRight(0){
      (m: Int, n: Int) => println("m: " + m + " n: " + n)
        m + n
    })
    // flatten
    println(List(List(1,2),List(3,4)).flatten)
    // flatmap(先map再flatten)
    println(List(List(1,2),List(3,4)).flatMap(x => x.map(_ * 2)))

  }

  def doubleData(i:Int):Int = i * 2

  def outputDouble(i:Int) = println(i * 2)

}
