class Customer // 1 Declaramos uma classe Cliente

class Contact(
    val id: Int,
    var email: String,
) // 2 Construtor primário com propriedades mutáveis e imutáveis

fun main() {
    val customer = Customer() // 3 Como criar uma instância da classe Customer
    val contact = Contact(1, "mary@gmail.com") // 4 Passando argumentos para o construtor primário
    println(contact.id) // 5
    println(contact.email) //
    contact.email = "jane@gmail.com" // 6
    println(contact.email) //
}
