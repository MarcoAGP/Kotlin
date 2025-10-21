fun main() {
    fun printAll(vararg messages: String) { // 1 Vararg permite passar um número variável de argumentos
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好") // 2 Sem vararg, seria necessário criar várias sobrecargas

    fun printAllWithPrefix(
        vararg messages: String,
        prefix: String,
    ) { // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello",
        "Hallo",
        "Salut",
        "Hola",
        "你好",
        prefix = "Greeting: ", // 4 O prefix se repete para cada mensagem
    )

    fun log(vararg entries: String) {
        printAll(*entries) // 5 Para não passar o array como um único argumento, usa-se o operador spread (*)
    }
    log("Olá", "Hello", "Hallo", "Salut", "Hola", "你好")
}
