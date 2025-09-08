package challenge

fun main() {
    print("숫자 입력: ")
    try {
        val input = readLine()!!.toInt() // 숫자가 아닐 시 오류 발생
        println("변환 성공: $input")
    } catch (e: NumberFormatException) { // 오류 처리
        println(0)
    } finally {
        println("입력 처리 완료")
    }

}