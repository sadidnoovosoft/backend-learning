class Alien(val name: String) {
    val greeting = "Hello, $name!"

    override fun toString(): String {
        return "Alien(name='$name', greeting='$greeting')"
    }
}

private var index = 0

private class Animal(val name: String)

private fun recordAnimal(
    animal: Animal
) {
    println("Animal #$index: ${animal.name}")
    index += 1
}

private fun recordAnimals() {
    recordAnimal(Animal("Tiger"))
    recordAnimal(Animal("Antelope"))
}

private fun recordAnimalsCount() =
    println("$index animals are here!")

class Cookie(
    private var isReady: Boolean
) {
    private fun crumble() =
        println("crumble")

    private fun bite() =
        println("bite")

    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}

class Counter(
    var count: Int
) {
    fun increment() {
        count += 1
    }

    override fun toString() = count.toString()
}

class CounterHolder(
    counter: Counter
) {
    private val ctr = counter

    override fun toString() =
        "CounterHolder: ${ctr.count}"
}

fun main() {
    val alien = Alien("Mr. Bean")
    println(alien.greeting)
    println(alien.name)
    println(alien)

    recordAnimals()
    recordAnimalsCount()

    val cookie = Cookie(false)
    cookie.eat()

    val ctr = Counter(10)
    val ch = CounterHolder(ctr)

    println(ch)
    ctr.increment()
    println(ch)
}