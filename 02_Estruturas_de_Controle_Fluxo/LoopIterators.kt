class Animal(
    val name: String,
)

class Zoo(
    val animals: List<Animal>,
) {
    operator fun iterator(): Iterator<Animal> { // 1 Operator de função para permitir a iteração sobre a classe Zoo
        return animals.iterator() // 2 Busca o iterador da lista de animais
    }
}

fun main() {
    val animals = listOf(Animal("zebra"), Animal("lion")) // Cria uma lista imutável de animais
    val zoo = Zoo(animals)

    for (animal in zoo) { // 3 Pega cada animal no zoológico usando o iterador personalizado
        println("Watch out, it's a ${animal.name}")
    }
}
