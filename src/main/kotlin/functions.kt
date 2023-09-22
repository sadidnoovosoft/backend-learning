fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
    (seconds + (minutes + hours * 60L) * 60) * 1000

fun convertFahrenheitToCelsius(f: Int): Double =
    (f - 32) * 5.0 / 9

fun convertCelsiusToFahrenheit(c: Int): Double =
    c * 9.0 / 5 + 32

fun main() {
    println(convertToMilliseconds(1, 30, 0))
    println(convertFahrenheitToCelsius(68)) // 20.0
    println(convertCelsiusToFahrenheit(20)) // 68.0

    println((2 > 3).and(1 < 3)) // even if first condition is false still it will evaluate second condition
    println(2 > 3 && 1 < 3) // if first condition is false then it will skip remaining checks
}