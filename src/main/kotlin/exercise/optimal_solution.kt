package exercise

import kotlin.math.ceil

fun main() {
    val units = items.flatMap { item -> List(item.quantity) { createUnit(item) } }
    val (stackable, nonStackable) = units.partition(NormalizedItem::isStackable)
    val stackableGroups = stackable.groupBy { "${it.width}x${it.length}" }.values
    val stacked = stackableGroups.flatMap {
        it.chunked(2) { chunk -> if (chunk.size == 2) chunk[0].copy(isStacked = true) else chunk[0] }
    }
    val result = stacked + nonStackable
    result.onEach { println(it) }
}

fun normalize(value: Int, multiple: Int): Int {
    return ceil(value.toDouble() / multiple).toInt() * multiple
}

fun createUnit(item: Item) =
    NormalizedItem(
        width = normalize(item.width, 20),
        length = normalize(item.length, 20),
        isStackable = item.isStackable,
        isStacked = false
    )