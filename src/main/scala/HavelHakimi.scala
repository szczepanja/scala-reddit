import scala.annotation.tailrec

object HavelHakimi {

  def isMeetingPossible(list: List[Int]): Boolean = list.filterNot(_ == 0).sorted.reverse match {
    case Nil => true
  }

}
