fun main() {
    val cakes = listOf("carrot", "cheese", "chocolate") // Cria uma lista imutável chamada 'cakes' com três tipos de bolos

    for (cake in cakes) { // 1 Cria um loop que itera sobre cada elemento na lista 'cakes'
        println("Yummy, it's a $cake cake!")
    }
}
