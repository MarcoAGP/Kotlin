open class Tiger(
    val origin: String, // Variavel de instância do construtor primário
) {
    fun sayHello() { // Funação que usa a variável de instância
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia") // 1 Construtor primário da classe filha que chama o construtor primário da classe pai

fun main() {
    val tiger: Tiger = SiberianTiger() // 2 Polimorfismo atribuindo a classe filha para a classe pai
    tiger.sayHello()
}
