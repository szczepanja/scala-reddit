import scala.annotation.tailrec

object HavelHakimi {

  @tailrec
  def isMeetingPossible(list: List[Int]): Boolean = list.filterNot(_ == 0).sorted.reverse match {
    case Nil => true

    case ls =>
      val (head, tail) = (ls.head, ls.tail)
      if (head > tail.length) false
      else {
        val (ls, y) = tail.splitAt(head)
        isMeetingPossible(ls.map(_ - 1) ::: y)
      }
  }

}
