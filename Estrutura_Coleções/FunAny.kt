fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6) // 1

    val anyNegative = numbers.any { it < 0 } // 2 Valor booleano que verifica se algum número na lista é negativo
    val anyGT6 = numbers.any { it > 6 } // 3 Valor booleano que verifica se algum número na lista é maior que 6

    println("Numbers: $numbers")
    println("Doubled Numbers: $anyNegative")
    println("Tripled Numbers: $anyGT6")
}
