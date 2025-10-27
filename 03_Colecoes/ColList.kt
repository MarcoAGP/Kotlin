val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // 1 Cria uma Variável inmutável mais os elementos dentro dela são mutáveis
val sudoers: List<Int> = systemUsers // 2 Cria uma cópia de leitura da lista systemUsers

fun addSystemUser(newUser: Int) { // 3 Função para adicionar um novo usuário ao sistema
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> { // 4 Retorna a copia de leitura da lista de usuários do sistema
    return sudoers
}

fun main() {
    addSystemUser(4) // 5 Adiciona o usuário com id 4
    println("Tot sudoers: ${getSysSudoers().size}") // 6 Imprime o total de usuários com privilégios de leitura
    getSysSudoers().forEach { // 7 Percorre a lista de usuários com privilégios de leitura
        i ->
        println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error! // 8 Simula um erro de compilação, pois a lista sudoers é imutável
}
