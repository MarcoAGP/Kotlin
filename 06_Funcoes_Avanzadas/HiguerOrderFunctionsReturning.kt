fun operation(): (Int) -> Int { // 1 Função que retorna outra função que recebe um Int e retorna um Int
    return ::square
}

fun square(x: Int) = x * x // 2 Função que recebe um Int e retorna o quadrado dele

fun main() {
    val func = operation() // 3 Vai chamar a função operation e armazenar a função retornada em func
    println(func(2)) // 4 Imprime 4, que é o quadrado de 2
}

