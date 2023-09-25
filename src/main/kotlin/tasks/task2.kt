package tasks

/*
If you commonly select elements from a List using keys, it makes sense to optimize by using a Map
instead of a List.

Change the internal implementation of the Cage class to store elements in a Map rather than a List.
To get an element use the getValue() member function, which throws NoSuchElementException if the
key is missing.
 */

class Student(val name: String) {
    override fun toString(): String {
        return "Student(name='$name')"
    }
}

class School(private val maxCapacity: Int) {
    private val students = mutableMapOf<String, Student>()

    fun admit(student: Student) {
        if (students.size == maxCapacity)
            throw Exception("School full!")
        students += student.name to student
    }

    fun getStudent(name: String): Student {
        return students.getValue(name)
    }

    override fun toString(): String {
        return "School(maxCapacity=$maxCapacity, students=$students)"
    }
}

fun main() {
    val s1: Student = Student("Sadid")
    val s2: Student = Student("Tanmay")
    val school: School = School(2)
    school.admit(s1)
    school.admit(s2)

    try {
        school.admit(Student("Student name 3"))
    } catch (e: Exception) {
        println(e.toString())
    }

    println(school)
}