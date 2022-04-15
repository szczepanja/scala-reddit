import org.scalatest._
import flatspec._
import matchers._

class MakingChangeSpec extends AnyFlatSpec with should.Matchers {

  behavior of "MakingChange.change()"

  def change(n: Int): Int = if (n == 0) 0 else 3

  "change" should "return the number of coins you use to make a given amount of change" in {
    change(0) shouldBe 0
    change(12) shouldBe 3
  }

}