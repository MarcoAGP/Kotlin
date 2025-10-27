enum class State {
    IDLE,
    RUNNING,
    FINISHED, // 1 Criação de uma enum class com três estados
}

fun main() {
    val state = State.RUNNING // 2 Variável state do tipo State atribuída ao valor RUNNING
    val message =
        when (state) { // 3 Switch case para determinar a mensagem com base no estado
            State.IDLE -> "It's idle"
            State.RUNNING -> "It's running"
            State.FINISHED -> "It's finished"
        }
    println(message)
}

