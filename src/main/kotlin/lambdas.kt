fun <T, R> customFold(
    list: List<T>,
    initial: R,
    apply: (acc: R, element: T) -> R,
): R {
    var accum: R = initial
    for (element in list) {
        accum = apply(accum, element)
    }
    return accum
}

fun functionTypes(
    dummyFunc: (Int, Int) -> Int
): Int = dummyFunc(1, 4)

fun main() {
    val result = customFold(listOf(2, 3, 5), 1) { acc: Int, element: Int ->
        val result = acc + element
        result
    }
    println(result)

    val res = functionTypes { a, b -> a + b }
    println(res)

    // function literals

    // Lambda expression
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println(add(3, 5))

    // Anonymous function
    val multiply = fun(x: Int, y: Int): Int {
        return x * y
    }
    println(multiply(5, 9))

    // Function reference
    fun square(x: Int) = x * x
    val squareRef = ::square
    println(squareRef(8))

    println(functionTypes(multiply))
    println(functionTypes(add))
}