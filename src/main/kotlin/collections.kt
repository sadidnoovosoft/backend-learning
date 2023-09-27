fun getList(): List<Int> {
    return mutableListOf(9, 8, 7)
}

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    println(ints)

    var result = ""
    for (i in ints) {
        result += "$i "
    }
    println(result)
    println(ints[3])

    // List of strings and doubles
    val doubles = listOf(1.1, 2.2, 3.3, 4.4)
    println(doubles)
    println(doubles.sum())

    val strings = listOf(
        "Twas", "Brillig",
        "And", "Slithy", "Toves"
    )
    println(strings)
    println(strings.sorted()) // produces new sorted list keeping the original same
    println(strings)
    println(strings.reversed()) // produces new reversed list keeping the original same

    // strings[0] = "sadid" // Immutable list

    // Mutable List
    val arrList = mutableListOf<Int>() // if list initially empty then need to specify type eg (int)
    arrList.addAll(listOf(1, 2))
    arrList.add(3)
    arrList += 4
    arrList += listOf(5, 6)
    println(arrList)

    val list = getList()
    println(list)
    // list.add(5) // not possible because object is mutableList but reference is list

    // Set
    val intSet = setOf(1, 2, 4, 3, 2)
    println(intSet)
    // println(intSet[0]) // error
    println(intSet.contains(5))
    println(intSet.contains(4))
    println(intSet.union(setOf(1, 5, 6)))
    println(intSet)
    println(intSet intersect setOf(1, 2, 6, 7))

    // Mutable set
    val mutableIntSet = mutableSetOf<Int>()
    mutableIntSet.add(5)
    mutableIntSet += intSet
    mutableIntSet += 5
    println(mutableIntSet)

    val l = listOf(1, 2, 3, 4)
    val simpleSum = l.fold(0) { sum, element -> sum + element }
    val simpleSumReduce = l.reduce { sum, element -> sum + element }
    println(simpleSum)
    println(simpleSumReduce)

    val doubledSumFold = l.fold(0) { sum, element -> sum + 2 * element }
    println(doubledSumFold)
    val doubledSumReduce = l.reduce { sum, e -> sum + 2 * e }
    println(doubledSumReduce)
}