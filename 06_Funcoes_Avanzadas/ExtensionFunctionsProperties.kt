data class Item(
    val name: String,
    val price: Float,
) // 1 Classe Item com propriedades name e price

data class Order(
    val items: Collection<Item>,
)

// 2 Função de extensão que retorna o preço do item mais caro ou 0 se não houver itens
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F

fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String // 3 Valor de extensão que retorna os nomes dos itens separados por vírgula
    get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}") // 4 Imprime o nome do item mais caro
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}") // 5 Imprime os nomes dos itens separados por vírgula
}

