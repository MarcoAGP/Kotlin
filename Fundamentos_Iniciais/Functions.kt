fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(
    message: String,
    prefix: String = "Info", // Caso não seja passado um valor, o padrão será "Info"
) {
    println("[$prefix] $message") // Interpolação de strings
}

// fun sum(x: Int, y: Int): Int {
//  return x + y
// }
fun sum(
    x: Int,
    y: Int,
): Int = x + y

fun multiply(
    x: Int,
    y: Int,
) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}
