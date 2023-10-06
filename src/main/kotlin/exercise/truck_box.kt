package exercise

import kotlin.math.ceil

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
    Item(
        width = 99, // normalized to 100
        length = 35, // normalized to 40
        isStackable = true,
        quantity = 10,
    ),
    Item(
        width = 85,
        length = 37,
        isStackable = true,
        quantity = 5,
    ),
    Item(
        width = 100,
        length = 55,
        isStackable = false,
        quantity = 20,
    ),
    Item(
        width = 45,
        length = 67,
        isStackable = true,
        quantity = 17,
    )
)

fun main() {
    val normalizedItems = items.flatMap { it.normalize() }
    normalizedItems.forEach { println(it) }
}

fun roundUpToMultiple(value: Int, multiple: Int): Int {
    return ceil(value.toDouble() / multiple).toInt() * multiple
}

fun Item.normalize(): List<NormalizedItem> {
    val unitsToBeInserted = if (isStackable) quantity / 2 else quantity
    val normalizedItem = NormalizedItem(
        roundUpToMultiple(width, 20), roundUpToMultiple(length, 20), isStackable, isStackable
    )

    return List(unitsToBeInserted) {
        normalizedItem.copy()
    } + if (isStackable && quantity % 2 == 1) {
        listOf(normalizedItem.copy(isStacked = false))
    } else {
        emptyList()
    }
}