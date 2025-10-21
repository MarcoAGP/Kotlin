fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6) // 1 Variavel com uma lista de números imutável

    val positives = numbers.filter { x -> x > 0 } // 2 Cria uma variavel que filtra os números positivos da lista

    val negatives = numbers.filter { it < 0 } // 3 Cria uma variavel que filtra os números negativos da lista usando 'it'

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")
}

