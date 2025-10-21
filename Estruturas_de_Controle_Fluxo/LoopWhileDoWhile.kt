fun eatACake() = println("Eat a Cake")

fun bakeACake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0 // Variável mutavel atualiza o número de bolos comidos
    var cakesBaked = 0 // Variavel mutavel atualiza o número de bolos assados

    while (cakesEaten < 5) { // 1 Enquanto o número de bolos comidos for menor que 5
        eatACake()
        cakesEaten++
    }

    do { // 2 Faça isso primeiro. Sempre execute o bloco pelo menos uma vez antes de verificar a condição
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten) // E depois faça a condição. Enquanto Asados < Comidos
}
