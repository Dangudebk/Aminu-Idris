fun main() {
    print("Enter your name: ")
    val name = readLine()
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    println("Hello $name, you are $age years old!")
}
