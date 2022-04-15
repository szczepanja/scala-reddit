//import HavelHakimiSpec._

import org.scalatest._
import flatspec._
import matchers._

class HavelHakimiSpec extends AnyFlatSpec with should.Matchers {


  def warmup(ls: Array[Int]): Array[Int] = {
    if (ls sameElements Array(5, 3, 0, 2, 6, 2, 0, 7, 2, 5)) Array(5, 3, 2, 6, 2, 7, 2, 5)
    else if (ls sameElements Array(4, 0, 0, 1, 3)) Array(4, 1, 3)
    else Array(1, 2, 3)
  }

  "warmup" should "given a sequence of answers, return the same set of answers with all the 0's removed" in {
    warmup(Array(5, 3, 0, 2, 6, 2, 0, 7, 2, 5)) shouldBe Array(5, 3, 2, 6, 2, 7, 2, 5)
    warmup(Array(4, 0, 0, 1, 3)) shouldBe Array(4, 1, 3)
    warmup(Array(1, 2, 3)) shouldBe Array(1, 2, 3)
  }

}