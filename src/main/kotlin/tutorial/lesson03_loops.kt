package tutorial

fun main() {
    // for 문 (범위 사용)
    for (i in 1..5) {
        println("i = $i")
    }
    // for 문 (배열 순회)
    val fruits = listOf("사과", "바나나", "체리", "복숭아", "딸기")
    for (fruit in fruits) {
        println("과일: $fruit")
    }
    // while 문
    var n = 3
    while (n > 0) {
        println("n = $n")
        n--
    }
}