fun main() {
    // All examples create a function object that performs upper-casing.
    // So it's a function from String to String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1 Variavel upperCase1 é uma função que recebe uma String e retorna a String em maiúsculas

    val upperCase2: (String) -> String = { str -> str.uppercase() } // 2 Variavel upperCase2 é uma função que recebe uma String e retorna a String em maiúsculas

    val upperCase3 = { str: String -> str.uppercase() } // 3 Variavel upperCase3 é uma função que recebe uma String e retorna a String em maiúsculas

    // val upperCase4 = { str -> str.uppercase() }                          // 4
    // Variavel upperCase4 é uma função que recebe uma String e retorna a String em maiúsculas

    val upperCase5: (String) -> String = { it.uppercase() } // 5 Variavel upperCase5 é uma função que recebe uma String e retorna a String em maiúsculas

    val upperCase6: (String) -> String = String::uppercase // 6 Variavel upperCase6 é uma função que recebe uma String e retorna a String em maiúsculas

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}

