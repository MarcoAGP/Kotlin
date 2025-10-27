object DoAuth { // 1 Objeto de declaração
    fun takeParams(
        username: String,
        password: String,
    ) { // 2 Função membro do objeto
        println("input Auth parameters = $username:$password")
    }
}

fun main() {
    DoAuth.takeParams("foo", "qwerty") // 3 Função chamada diretamente no objeto
}
