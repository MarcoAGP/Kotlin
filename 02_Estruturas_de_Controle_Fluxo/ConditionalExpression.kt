fun main() {
    // Declaração antiga de função
    fun maxOld(
        a: Int,
        b: Int,
    ): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    // Declaração moderna de função com expressão condicional
    fun max( // Declaração de função
        a: Int,
        b: Int,
    ) = if (a > b) a else b // Faz uma verificação condicional e retorna o maior valor
    println(max(99, -42))
    println(maxOld(99, -42))
}
