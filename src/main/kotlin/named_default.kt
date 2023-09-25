// Default arguments for function
fun color(
    red: Int = 0,
    blue: Int = 0,
    green: Int = 0,
) = "($red, $blue, $green)"

// Default arguments for constructor
class Color(
    val red: Int = 0,
    val blue: Int = 0,
    val green: Int = 0,
) {
    override fun toString(): String {
        return "Color(red=$red, blue=$blue, green=$green)"
    }
}

class DefaultArg

fun testDef(
    d: DefaultArg = DefaultArg()
) = println(d)

fun main() {
    // named arguments for function
    println(color(blue = 140, green = 255))

    // uses of named and default arguments in library functions
    val list: List<String> = listOf("a", "b", "c")
    println(list.toString())
    println(list.joinToString())
    println(list.joinToString(prefix = "{", postfix = "}", separator = ", "))

    // named arguments for constructor
    val c = Color(
        green = 144,
        red = 240,
    )
    println(c)

//    If you use an object as a default argument, a new instance of that object is
//    created for each invocation:
    testDef()
    testDef()
}