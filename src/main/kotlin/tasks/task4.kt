package tasks

import kotlin.math.sqrt

fun quadraticRoots(
    a: Double,
    b: Double,
    c: Double,
): Pair<Double, Double> {
    if (a == 0.0)
        throw IllegalArgumentException("a cannot be zero")
    val underRoot = b * b - 4 * a * c
    if (underRoot < 0)
        throw IllegalArgumentException("negative underRoot: $underRoot")
    val squareRoot = sqrt(underRoot)
    val root1 = (-b + squareRoot) / 2 * a
    val root2 = (-b - squareRoot) / 2 * a
    return Pair(root1, root2)
}

fun main() {
    try {
//        println(quadraticRoots(0.0, 4.0, 5.0))
        println(quadraticRoots(3.0, 4.0, 5.0))
    } catch (e: Exception) {
        println(e.toString())
    }
    println(quadraticRoots(3.0, 8.0, 5.0))
}