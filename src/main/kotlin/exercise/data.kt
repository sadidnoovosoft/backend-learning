package exercise

data class Item(
    val width: Int,
    val length: Int,
    val isStackable: Boolean,
    val quantity: Int,
)

data class NormalizedItem(
    val width: Int,
    val length: Int,
    val isStackable: Boolean,
    val isStacked: Boolean,
)

val items = listOf(
    Item(width = 99, length = 35, isStackable = true, quantity = 10),
    Item(width = 85, length = 37, isStackable = true, quantity = 5),
    Item(width = 100, length = 55, isStackable = false, quantity = 20),
    Item(width = 45, length = 67, isStackable = true, quantity = 17)
)