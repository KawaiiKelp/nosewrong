package tutorial

fun add(a: Int, b: Int): Int {
    return a + b
}

fun greet(name: String = "손님") {
    println("안녕하세요, $name 님!")
}

fun main() {
    println(add(3, 5)) // 8
    greet("철수") // 안녕하세요, 철수 님!
    greet() // 안녕하세요, 손님 님!
}