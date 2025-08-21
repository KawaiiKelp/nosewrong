package kr.kro.kelp

fun checkType(x: Any) {
    when (x) {
        is Int -> println("정수예요")
        is String -> println("문자열이에요")
        else -> println("이게 뭐예요?")
    }
}

fun main() {
    val x = 2

    when (x) {
        1 -> println("x는 1")
        2 -> println("x는 2")
        else -> println("그 외")
    }

    val day = 6

    when (day) {
        1, 7 -> println("주말")
        in 2..6 -> println("평일")
        else -> println("잘못된 값")
    }

    val score = 85
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59 -> "E"
        else -> "F"
    }
    val passed = when (grade) {
        in "A".."C" -> true
        else -> false
    }
    println("점수: $score")
    println("학점: $grade")
    if (passed == true) {
        println("합격입니다! 축하합니다!")
    }
    else {
        println("불합격입니다. 다음에 다시 도전하세요!")
    }

    val num = 5
    when {
        num > 0 -> println("양수")
        num < 0 -> println("음수")
        else -> println("0")
    }
}