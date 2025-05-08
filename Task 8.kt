open class Person(val name: String, val age: Int) {
    fun printDetails() = println("Name: $name, Age: $age")
}

class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    fun printGrade() = println("Grade: $grade")
}

fun main() {
    Student("Aminu Idris", 28, "A").apply {
        printDetails()
        printGrade()
    }
}
