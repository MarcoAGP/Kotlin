fun main() {
    val x = 2 // Variavel imutavel
    if (x in 1..5) { // X esta no intervalo de 1 a 5
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) { // X nao esta no intervalo de 6 a 10
        print("x is not in range from 6 to 10")
    }
}

