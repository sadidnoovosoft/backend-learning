class ProducerClass<out T>(private val value: T) {
    fun getValue(): T {
        return value
    }
}

class ConsumerClass<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

fun copy(from: Array<out Any>, to: Array<Any?>) {
    for (i in from.indices)
        to[i] = from[i]
}

fun fill(dest: Array<in Int>, value: Int) {
    dest[0] = value
}

class Automobile(val brand: String)

class GenericHolder<T>(private val value: T) {
    fun getValue(): T = value
}

class AnyHolder(private val value: Any) {
    fun getValue(): Any = value
}

class Lion {
    fun roar(): String = "Roars!"
}

fun main() {
    val gc = ProducerClass("generic-class")
    println(gc.getValue())

    // gc can be assigned to supertype of gc
    val ref: ProducerClass<Any> = gc

    val value = ConsumerClass<Number>()
    val ref2: ConsumerClass<Int> = value

    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any: Array<Any?> = arrayOfNulls(3)
    copy(ints, any)

    val objects: Array<Any?> = arrayOfNulls(1)
    fill(objects, 1)

    val h1 = GenericHolder(Automobile("Ford"))
    println(h1.getValue())

    val h2 = GenericHolder("Sadid")
    println(h2.getValue())

    val h3 = GenericHolder(55)
    println(h3.getValue())

    val anyHolder = AnyHolder(Lion())
    val ref3 = anyHolder.getValue()
    //ref3.roar()
    // val ref4: Lion = anyHolder.getValue()

    val genericHolder = GenericHolder(Lion())
    val ref4 = genericHolder.getValue()
    println(ref4.roar())
    val ref5: Any = genericHolder.getValue()
    //println(ref5.roar())

    val result: Int? = listOf(1, 2, 3).firstOrNull()
    val result2: String? = listOf<String>().firstOrNull()
    println(result)
    println(result2)

    try {
        val result3: String = listOf<String>().first()
        println(result3)
    } catch (e: Exception) {
        println(e.toString())
    }
}