package org.dean.snail.core.actor
import akka.actor.{Actor, ActorLogging, ActorRef}
import org.dean.snail.core.actor.MessageProtocol.{Connect,Request, Response}

/**
  * @description:
  * @author: dean
  * @create: 2019/04/18 17:10
  */
class StudentActor(teacherActor: ActorRef) extends Actor with ActorLogging {
  override def receive = {
    case Connect       => teacherActor ! Request
    case Response(resp) => println(resp)
  }
}
