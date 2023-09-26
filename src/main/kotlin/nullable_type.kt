class Amphibian

enum class Species {
    Frog, Toad, Salamander, Caecilian
}

fun checkLength(str: String?, expected: Int?): Pair<Int?, Int?> {
    val length1 = if (str != null) str.length else expected
    val length2 = str?.length
    return Pair(length1, length2)
}

fun checkLength2(str: String?, expected: Int): Pair<Int, Int> {
    val length1 = if (str != null) str.length else 0
    val length2 = str?.length ?: 0
    return Pair(length1, length2)
}

fun main() {
    val s1 = "abc"
    // s1 = null

    val s3: String? = null
    val s4: String? = s1

    // val s5: String = s4
    val s6 = s4

    val map = mapOf(0 to "yes", 1 to "no")
    println(map)

    val first: String? = map[0]
    val second: String? = map[2]
    println("$first $second")

    val s7: String = "abc"
    val s8: String? = s1
    println(s7.length)

    /*  In Kotlin, you can’t simply dereference (call a member function or access a
      member property) a value of a nullable type*/

    //println(s8.length)

    if (s8 != null) {
        println(s8.length)
    }

    /*    Whenever you create a new class, Kotlin automatically includes nullable
        and non-nullable types */
    val a1: Amphibian = Amphibian()
    val a2: Amphibian? = null

    val sp1: Species = Species.Frog
    val sp2: Species? = null

    // safe calls & elvis operator
    println(checkLength("abc", 3))
    println(checkLength(null, null))

    val sp3: String = "abc"
    val sp4: String? = null
    fun printStr(s: String?) {
        println(s ?: "---")
    }
    printStr(sp3)
    printStr(sp4)

    println(checkLength2("abc", 3))
    println(checkLength2(null, 0))
}