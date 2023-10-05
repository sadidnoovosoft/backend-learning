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
    val normalizedItems = items
        .map {
            it.copy(
                width = roundUpToMultiple(it.width, 20),
                length = roundUpToMultiple(it.length, 20),
            )
        }
        .map { normalize(it) }
        .flatten()

    normalizedItems.forEach { println(it) }
}

fun roundUpToMultiple(value: Int, multiple: Int): Int {
    return if (value % multiple != 0) {
        (value / multiple + 1) * multiple
    } else {
        value
    }
}

fun normalize(item: Item): List<NormalizedItem> {
    val normalizedItems = mutableListOf<NormalizedItem>()
    val unitsToBeInserted = if (item.isStackable) item.quantity / 2 else item.quantity

    val normalizedItem = NormalizedItem(
        width = item.width,
        length = item.length,
        isStackable = item.isStackable,
        isStacked = item.isStackable
    )

    repeat(unitsToBeInserted) {
        normalizedItems.add(normalizedItem.copy())
    }

    if (item.isStackable && item.quantity % 2 == 1) {
        normalizedItems.add(normalizedItem.copy(isStacked = false))
    }

    return normalizedItems
}