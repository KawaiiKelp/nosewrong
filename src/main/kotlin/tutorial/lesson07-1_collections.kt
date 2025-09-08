package tutorial

fun main() {
    // 리스트 (순서 O, 중복 O)
    val fruits = listOf("사과", "바나나", "체리")
    println(fruits[0]) // 사과
    println("과일 개수: ${fruits.size}")

    // 가변 리스트
    val mutableFruits = mutableListOf("사과", "바나나")
    mutableFruits.add("포도")
    println(mutableFruits)

    // 집합 (Set: 순서 X, 중복 X)
    val numbers = setOf(1, 2, 2, 3, 3, 3)
    println(numbers) // [1, 2, 3]

    // 맵 (key-value)
    val ages = mapOf("철수" to 20, "영희" to 21)
    println(ages["철수"]) // 20

    // 가변 맵
    val mutableAges = mutableMapOf("철수" to 20)
    mutableAges["영희"] = 21
    println(mutableAges)

    // 고차 함수 예시 (map, filter)
    val doubled = listOf(1, 2, 3, 4).map { it * 2 }
    println(doubled) // [2, 4, 6, 8]

    val evens = (1..10).filter { it % 2 == 0 }
    println(evens) // [2, 4, 6, 8, 10]

    /* 여기서 알 수 있는 규칙
     listOf / mutableListOf -> 읽기 전용 vs 수정 가능
     setOf / mapOf 도 같은 규칙
     map {} / filter {} 등 람다 기반 함수형 처리 가능

     정리하면:
     lesson06: 객체지향 심화 (상속, 인터페이스)
     lesson07: 자료구조 & 함수형 스타일
     */

}