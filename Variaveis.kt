fun main() {
    var a: String = "initial" // 1 var é mutável
    println(a)
    a = "final"
    println(a)

    val b: Int = 1 // 2 val é inmutável, esplícitamente falando o tipo = inteiro
    val c = 3 // 3 inferencia de tipo do kotlin
    println(b)
    println(c)

    fun someCondition() = true // Caso seja false entra na segunda condição

    val d: Int // 1 Não atribuida
    if (someCondition()) {
        d = 1 // 2 Entra na condição de atribuição
    } else {
        d = 2 // 3 Caso não seja atribuida entra nesta condição
    }
    println(d)
}
