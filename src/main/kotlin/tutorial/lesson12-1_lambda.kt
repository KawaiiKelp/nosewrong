package tutorial

fun operate(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}
// operate는 연산 함수를 매개변수로 받는 함수
// +, *같은 동작을 바꿔서 실행 가능

fun main() {
    // 여기서 잠깐! 람다란?
    // 함수를 값처럼 다루는 방법, 즉 함수를 변수에 저장하거나 다른 함수에 전달할 수 있음
    // val add: (Int, Int) -> Int = { a, b -> a + b }
    // (Int, Int) -> Int → 함수 타입 (정수 2개 받아서 정수 1개 반환)
    // { a, b -> a + b } → 람다 식
    // -> 기준으로 왼쪽은 매개변수, 오른쪽은 반환 값
    // println(add(3, 5)) // 8

    val sum = operate(3, 4) { a, b -> a + b }
    val product = operate(3,4) { a, b -> a * b }

    println("합: $sum")
    println("곱: $product")

}