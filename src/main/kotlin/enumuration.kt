// to use enums without qualification
import Direction.*

enum class Direction(
    val notation: String
) {
    North("N"), South("S"),
    East("E"), West("W");

    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> North
            East -> West
            West -> East
        }
}

enum class Size {
    Tiny, Small, Medium, Large, Huge, Gigantic
}

fun test3(sz: Size): String {
    return when (sz) {
        Size.Tiny -> "Tiny it is"
        Size.Small -> "Small it is"
        else -> "Something it is"
    }
}

fun main() {
    println(Size.Tiny)
    println(Size.Gigantic)

    println(test3(Size.Medium))
    println(test3(Size.Small))

    println(North.notation)
    println(South.opposite)
    println(East.opposite.opposite.notation)
    println(West)
}