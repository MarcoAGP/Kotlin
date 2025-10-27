fun <T> T?.nullSafeToString() =
    this?.toString() ?: "NULL" // 1 Função de extensão genérica que pode ser chamada em qualquer tipo T, incluindo null

fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}

