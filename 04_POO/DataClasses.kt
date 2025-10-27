data class User(
    val name: String,
    val id: Int,
) { // 1 Classe data com propriedades name e id
    override fun equals(other: Any?) = other is User && other.id == this.id // 2 Override do equals para comparar apenas o id
}

fun main() {
    val user = User("Alex", 1)
    println(user) // 3 Variável user imprime a representação em string da instância da classe data

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}") // 4 Igualdade baseada no id
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode()) // 5 Impressão dos hash codes
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy()) // 6 Imprime uma cópia da instância user
    println(user === user.copy()) // 7 Imprime false, pois são instâncias diferentes
    println(user.copy("Max")) // 8 Imprime uma cópia com nome alterado
    println(user.copy(id = 3)) // 9 Imprime uma cópia com id alterado

    println("name = ${user.component1()}") // 10 Imprime os componentes individuais
    println("id = ${user.component2()}") // 11 Imprime os componentes individuais
}

