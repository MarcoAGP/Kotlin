fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty =
        "test".let {
            // 1 Variável que representa o valor "test"
            customPrint(it) // 2 Chamando a função customPrint com o valor "test"
            it.isEmpty() // 3 Verifica se a string é vazia ou não, retornando false ou true
        }
    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {
            // 4 Execução do bloco somente se string não for nulo
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(
        strOne: String?,
        strTwo: String?,
    ) {
        strOne?.let { firstString ->
            // 5 Função aninhada let para verificar se ambas as strings não são nulas
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")
}
