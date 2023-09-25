// Extension function
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

open class Parent1
class Child1 : Parent1()

fun Parent1.getName() = "Parent1"
fun Child1.getName() = "Child1"

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}

fun compute(input: Int): Pair<Int, String> =
    if (input > 5) Pair(input * 2, "High")
    else Pair(input * 2, "Low")

data class Tuple(
    val i: Int,
    val d: Double,
    val s: String,
    val b: Boolean,
    val l: List<Int>,
)

fun main() {
    val list = mutableListOf(1, 2, 3)
    println(list)
    list.swap(0, 2)
    println(list)

    fun printClassName(obj: Parent1) {
        println(obj.getName())
    }

    printClassName(Parent1())
    printClassName(Child1())

    val res1 = compute(3)
    println(res1)
    println(res1.first)
    println(res1.second)

    // Destructuring
    val (first, second) = compute(6)
    println("$first $second")

    val (value, desc) = compute(2)
    println("$value $desc")

    val tuple = Tuple(1, 1.0, "1", false, listOf(1, 2, 3))
    val (intVal, doubleVal, stringVal, booleanVal, listVal) = tuple

    println("$intVal $doubleVal $stringVal \n$booleanVal $list")
}