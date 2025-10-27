open class Dog { // 1 Classe pai
    open fun sayHello() { // 2 Propriedade/método que pode ser sobrescrito aberto para override
        println("wow wow!")
    }
}

class Yorkshire : Dog() { // 3 Classe filha
    override fun sayHello() { // 4 Override para sobrescrever o método da classe pai
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire() // 5 Polimorfismo atribuindo a classe filha para a classe pai
    dog.sayHello() // 6 Chama o método sobrescrito da classe filha
}
