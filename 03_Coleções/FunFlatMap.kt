fun main() {
    val fruitsBag = listOf("apple", "orange", "banana", "grapes") // 1 Variável que contém uma lista imutavel de frutas
    val clothesBag = listOf("shirts", "pants", "jeans") // 2 Variável que contém uma lista imutavel de roupas
    val cart = listOf(fruitsBag, clothesBag) // 3 Cria uma lista de listas chamada cart que contém as duas listas anteriores
    val mapBag = cart.map { it } // 4 Mantém a estrutura original da lista de listas
    val flatMapBag = cart.flatMap { it } // 5 Junta todos os itens das listas internas em uma única lista

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}
