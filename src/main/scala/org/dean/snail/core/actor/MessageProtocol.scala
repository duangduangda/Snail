package org.dean.snail.core.actor

/**
 * @description:  通信协议
 * @author: dean 
 * @create: 2019/04/18 17:18 
 */
object MessageProtocol {
  case class Connect()
  case class Request()
  case class Response(resp: String)
}
