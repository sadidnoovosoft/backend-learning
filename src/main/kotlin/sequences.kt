fun main() {
    val numbersSequence = sequenceOf("four", "three", "two", "one")
    println(numbersSequence)
    println(numbersSequence.toList())

    val oddNumbersLessThan10 = generateSequence(1) { if (it < 8) it + 2 else null }
    println(oddNumbersLessThan10.count())
}