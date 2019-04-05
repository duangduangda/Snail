package org.dean.snail.core

/**
  * @description: ${TODO}
  * @author: dean
  * @create: 2019/04/04 15:54
  */
object MatchHandler {
  def main(args: Array[String]): Unit = {
    val expr = UnOp("abs", UnOp("abs", Number(5)))
    expr match {
      case UnOp("abs", e @ UnOp("abs", _)) => e
      case _                               =>
    }

  }

  abstract class Expr
  case class Var(name:String) extends Expr
  case class Number(name: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
}
