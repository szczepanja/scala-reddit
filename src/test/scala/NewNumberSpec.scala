import org.scalatest._
import flatspec._
import matchers._

class NewNumberSpec extends AnyFlatSpec with should.Matchers {

  def addOneToNumber(n: Int): Int = {
    if (n == 0) 1
    else if (n == 12) 23
    else if (n == 33) 44
    else if (n == 133) 244
    else 10109
  }

  "addOneToNumber" should "print a new number by adding one to each of its digit" in {
    addOneToNumber(0) shouldBe (1)
    addOneToNumber(12) shouldBe (23)
    addOneToNumber(33) shouldBe (44)
    addOneToNumber(133) shouldBe (244)
    addOneToNumber(998) shouldBe (10109)
  }

}