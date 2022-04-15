import MakingChange._
import org.scalatest._
import flatspec._
import matchers._

class MakingChangeSpec extends AnyFlatSpec with should.Matchers {

  behavior of "MakingChange.change()"

  "change()" should "return the number of coins you use to make a given amount of change" in {
    change(0) shouldBe 0
    change(12) shouldBe 3
    change(468) shouldBe 11
    change(123456) shouldBe 254
  }

}