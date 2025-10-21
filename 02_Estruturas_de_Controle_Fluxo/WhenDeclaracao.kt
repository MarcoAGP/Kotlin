fun main() {
    cases("Hello") // 2da Opção: Vai imprimir "Greeting"
    cases(1) // 1ra Opção: Vai imprimir "One"
    cases(0L) // 3ra Opção: Vai imprimir "Long"
    cases(MyClass()) // 4ta Opção: Vai imprimir "Not a string"
    cases("hello") // 5ta Opção: Vai imprimir "Unknown"
}

fun cases(obj: Any) { // Tipagem de parâmetro como Any para aceitar qualquer tipo
    when (obj) { // 1 Preparando a estrutura when para avaliar o obj
        1 -> println("One") // 2 Se o obj for igual a 1 vai imprimir "One"
        "Hello" -> println("Greeting") // 3 Se o obj for igual a "Hello" vai imprimir "Greeting"
        is Long -> println("Long") // 4 Se o obj for do tipo Long vai imprimir "Long"
        !is String -> println("Not a string") // 5 Se o obj não for do tipo String vai imprimir "Not a string"
        else -> println("Unknown") // 6 Se nenhuma das condições anteriores for satisfeita, imprime "Unknown"
    }
}

class MyClass
