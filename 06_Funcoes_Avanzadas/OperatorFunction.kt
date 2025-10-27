fun main() {
    operator fun Int.times(str: String) =
        str.repeat(this) // 1 Operator function que recebe um Int e uma String e retorna a String repetida o número de vezes do Int
    println(2 * "Bye ") // 2 Imprime "Bye Bye "

    operator fun String.get(range: IntRange) =
        substring(range) // 3 Operator function que recebe um IntRange e retorna a substring correspondente
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14]) // 4 Imprime 14 caracteres "Always forgive"
}

