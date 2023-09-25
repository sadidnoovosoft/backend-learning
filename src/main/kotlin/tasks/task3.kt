package tasks

// The following two classes are the foundation of a tic-tac-toe game:

class Cell {
    private var entry = ' '
    fun setCell(e: Char): String =
        if (entry == ' ' && (e == 'X' || e == 'O')) {
            entry = e
            "Successful Move"
        } else {
            "Invalid Move"
        }
}

class Grid {
    private val cells = listOf(
        listOf(Cell(), Cell(), Cell()),
        listOf(Cell(), Cell(), Cell()),
        listOf(Cell(), Cell(), Cell()),
    )

    fun play(e: Char, x: Int, y: Int): String =
        if (x !in 0..2 || y !in 0..2)
            "Invalid Move"
        else
            cells[x][y].setCell(e)
}

fun main() {
    val grid = Grid()
    println(grid.play('X', 0, 1))
    println(grid.play('O', 0, 1))
    println(grid.play('O', 1, 3))
}