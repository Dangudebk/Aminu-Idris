class Car(val brand: String, val model: String, val year: Int) {
    fun displayDetails() = println("$brand $model - $year")
}

fun main() {
    Car("Toyota", "Camry", 2020).displayDetails()
    Car("Ford", "Mustang", 1967).displayDetails()
}
