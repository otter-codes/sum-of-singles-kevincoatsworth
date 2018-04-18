object SumOfSingles extends App {

  def singleNumCalculator(numbers: List[Int]): Int = {

    val duplicatedNumbers = numbers.diff(numbers.distinct).distinct

    val uniqueNumbers = numbers.distinct.diff(duplicatedNumbers)

    uniqueNumbers.sum
  }
}

//Failed attempts at filtering and mapping until eventually giving up and realising there was an easier way.
//val uniqueNumbers = duplicatedNumbers.filter(x => x == numbers(x))
//val x = duplicatedNumbers.map(x => numbersList.remove(x))
//val y = duplicatedNumbers.filter(x => numbers(x) == duplicatedNumbers(x))
