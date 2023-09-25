class Default {
    var i: Int = 0
        get() = field
        set(value) {
            println("Setting i")
            field = value
        }

    var name: String = ""
        get() = field
        private set(value) {
            println("Setting name")
            field = value
        }

    // making setter private
    var count: Int = 0
        private set

    fun increment() {
        count = count.inc()
    }

    // making property private will make both getter and setter private
    private var value: Int = 0
}

fun main() {
    val d: Default = Default()
    d.i = 10
//    d.name = "Sadid"
    println(d.name)
    println(d.i)

    d.increment()
    d.increment()
    println(d.count)
    // d.value
}