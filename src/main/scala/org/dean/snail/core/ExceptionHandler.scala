package org.dean.snail.core

import java.net.MalformedURLException

import math.sqrt

/**
 * @description: 异常处理
 * @author: dean 
 * @create: 2019/04/01 16:25 
 */
object ExceptionHandler {

  def exceptionWrapper1(): Unit = {
    val x: Int = -1
    if (x > 0){
      sqrt(x)
    }else{
      throw new IllegalArgumentException("x should not be negative")
    }
  }

  def exceptionWrapper2(): Unit = {
    val url:String = "www.baidu.com"
    try{
//      process(url)
    }catch {
      case _:MalformedURLException => println("Bad URL:" + url)
      case e:Exception => e.printStackTrace()
    }
  }

  def main(args: Array[String]): Unit = {
    exceptionWrapper1()
    exceptionWrapper2()
  }
}
