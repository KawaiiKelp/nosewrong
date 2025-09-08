package tutorial

fun main() {
    try { // 예외가 날 수도 있는 코드
        val n = "123a".toInt() // NumberFormatException 발생
        println("변환 성공: $n")
    } catch (e: NumberFormatException) { // 특정 예외를 잡아 처리(여기서는 NumberFormatException)
        println("숫자로 변환할 수 없습니다: ${e.message}")
    } finally { // 예외와 무관하게 항상 실행 (파일 닫기 같은 정리 작업)
        println("무조건 실행(자원 정리 등에 사용)")
    }

    println(safeParseInt("40"))
    println(safeParseInt("40a"))

    println(withdraw(5, 0)) // 예외 발생(amount가 양수가 아님)
    println(withdraw(5, 5))
    println(withdraw(50, 5))
}

fun safeParseInt(s: String): Int {
    val value = try {
        s.toInt()
    } catch (e: NumberFormatException) {
        -1
    }
    return value
}

fun withdraw(balance: Int, amount: Int): Int {
    if (amount <= 0) throw IllegalArgumentException("amount는 양수여야 합니다.")
    if (amount > balance) throw IllegalStateException("잔액이 부족합니다.")
    return balance - amount
}