fun averageIncome(income: Int, months: Int): Int {
//    return if (months == 0) null else income / months
    return if (months == 0)
        throw IllegalArgumentException("Month's can't be zero")
    else income / months
}

fun main() {
    averageIncome(50000, 3)
    try {
        averageIncome(10000, 0)
    } catch (e: Exception) {
        println(e.toString())
    }
}