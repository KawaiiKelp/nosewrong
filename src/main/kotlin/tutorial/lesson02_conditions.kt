package tutorial

fun main() {
    print("점수 입력: ")
    val score = readln().toInt() // null 안됨

    // if-else
    if (score >= 90) {
        println("A 학점")
    } else if (score >= 80) {
        println("B 학점")
    } else if (score >= 70) {
        println("C 학점")
    } else if (score >= 60) {
        println("D 학점")
    } else {
        println("F 학점")
    }

    // when (switch case문과 같음)
    val grade = when (score / 10) {
        10, 9 -> 'A'
        8 -> 'B'
        7 -> 'C'
        6 -> 'D'
        else -> 'F'
    }
    println("등급: $grade")

    val passed = when (grade) {
        'A' -> true
        'B' -> true
        'C' -> true
        else -> false
    }

    if (passed == true) {
        println("합격을 축하드립니다.")
    } else {
        println("불합격입니다. 다시 도전하세요.")
    }
}