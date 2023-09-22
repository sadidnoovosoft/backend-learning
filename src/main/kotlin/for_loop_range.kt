fun main() {
    displayRange(1..8)
    displayRange(1..8 step 3)
    displayRange(1 until 8)
    displayRange(8 downTo 1)
    displayRange(8 downTo 1 step 2)
    displayCharRange('a'..'z')
    repeat(4) {
        println("Hello World!")
    }
}

fun displayRange(rng: IntProgression) {
    for(i in rng) {
        print("$i ")
    }
    println()
}

fun displayCharRange(rng: CharProgression) {
    for(c in rng) {
        print("$c ")
    }
    println()
}