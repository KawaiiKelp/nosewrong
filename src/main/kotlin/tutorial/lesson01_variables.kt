package tutorial

fun main() {
    // val: 불변 (재할당 불가능)
    val name: String = "Kotlin"
    println("이름: $name")

    // var: 가변 (재할당 가능)
    var age: Int = 21
    println("나이: $age")
    age = 22
    println("변경된 나이: $age")

    // 타입 추론
    val pi = 3.14 // Double로 추론됨
    val lang = "Kotlin" // String으로 추론됨

    // Nullable 변수 (null 허용)
    val nickname: String? = null
    println("닉네임: $nickname")
}