package org.dean.snail.core

import java.io.FileNotFoundException

import io.Source._

/**
  * @description: 懒值处理
  * @author: dean
  * @create: 2019/04/02 10:45
  */
object LazyValueHandler {

  def main(args: Array[String]): Unit = {
    val filePath: String = "/Users/dean/logon_server.sh"
    try {
      // words首次使用时取值
      lazy val words = fromFile(filePath).mkString
      // 定义words即被取值
//      val words = fromFile(filePath).mkString
      // 在每次使用words时都会取值
//      def words = fromFile(filePath).mkString
      println(words)
    } catch {
      case _: FileNotFoundException => println("FILE NOT FOUND:" + filePath)
      case ex: Exception            => ex.printStackTrace()
    }
  }
}
