package org.dean.snail.core.actor
import akka.actor.{Actor, ActorLogging}
import org.dean.snail.core.actor.MessageProtocol.{Header, Shutdown, Start, Stop}

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/18 19:25
  */
class RemoteActor extends Actor with ActorLogging {
  def receive = {
    case Start => {
      log.info("Remote Server Start ==>RECV Start event : " + Start)
    }
    case Stop => {
      log.info("Remote Server Stop ==>RECV Stop event: " + Stop)
    }
    case Shutdown(waitSecs) => {
      log.info(
        "Remote Server Shutdown ==>Wait to shutdown: waitSecs=" + waitSecs
      )
      Thread.sleep(waitSecs)
      log.info("Remote Server Shutdown ==>Shutdown this system.")
      context.system.terminate
    }
    case Header(id, len, encrypted) =>
      log.info("Remote Server => RECV header: " + (id, len, encrypted)) // 处理Header消息
    case _ =>
  }
}
