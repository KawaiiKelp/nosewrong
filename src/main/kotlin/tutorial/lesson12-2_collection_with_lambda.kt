package tutorial

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // 짝수만 필터링
    val evens = numbers.filter { it % 2 == 0 } // it은 람다의 매개변수가 하나일 때 자동으로 이름 붙여주는 예약어

    // 모든 값에 제곱 적용
    val squares = numbers.map { it * it }

    println("짝수: $evens")
    println("제곱: $squares")
}