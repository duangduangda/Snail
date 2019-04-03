package org.dean.snail.core
import scala.collection.mutable

/**
  * @description: 映射
  * @author: dean
  * @create: 2019/04/02 11:03
  */
object MapHandler {

  def initAndGet(): Unit = {
    val scores = Map("Alice" -> 100, "Bob" -> 90)
    println(scores("Alice"))
    println(scores.get("Alice"))
    val people = Map(("Eric", 20), ("Duang", 19))
    println(people("Eric"))
    println(scores.getOrElse("Alice1", -1))
  }

  def checkExist: Unit = {
    val scores = Map("Alice" -> 100, "Bob" -> 90)
    println(scores.contains("Alice"))
    println(scores.contains("Eric"))
  }

  def addOne = {
    var grades = Map("Eric" -> "A", "Dean" -> "B")
    grades += ("Derik" -> "C")
    println(grades)
    val grades1 = mutable.Map("Eric" -> "A", "Dean" -> "B")
    grades1("selina") = "A"
    println(grades1)
  }

  def addMulti = {
    var grades = Map("Eric" -> "A", "Dean" -> "B")
    grades += ("Derik" -> "C", "Duang" -> "D")
    println(grades)
  }

  def del: Unit = {
    var grades = Map("Eric" -> "A", "Dean" -> "B")
    grades -= "Eric"
    println(grades)
    val grades1 = mutable.Map("Eric1" -> "A", "Dean1" -> "B")
    grades1.remove("Eric1")
    println(grades1)
  }

  def update: Unit = {
    var grades = Map("Eric" -> "A", "Dean" -> "B")
    grades += ("Dean" -> "A")
    println(grades)
  }

  def CUD: Unit = {
    addOne
    addMulti
    del
    update
  }

  def checkEmpty: Unit = {
    var grades = Map("Eric" -> "A", "Dean" -> "B")
    println(grades.isEmpty)
    grades = Map.empty
    println(grades.isEmpty)
    grades = Map()
    println(grades.isEmpty)
  }

  def iterate: Unit = {
    var grades = Map("Eric" -> "A", "Dean" -> "B")
    println("grader.keys:" + grades.keys)
    println("grade.values:" + grades.values)
    grades.keys.foreach { i =>
      print(i + "->")
      println(grades(i))
    }
    for (v <- grades.values) {
      println(v)
    }
  }

  def merge: Unit = {
    val red = Map("red" -> "#FF0000")
    val blue = Map("blue" -> "#0033FF")
    val color = red ++ blue
    println(color)
  }

  def sort: Unit = {
    val scores = mutable.Map("Alice" -> 80, "Bob" -> 90)
    println(mutable.ListMap(scores.toSeq.sortBy(_._1): _*))
  }

  def main(args: Array[String]): Unit = {
    initAndGet
    checkExist
    CUD
    checkEmpty
    iterate
    merge
    sort
  }

}
