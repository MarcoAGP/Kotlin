sealed class Mammal(
    val name: String,
) // 1 Seleção de uma classe selada Mammal com uma propriedade name

class Cat(
    val catName: String,
) : Mammal(catName) // 2 Classe Cat que herda de Mammal

class Human(
    val humanName: String,
    val job: String,
) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) { // 3 Função que usa when para diferenciar os tipos de Mammal
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}" // 4 Se for Human
        is Cat -> return "Hello ${mammal.name}" // 5 Se for Cat
    } // 6 Ao usar sealed class, não é necessário o else
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Alice", "Engineer")))
}
