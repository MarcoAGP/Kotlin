enum class Color(
    val rgb: Int,
) {
    // 1 Variáveis de instância com valores RGB
    RED(0xFF0000), // 2 Atribuição de valor RGB para cada cor
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00),
    ;

    fun containsRed() = (this.rgb and 0xFF0000 != 0) // 3 Função que verifica se a cor contém componente vermelha
}

fun main() {
    val red = Color.RED
    println(red) // 4 Imprime a cor RED
    println(red.containsRed()) // 5 Imprime true, pois RED contém vermelho
    println(Color.BLUE.containsRed()) // 6 Imprime false, pois BLUE não contém vermelho
    println(Color.YELLOW.containsRed()) // 7 Imprime true, pois YELLOW contém vermelho
}
