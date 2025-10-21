fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain") // setOf Não aceita duplicados
    val writers = setOf("Twain", "Shakespeare", "Hemingway") // setOf não se importa com a ordem

    println(authors == writers) // 1 Comparação Estrutural = true
    println(authors === writers) // 2 Comparação Referencial, Mesma alocação na memória = false
}
