interface MyInterface {
    fun foo()
    fun bar() {
        println("Bar implementation")
    }
}

abstract class ImpMyInterface1 : MyInterface {

}

interface Named {
    val name: String
}

interface NamedPerson : Named {
    val firstName: String
    val lastName: String

    override val name: String
        get() = "$firstName $lastName"
}

class ImpNamedPerson(
    override val firstName: String,
    override val lastName: String,
) : NamedPerson

class ImpMyInterface2 : MyInterface {
    override fun foo() {
        println("Foo implementation")
    }
}