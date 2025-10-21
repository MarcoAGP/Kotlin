fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6) // 1

    val doubled = numbers.map { x -> x * 2 } // 2 Cria uma variável nova doubled que contém os números da lista multiplicados por 2

    val tripled = numbers.map { it * 3 } // 3 Cria uma variável nova tripled que contém os números da lista multiplicados por 3 usando 'it'

    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}

