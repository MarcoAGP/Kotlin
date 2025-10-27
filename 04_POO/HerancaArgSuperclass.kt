open class Lion( // Classe pai com construtor primário
    val name: String,
    val origin: String,
) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic( // Classe filha que chama o construtor primário da classe pai
    name: String,
) : Lion(name = name, origin = "India") // 1 Atribui origem fixa "India" ao chamar o construtor da classe pai

fun main() {
    val lion: Lion = Asiatic("Rufo") // 2 Atribui nome "Rufo" ao criar a instância da classe filha
    lion.sayHello()
}
