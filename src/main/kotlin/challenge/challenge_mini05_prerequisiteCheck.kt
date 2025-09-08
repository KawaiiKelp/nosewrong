package challenge

fun register(id: String?, password: String) {
    requireNotNull(id) { "아이디는 비워둘 수 없습니다." }
    require(password != "") { "비밀번호는 공백일 수 없습니다." }
}

fun main() {
    println("회원가입 절차를 시작합니다.\n")
    // print("아이디를 입력하세요: ")
    val id = null //readln()
    print("비밀번호를 입력하세요: ")
    val pw = readln()
    try {
        register(id, pw)
        println("회원가입 성공!")
    } catch (e: IllegalArgumentException) {
        println("회원가입에 실패하였습니다: " + e.message)
    } catch (e: IllegalStateException) {
        println("회원가입에 실패하였습니다: " + e.message)
    }
}