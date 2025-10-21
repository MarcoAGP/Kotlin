fun main() {
    println(whenAssign("Hello")) // Vai cair na 2da opção e retornar 1
    println(whenAssign(3.4)) // Vai cair na 4ta opção e retornar 42
    println(whenAssign(1)) // Vai cair na 1ra opção e retornar "one"
    println(whenAssign(MyClass())) // Vai cair na 5ta opção e retornar 42
}

fun whenAssign(obj: Any): Any {
    val result =
        when (obj) { // 1 When como expressão atribuindo valor a result
            1 -> "one" // 2 Se obj for 1, atribui "one" ao result
            "Hello" -> 1 // 3 Atribui 1 ao result se obj for "Hello"
            is Long -> false // 4 Se obj for do tipo Long, atribui false ao result
            else -> 42 // 5 Se nenhuma condição for satisfeita, atribui 42 ao result
        }
    return result
}

class MyClass
