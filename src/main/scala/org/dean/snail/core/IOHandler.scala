package org.dean.snail.core
import java.io.FileNotFoundException

import com.sun.org.apache.xml.internal.utils.URI.MalformedURIException

import scala.io.Source

/**
 * @description: ${TODO} 
 * @author: dean 
 * @create: 2019/04/03 19:48 
 */
object IOHandler {
  def main(args: Array[String]): Unit = {
    val url :String = "/Users/dean/logon_server.sh"
    try{
      println("文件内容为：")
      Source.fromFile(url).foreach(ch =>print(ch))
    }catch {
      case _:FileNotFoundException => println("Illegal URL:" + url)
      case ex:Exception => ex.printStackTrace()
    }
  }
}
