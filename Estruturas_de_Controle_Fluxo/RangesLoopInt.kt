fun main() {
    for (i in 0..3) { // 1 Vai de 0 a 3 incluindo o 3
        print(i)
    }
    print(" ")

    for (i in 0 until 3) { // 2 Vai de 0 a 3 excluindo o 3
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) { // 3 Vai de 2 a 8 de 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) { // 4 Vai de 3 a 0
        print(i)
    }
    print(" ")
}

