object NewNumber {

  def addOneToNumber(n: Int): Int = n.toString
    .split("")
    .toList
    .map(_.toInt + 1)
    .mkString
    .toInt

}
