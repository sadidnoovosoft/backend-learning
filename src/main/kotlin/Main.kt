fun main() {
    data class Employee (val name: String)
//    class Employee(val name: String)

    val emp1 = Employee("Sadid")
    val emp2 = Employee("Sadid")

    println(emp1 == emp2) // in case of data class only data will be compared
    println(emp1 === emp2)
    println(emp1.equals(emp2)) // in case of data class only data will be compared

    println()

    println(emp1.name == emp2.name)
    println(emp1.name === emp2.name)
    println(emp1.name.equals(emp2.name))
}