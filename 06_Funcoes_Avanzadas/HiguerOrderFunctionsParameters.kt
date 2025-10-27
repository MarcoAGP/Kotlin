fun calculate(
    x: Int,
    y: Int,
    operation: (Int, Int) -> Int,
): Int { // 1 Vai receber dois Ints e uma função que recebe dois Ints e retorna um Int
    return operation(x, y) // 2 Retorna o resultado da operação aplicada aos dois Ints
}

fun sum(
    x: Int,
    y: Int,
) = x + y // 3 Função que recebe dois Ints e retorna a soma deles

fun main() {
    val sumResult = calculate(4, 5, ::sum) // 4 Vai chamar a função calculate passando a função sum como parâmetro
    val mulResult = calculate(4, 5) { a, b -> a * b } // 5 Vai chamar a função calculate passando uma lambda que multiplica os dois Ints
    println("sumResult $sumResult, mulResult $mulResult")
}

