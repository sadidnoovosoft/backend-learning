interface Base1 {
    val message: String
    fun print()
    fun println()
}

class Base1Impl(private val x: Int) : Base1 {
    override val message: String = "Message in Base1Impl"

    override fun print() {
        print(x)
    }

    override fun println() {
       println(message)
    }
}

class Derived(b: Base1) : Base1 by b {
    override val message: String = "Message in Derived"
}

fun main() {
    val b = Base1Impl(23)
    val d = Derived(b)
    d.println()
}