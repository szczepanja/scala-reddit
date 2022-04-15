import HavelHakimi._
import org.scalatest._
import flatspec._
import matchers._

class HavelHakimiSpec extends AnyFlatSpec with should.Matchers {

  "isMeetingPossible" should "return true given a sequence of answers to the question, apply the Havel-Hakimi algorithm to determine whether or not it's possible that everyone was telling the truth" in {

    isMeetingPossible(List(3, 1, 2, 3, 1, 0)) shouldBe true
    isMeetingPossible(List(16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16)) shouldBe true
    isMeetingPossible(List(14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12)) shouldBe true
    isMeetingPossible(List(1, 1)) shouldBe true
    isMeetingPossible(List()) shouldBe true
  }

  "isMeetingPossible" should "return false" in {

    isMeetingPossible(List(4, 2, 0, 1, 5, 0)) shouldBe false
    isMeetingPossible(List(15, 18, 6, 13, 12, 4, 4, 14, 1, 6, 18, 2, 6, 16, 0, 9, 10, 7, 12, 3)) shouldBe false
    isMeetingPossible(List(6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1)) shouldBe false
    isMeetingPossible(List(2, 2, 0)) shouldBe false
    isMeetingPossible(List(3, 2, 1)) shouldBe false
    isMeetingPossible(List(1)) shouldBe false

  }

}