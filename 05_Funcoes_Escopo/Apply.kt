data class Person(
    var name: String,
    var age: Int,
    var about: String,
) {
    constructor() : this("", 0, "") // Construtor secundário padrão
}

fun main() {
    val jake = Person() // 1 Variável jake do tipo Person
    val stringDescription =
        jake
            .apply {
                // 2 Aplicação da função apply para configurar as propriedades de jake
                name = "Jake" // 3 Configuração da propriedade name
                age = 30
                about = "Android developer"
            }.toString() // 4 Conversão do objeto jake para string

    println(stringDescription)
}

