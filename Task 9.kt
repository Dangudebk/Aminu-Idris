fun main() {
    val scores = mapOf("Aliyu" to 85, "Bello" to 68, "Usman" to 72, "Musa" to 95)
    scores.filter { it.value > 70 }.forEach { println("${it.key} scored ${it.value}") }
}
