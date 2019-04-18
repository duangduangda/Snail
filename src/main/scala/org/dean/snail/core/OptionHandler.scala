package org.dean.snail.core

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/04 10:25
  */
object OptionHandler {

  def getElement: Unit = {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
    println(sites.get("runoob"))
    println(sites.get("eric"))
  }

  def optionMatch: Unit = {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
    println(showSite(sites.get("google")))
    println(showSite(sites.get("baidu")))
  }

  def showSite(maybeString: Option[String]): String = maybeString match {
    case Some(s) => s
    case None    => "?"
  }

  def getOrElse: Unit = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None
    println(a.getOrElse(0))
    println(b.getOrElse(10))
    println(a.map(f => f * f).getOrElse(9999))
    println(b.map(f => f * f).getOrElse(9999))
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
    println(sites.getOrElse("runoob","no website"))
    println(sites.getOrElse("runfast","no website"))
  }

  def main(args: Array[String]): Unit = {
    getElement
    optionMatch
    getOrElse
  }
}
