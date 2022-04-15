object MakingChange {

  def change(n: Int): Int = {
    var rest = n
    val coins = Seq(1, 5, 10, 25, 100, 500).reverse

    coins.map { c =>
      val amount = rest / c
      rest -= (amount * c)
      amount
    }.sum
  }

}
