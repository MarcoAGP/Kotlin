class BigBen { // 1 Definição da classe BigBen
    companion object Bonger { // 2 Cria um objeto companheiro chamado Bonger
        fun getBongs(nTimes: Int) { // 3 Função que imprime "BONG" nTimes vezes
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12) // 4 Faz a chamada da função getBongs do objeto companheiro
}
