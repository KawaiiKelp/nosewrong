package tutorial

class Person(val name: String, var age: Int) {
    fun introduce() {
        println("안녕하세요, 저는 ${name}이고 ${age}살입니다.")
    }
}

fun main() {
    val p1 = Person("홍길동", 20)
    p1.introduce() // 클래스 불러오기
    p1.age = 21 // 나이 수정
    p1.introduce() // 클래스 다시 불러오기
}