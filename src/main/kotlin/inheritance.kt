open class Base(p: Int)

class Derived1(p: Int) : Base(p)

// OR

class Derived2 : Base {
    constructor(p: Int) : super(p) {

    }

    constructor(p: Int, d: Int) : super(p) {

    }
}

open class Shape {
    open fun draw() {}
    open fun area() {}
    fun fill() {}
}

open class Circle : Shape() {
    open val radius: Int = 10

    override fun draw() {}
    final override fun area() {}
}

class Oval : Circle() {
    override var radius: Int = 15

    override fun draw() {}
    // override fun area() {} // error because are in Circle is final
}

open class Parent(
    val name: String
) {
    init {
        println("Initializing a base class")
    }

    open val size: Int = name.length.also { println("Initializing size in the base class: $it") }
    override fun toString(): String {
        return "Parent(name='$name', size=$size)"
    }
}

class Child(
    name: String,
    val lastName: String,
) : Parent(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {
    init {
        println("Initializing a child class")
    }

    override val size: Int = (super.size + lastName.length).also { println("Initializing size in derived class: $it") }

    override fun toString(): String {
        return "Child(lastName='$lastName', size=$size)"
    }
}

open class Rectangle {
    open fun draw() {
        println("Drawing rectangle")
    }
}

interface Polygon {
    open fun draw() {
        println("Drawing polygon")
    }
}

class Square : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

fun main() {
    // (Any) is the default superclass for all kotlin objects

    println()
    println(Parent("Parent class"))
    println()
    println(Child("Parent class", "Child class"))

    println()
    Square().draw()
}