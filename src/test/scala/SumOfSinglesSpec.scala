import org.scalatest._

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "SumOfSingles" must {

    "return 6 when given List(1,2,3)" in {
      SumOfSingles.singleNumCalculator(List(1,2,3)) mustEqual 6
    }

    "return 4 when given List(1,2,2,3)" in {
      SumOfSingles.singleNumCalculator(List(1,2,2,3)) mustEqual 4
    }

    "return 15 when given List(4,5,7,5,4,8)" in {
      SumOfSingles.singleNumCalculator(List(4,5,7,5,4,8)) mustEqual 15
    }

    "return 9 when given List(1,1,2,2,3,3,4,5)" in {
      SumOfSingles.singleNumCalculator(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

  }

}
