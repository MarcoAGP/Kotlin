class MutableStack<E>(
    vararg items: E,
) { // 1 Pilha mutabel, <E> = Parametro generico, Vararg vai receber uma lista de E

    private val elements = items.toMutableList() // Os items que foram passados no construtor vao para uma lista mutavel

    fun push(element: E) = elements.add(element) // 2 Pega um elemento do tipo E e adiciona na lista

    fun peek(): E = elements.last() // 3 Pega o ultimo elemento da pilha sem remover

    fun pop(): E = elements.removeAt(elements.size - 1) // 4 Remove e retorna o ultimo elemento da pilha

    fun isEmpty() = elements.isEmpty() // 5 Verifica se a pilha esta vazia

    fun size() = elements.size // 6 Retorna o tamanho da pilha

    override fun toString() = "MutableStack(${elements.joinToString()})" // 7 Representacao em string da pilha
}

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7) // Podemos usar String, Int, Double, etc
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
