data class Point(var x: Int, var y: Int)

operator fun Point.unaryMinus() {
    x = -x
    y = -y
}

data class DayIndex(val value: Int) {
    operator fun plus(increment: Int): DayIndex {
        return DayIndex(value + increment)
    }
}

data class DataHolder(val data: List<Int>) {
    operator fun contains(a: Int): Boolean {
        println("function called")
        return data.contains(a)
    }
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year)
            return year - other.year
        if (month != other.month)
            return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

fun testDate() {
    // this code should compile:
    val date3 = MyDate(2, 2, 2)
    val date4 = MyDate(3, 3, 3)
    println(date3 < date4)
}

fun main() {
    val point = Point(2, 3)
    println(point)
    -point
    println(point)

    var d = DayIndex(10)
    d += 11
    println(d)

    val dh = DataHolder(listOf(2, 3))
    println(4 in dh)
    println(2 in dh)

    val list = listOf(listOf(1, 2), listOf(3, 4))
    println(list[0][1])

    testDate()
}