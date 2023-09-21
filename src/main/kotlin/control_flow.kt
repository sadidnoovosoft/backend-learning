import kotlin.math.log
import kotlin.random.Random

fun getMax(vararg arr: Int): Int {
    var maxValue: Int = Int.MIN_VALUE
    for (value in arr) {
        if (value > maxValue) {
            maxValue = value
        }
    }
    return maxValue
}

enum class Bit {
    ZERO, ONE
}

fun getRandomBit(): Bit {
    return if (Random.nextBoolean()) Bit.ONE else Bit.ZERO
}

fun test() {
    throw Exception("Hello World!")
}

fun main() {
    println(getMax(19, 20, 13, 45, 23))

    val bitValue = when (getRandomBit()) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
    }
    println(bitValue)

    val arr = Array<Int>(6) { i -> i * i * i }
    println(arr.joinToString())

    for (index in arr.indices) {
        print("${arr[index]} ")
    }
    println()

    for ((index, value) in arr.withIndex()) {
        println("Element at index $index is $value")
    }

    // Wile and do-while loops
    var index = 0
    while (index < arr.size) {
        print("Index $index: ${arr[index++]}\n")
    }
    println()

    index = 0
    do {
        println("Index $index: ${arr[index++]}")
    } while (index < arr.size)

    // loop label
    loop1@ for (i in 1..10) {
        loop2@ for (j in 11..15) {
            if (j == 13) break@loop1
        }
    }

    // exception handling
    try {
        test()
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("Exception handled")
    }

    println("Hi Kotlin")
}