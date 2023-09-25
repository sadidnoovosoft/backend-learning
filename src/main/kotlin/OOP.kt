class Giraffe
class Bear
class Hippo

class Dog {
    fun bark() = "yip!"
}

class Hamster {
    fun speak() = "Squeak! "
    fun exercise() {
        this.speak() + speak() + "Running on wheel"
    }
}

class Cup {
    var percentFull: Int = 0
    val maxQuantity: Int = 100

    fun add(increase: Int): Int {
        percentFull = maxQuantity.coerceAtMost(percentFull + increase)
        return percentFull
    }

    override fun toString(): String {
        return "Cup(percentFull=$percentFull, maxQuantity=$maxQuantity)"
    }
}

class House {
    var sofa: String

    constructor(sofa: String) {
        this.sofa = sofa
    }

    override fun toString(): String {
        return "House(sofa='$sofa')"
    }
}

class Test(name: String) {
    val str = "First property: $name"

    init {
        println("Initialisation block")
    }
}

class Test2 private constructor(val name: String) {
    init {
        println("Initialize name as $name")
    }
}

fun main() {
    val g1 = Giraffe()
    val g2 = Giraffe()
    val b = Bear()
    val h = Hippo()

    println(g1)
    println(g2)
    println(b)
    println(h)

    val d = Dog()
    println("Dog say's ${d.bark()}")

    val hms = Hamster()
    println(hms.exercise())

    val c1 = Cup()
    c1.percentFull = 50
    val c2 = Cup()
    c2.percentFull = 100

    println(c1)
    println(c2)
    println()

    c1.add(25)
    c2.add(25)

    println(c1)
    println(c2)

    val house = House("")
    house.sofa = "Sleeper Sofa"
    println(house)
    house.sofa = "Leather sofa"
    println(house)

    // init block
    val t = Test("hello")
    println(t.str)

//    val t2 = Test2("hi")
}