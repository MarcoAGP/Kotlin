import kotlinx.coroutines.*

fun main() = runBlocking { // 1 Função main que é uma coroutine
    doWorld()
}

suspend fun doWorld() = coroutineScope { // 2 Função suspensa que cria um novo escopo de coroutine
    launch {
        delay(1000L) // 3 Simula uma operação assíncrona com delay
        println("World!")
    }
    print("Hello ")
}
