fun main() {
    var neverNull: String = "This can't be null" // 1 Declaramos o valor como string valida
    neverNull = null // 2 Erro: Não pode ser atribuida como valor nulo

    var nullable: String? = "You can keep a null here" // 3 ? = Aceita valor string ou nulo
    nullable = null // 4 atribui nulo

    var inferredNonNull = "The compiler assumes non-null" // 5 atribuida para ser não nulo
    inferredNonNull = null // 6 Erro: ao tentar atribuir um valor nulo

    fun strLength(notNull: String): Int { // 7 Declaramos uma string que está esperando como parametro um valor não nulo
        return notNull.length
    }
    strLength(neverNull) // 8
    strLength(nullable) // 9 o tipo real é 'Nulo?', mas 'String' era esperado.

    fun describeString(maybeString: String?): String { // 1
        if (maybeString != null && maybeString.length > 0) { // 2
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }
    println(describeString(null))
    println(describeString(""))
    println(describeString("unemat.br"))
}
