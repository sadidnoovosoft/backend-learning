package tasks/*
Cage objects store Rats. Cage has a fixed size, so you can't put another Rat in a Cage if it's
already full.

For this exercise, Rats are stored in a List. In the next exercise, Map will be used instead of List.

Implement get(name: String) as a member function for Cage so it returns the Rat with name.
If there's no Rat with that name, throw NoSuchElementException.
 */

class Rat(val name: String) {
    override fun toString(): String {
        return "Rat(name='$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val rats = mutableListOf<Rat>()

    fun put(rat: Rat) {
        if (rats.size == maxCapacity)
            throw Exception("Cage full!")
        rats += rat
    }

    fun get(name: String): Rat {
        for (rat in rats) {
            if (rat.name == name)
                return rat
        }
        throw Exception("No rat with name !name")
    }

    override fun toString(): String {
        return "Cage(maxCapacity=$maxCapacity, rats=$rats)"
    }
}

fun main() {
    val rat1: Rat = Rat("rat1")
    val rat2: Rat = Rat("rat2")
    val cage: Cage = Cage(2)

    cage.put(rat1)
    cage.put(rat2)

    println(cage)

    try {
        cage.put(Rat("rat3"))
    } catch (e: Exception) {
        println(e.toString())
    }
}