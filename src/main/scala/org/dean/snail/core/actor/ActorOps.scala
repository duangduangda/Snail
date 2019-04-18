package org.dean.snail.core.actor

/**
 * @description:
 * @author: dean 
 * @create: 2019/04/18 15:16 
 */
object ActorOps {
  import akka.actor.{ActorSystem, Props}
  def main(args: Array[String]): Unit = {
    firstActor
    caseclassActor
  }

  def firstActor: Unit ={
    val system = ActorSystem("HiSystem")
    val  hiActor = system.actorOf(Props[HiActor], name = "hiActor")
    // send message
    hiActor ! "Hi,Scala"
    hiActor ! "I am learning how to use 'Actor'"
    hiActor ! "I think it's funny!"
    system.terminate()
  }

  def caseclassActor: Unit ={
    val system = ActorSystem("GreeetingActor")
    val greetingActor = system.actorOf(Props[GreetingActor],name = "greetingActor")
    greetingActor ! Greeting("eric")
    greetingActor ! WorkContent("going to the university")
    system.terminate
  }

  case class Greeting(name: String)
  case class WorkContent(content: String)

}


