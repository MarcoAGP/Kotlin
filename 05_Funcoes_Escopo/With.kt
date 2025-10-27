data class Configuration(
    val host: String,
    val port: Int,
) // Definição de uma data class Configuration com propriedades host e port

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000) // Variável configuration do tipo Configuration

    with(configuration) {
        println("$host:$port")
    } // Uso da função with para acessar as propriedades de configuration

    // Alternativamente
    configuration.run {
        println("$host:$port")
    } // Uso da função run para acessar as propriedades de configuration

    // ao invés de:
    println("${configuration.host}:${configuration.port}")
}

