package tutorial

fun createUser(name: String?, age: Int) {
    requireNotNull(name) { "name은 null일 수 없습니다."} // 부적절한 인자
    require(age >= 0) { "나이는 음수일 수 없습니다." } // 부적절한 인자
    check(age < 200) { "비현실적인 나이" } // 비정상 상태(로직 버그)
}

fun main() {
    print("이름을 입력하세요: ")
    val name: String = readln()
    print("나이를 입력하세요: ")
    val age: Int = readln().toInt()
    try {
        createUser(name, age)
        print("이름: $name, 나이: $age")
    } catch (e: IllegalArgumentException) {
        print(e.message)
    } catch (e: IllegalStateException) {
        print(e.message)
    }

}