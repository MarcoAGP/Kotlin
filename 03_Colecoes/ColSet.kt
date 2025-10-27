// Variável imutável recevendo uma instancia de Set mutável, criando uma coleção de elementos únicos
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean { // Função que tenta adicionar um novo elemento ao Set
    return openIssues.add(uniqueDesc) // 2 Retornando true se adicionado com sucesso ou false se já existir
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected." // 3 Verifica se o elemento foi adicionado ou não
}

fun main() {
    val aNewIssue: String = "uniqueDescr4" // Incluindo um novo elemento único
    val anIssueAlreadyIn: String = "uniqueDescr2" // Tentando incluir um elemento que já existe

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}") // 4 Imprime o status da adição do novo elemento
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}") // 5 Imprime o status da tentativa de adição do elemento duplicado
}

