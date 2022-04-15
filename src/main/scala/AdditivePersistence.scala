import scala.annotation.tailrec

object AdditivePersistence {

  @tailrec
  def countIterations(n: Int, loop: Int = 0): Int =
    n match {
      case n if (n >= 10) => countIterations(
        n.toString
          .split("")
          .toList
          .map(_.toInt)
          .sum, loop + 1
      )
      case _ => loop
    }

}
