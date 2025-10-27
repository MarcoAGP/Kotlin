import java.util.Random

class LuckDispatcher { // 1 Classe com método para gerar número aleatório
    fun getNumber() { // 2 Função que gera e imprime um número aleatório
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher() // 3 Variáveis de instância da classe LuckDispatcher
    val d2 = LuckDispatcher()

    d1.getNumber() // 4 Acesso ao método getNumber() de cada instância
    d2.getNumber()
}
