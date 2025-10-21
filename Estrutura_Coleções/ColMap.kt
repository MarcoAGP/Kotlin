const val POINTS_X_PASS: Int = 15 // Constante imutável
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100) // 1 Variável imutável recebendo uma instancia de Map mutável
val EZPassReport: Map<Int, Int> = EZPassAccounts // 2 Variável imutável recebendo uma cópia de leitura do Map EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) { // 3 Verifica se a chave (accountId) existe no Map
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS // 4 Verifica o valor atual e adiciona os 15 pontos
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() { // Função de controle para imprimir o relatório
    println("EZ-Pass report:")
    EZPassReport.forEach { // 5 Varredura do Map de leitura
        k, v ->
        println("ID $k: credit $v") // Imprime os accountId (k) e o valor do crédito (v)
    }
}

fun main() {
    accountsReport() // 6 Gera o report de todas as contas
    updatePointsCredit(1) // 7 adiciona credito na conta 1 duas vezes (100 + 15 + 15 = 130)
    updatePointsCredit(1)
    updatePointsCredit(5) // 8 Tenta adicionar crédito em uma conta inexistente
    accountsReport() // 9 Gera o report atualizado de todas as contas novamente
}

