package org.dean.snail.core.actor
import akka.actor.Actor

/**
 * @description: 模拟单向打招呼（Actor单向通信）
 * @author: dean 
 * @create: 2019/04/18 15:17 
 */
class HiActor extends Actor{
  override def receive = {
    case comment:String => println(comment)
  }
}
