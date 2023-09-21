fun main() {
    var internsArray = arrayOf("sadid", "tejas", "pulkit")
    println(internsArray.joinToString())
    internsArray += "vaishnav"
    println(internsArray.joinToString())

    val nullArray: Array<String?> = arrayOfNulls(5)
    println(nullArray[0])
    println(nullArray.joinToString(","))

    val arr = Array<Int>(3) { i -> i + 1 }
    for (item in arr) {
        print("$item  ")
    }
    println()

    // Multi-dimensional arrays
    val arr1 = Array(3) { i -> Array<Int>(3) { j -> i + j } }
    println(arr1.contentDeepToString())

    for (array in arr1) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    println()

    arr1[0][0] = -99
    for(i in arr1.indices) {
        for(j in arr1[i].indices) {
            print("${arr1[i][j]} ")
        }
        println()
    }
    println()

    val simpleArray = arrayOf(1, 2, 3)
    val anotherArray = arrayOf(1, 2, 3)

    println(simpleArray contentDeepEquals  anotherArray)


    // Functions on arrays
    val sumArray = arrayOf(1, 7, -16)
    println(sumArray.javaClass.name)

    println(sumArray.sum())

    sumArray.shuffle()
    println(sumArray.joinToString())
}