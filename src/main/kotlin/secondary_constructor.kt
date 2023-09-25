class Person(val pets: MutableList<Pet> = mutableListOf()) {
    override fun toString(): String {
        return "Person(pets=$pets)"
    }
}

class Pet(val name: String, val species: String) {
    init {
        println("Name of pet is $name and species of pet is $species")
    }

    constructor(owner: Person, name: String, species: String) : this(name, species) {
        owner.pets.add(this)
    }

    override fun toString(): String {
        return "Pet(name='$name', species='$species')"
    }
}

fun main() {
    val person = Person()
    val dog = Pet(person, "Tom", "Dog")
    val cat = Pet(person, "Tim", "Cat")

    println(person.pets)
    println(dog)
    println(cat)
}