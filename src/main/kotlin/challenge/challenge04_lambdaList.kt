package challenge

fun main() {
    print("숫자 입력(공백으로 구분): ")
    val list = readln().split(" ").map{it.toInt()}

    val evens = list.filter { it % 2 == 0 }
    val odds = list.filter { it % 2 != 0 }
    val squares = list.map { it * it }
    val sums = list.reduce { acc, i -> acc + i}

    println("짝수: $evens")
    println("홀수: $odds")
    println("제곱: $squares")
    println("합계: $sums")
}