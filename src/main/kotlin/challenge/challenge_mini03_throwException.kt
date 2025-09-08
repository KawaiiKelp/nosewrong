package challenge

fun setAge(age: Int): Int {
    if (age < 0) throw IllegalArgumentException("음수 나이 불가")
    return age
}

fun main() {
    println(setAge(4))
    println(setAge(-1)) // 예외 발생
}