import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class NotCoveredSuite extends AnyFunSuite with Matchers:
  test("f should return 42"):
    NotCovered.f() shouldBe 42
