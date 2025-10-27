fun main() {
    infix fun Int.times(str: String) = str.repeat(this) // 1 Vai receber um Int e uma String e retorna a String repetida o número de vezes do Int
    println(2 times "Bye ") // 2 Imprime "Bye Bye "

    val pair = "Ferrari" to "Katrina" // 3 Variável pair recebe um par de Strings usando a função infix 'to'
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other) // 4 Vai receber duas Strings e retorna um Pair delas
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia // 5 Adiciona Claudia à lista de pessoas que Sophia gosta
}

class Person(
    val name: String,
) {
    val likedPeople = mutableListOf<Person>()

    infix fun likes(other: Person) {
        likedPeople.add(other)
    } // 6 Adiciona outra pessoa à lista de pessoas que esta pessoa gosta
}

