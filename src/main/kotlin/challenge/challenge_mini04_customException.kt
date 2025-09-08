package challenge

class InvalidEmailException(
    val email: String,
    val notHaving: String
) : Exception("검증 오류: 형식이 잘못되었습니다. $notHaving")

fun validateEmail(email: String): Boolean {
    if (!email.contains("@") && !email.contains(".")) {
        throw InvalidEmailException(email, "이메일에는 @와 . 문자가 포함되어야 합니다.")
    }
    if (!email.contains("@")) {
        throw InvalidEmailException(email, "이메일에는 @ 문자가 포함되어야 합니다.")
    }
    if (!email.contains(".")) {
        throw InvalidEmailException(email, "이메일에는 . 문자가 포함되어야 합니다.")
    }
    return true
}

fun main() {
    print("이메일을 입력하세요: ")
    val inputEmail: String = readln()

    try {
        val result = validateEmail(inputEmail)
        println("검증 성공: $result")
    } catch (e: InvalidEmailException) {
        println(e.message)
    }
}