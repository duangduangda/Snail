package org.dean.snail.core.actor

import akka.actor.{ActorSystem, Props}



/**
 * @description: 问答模式
 * @author: dean 
 * @create: 2019/04/18 17:06 
 */
object CommunicationOps {
  def main(args: Array[String]): Unit = {
    import org.dean.snail.core.actor.MessageProtocol.Connect
    val system = ActorSystem("communicationSystem")
    val teacherActor = system.actorOf(Props[TeacherActor],"teacherActor")
    val studentActor = system.actorOf(Props[StudentActor](new StudentActor(teacherActor)),name = "studentActor")
    studentActor ! Connect
    Thread.sleep(2000)
    system.terminate
  }
}
