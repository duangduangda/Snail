package org.dean.snail.core.actor
import akka.actor.Actor
import org.dean.snail.core.actor.ActorOps.{Greeting, WorkContent}


/**
  * @description:使用case class进行消息传递
  * @author: dean
  * @create: 2019/04/18 16:39
  */
class GreetingActor extends Actor {
  override def receive = {
    case Greeting(name)       => println(s"Hello,$name")
    case WorkContent(content) => println(s"Let's talk about  $content")
  }

}
