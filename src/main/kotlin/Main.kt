fun main() {
/*
    val a: Int? = 1
    val b: Long? = a?.toLong()
    print(b === a?.toLong())

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = true

    println(myTrue && myFalse)
    println(boolNull == myTrue)

*/

//     Strings
    val s: String = "sadid" // immutable
    println(s.uppercase())
    println(s)

    val a = "abc"
    val b = a;
    println(a === b)

    val str = "abc" + 1
    println("str: " + str)

    val amount = 9.99
    println("str: ${'$'}$str")
}