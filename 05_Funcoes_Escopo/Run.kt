fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            // 1 Função run para executar um bloco de código se ns não for nulo
            println("\tis empty? " + isEmpty()) // 2 Imprime se a string está vazia
            println("\tlength = $length")
            length // 3 Imprime o comprimento da string em caso não seja nula
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}

