data class Person(
    var name: String,
    var age: Int,
    var about: String,
) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake =
        Person("Jake", 30, "Android developer") // 1 Criação do objeto Person
            .also {
                // 2 Aplicação da função also para executar ações adicionais com o objeto criado
                writeCreationLog(it) // 3 Escreve um log de criação da pessoa
            }
}

