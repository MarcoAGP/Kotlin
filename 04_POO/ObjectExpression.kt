fun rentPrice(
    standardDays: Int,
    festivityDays: Int,
    specialDays: Int,
) { // 1 Função para calcular o preço do aluguel

    val dayRates =
        object { // 2 Variável que usa uma expressão de objeto para armazenar as taxas diárias
            var standard: Int = 30 * standardDays
            var festivity: Int = 50 * festivityDays
            var special: Int = 100 * specialDays
        }

    val total = dayRates.standard + dayRates.festivity + dayRates.special // 3 Variável para calcular o preço total

    print("Total price: $$total") // 4 Imprime o preço total
}

fun main() {
    rentPrice(10, 2, 1) // 5 Função main que chama a função rentPrice com valores de exemplo
}
