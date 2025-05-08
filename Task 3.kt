fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    println("$num is ${if (num % 2 == 0) "an even" else "an odd"} number.")
}
