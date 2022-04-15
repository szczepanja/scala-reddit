import AdditivePersistence._
import org.scalatest._
import flatspec._
import matchers._

class AdditivePersistenceSpec extends AnyFlatSpec with should.Matchers {

  behavior of "AdditivePersistence.countIterations()"

  "countIterations" should "calculates how many loops you have to do summing its digits until you get a single digit number" in {
    countIterations(13) shouldBe 1
    countIterations(1234) shouldBe 2
    countIterations(9876) shouldBe 2
    countIterations(199) shouldBe 3
  }

}