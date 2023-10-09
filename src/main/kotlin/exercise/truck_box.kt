package exercise

import kotlin.math.ceil

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