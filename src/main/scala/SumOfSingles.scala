object SumOfSingles extends App {

  def singleNumCalculator(numbers: Array[Int]): Int = {

    val duplicatedNumbers = numbers.diff(numbers.distinct).distinct
    numbers.distinct.diff(duplicatedNumbers).sum
  }
}
