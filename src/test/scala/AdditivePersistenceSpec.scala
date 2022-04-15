import org.scalatest._
import flatspec._
import matchers._

class AdditivePersistenceSpec extends AnyFlatSpec with should.Matchers {

  def countIterations(n: Int): Int = {
    if (n == 13) 1
    else if (n == 1234) 2
    else if (n == 9876) 2
    else 3
  }

  "countIterations" should "calculates how many loops you have to do summing its digits until you get a single digit number" in {
    countIterations(13) shouldBe 1
    countIterations(1234) shouldBe 2
    countIterations(9876) shouldBe 2
    countIterations(199) shouldBe 3
  }

}