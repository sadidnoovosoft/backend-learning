package tasks

fun <T, C : MutableCollection<T>> Collection<T>.partitionTo(
    c1: C,
    c2: C,
    predicate: (T) -> Boolean
): Pair<C, C> {
    for (element in this) {
        if (predicate(element)) {
            c1.add(element)
        } else {
            c2.add(element)
        }
    }
    return Pair(c1, c2)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}

fun main() {
    partitionWordsAndLines()
    partitionLettersAndOtherSymbols()
}