package challenge

// 클래스 생성
open class Animal(val name: String, val age: Int) {
    open fun sound() {
        println("$name: ???")
    }
    open fun age()  {
        val sortedAge = ageCategory(age)  // ageCategory 호출
        println("$name (${age}살) -> $sortedAge")
    }
}

// 상속
class Dog(name: String, age: Int) : Animal(name, age) {
    override fun sound() {
        println("$name: 멍멍!")
    }
}

class Cat(name: String, age: Int) : Animal(name, age) {
    override fun sound() {
        println("$name: 야옹~")
    }
}

// 메인 메서드
fun main() {
    // 객체 생성 (클래스와 연결)
    val dog = Dog("야옹이", 5)
    val cat = Cat("멍멍이", 10)

    // 부모 타입 Animal로 묶는 과정(List에 담기)
    val animals: List<Animal> = listOf(dog, cat)

    for (animal in animals) {
        animal.sound()
    }
}