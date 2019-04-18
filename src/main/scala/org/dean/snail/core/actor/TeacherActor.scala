package org.dean.snail.core.actor
import akka.actor.Actor
import org.dean.snail.core.actor.MessageProtocol.{Request, Response}
import scala.util.Random

/**
  * @description:
  * @author: dean
  * @create: 2019/04/18 17:08
  */
class TeacherActor extends Actor {
  val quotes = List(
    "Moderation is for cowards",
    "Anything worth doing is worth overdoing",
    "The trouble is you think you have time",
    "You never gonna know if you never even try"
  )

  override def receive = {
    case Request => {
      val random = new Random()
      val randomIndex = random.nextInt(quotes.size)
      val randomQuote = quotes(randomIndex)
      val response: Response = Response(randomQuote)
      sender ! response
    }
  }
}
