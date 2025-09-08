package tutorial

class NotEnoughStockException(
    val need: Int,
    val have: Int
) : RuntimeException("재고 부족: 필요=$need, 보유=$have")

fun takeFromStock(need: Int, have: Int) {
    if (need > have) throw NotEnoughStockException(need, have)
}

fun main() {
    println(takeFromStock(4, 0))
}