package tutorial

// 목표: 하나의 타입으로 여러 객체를 다루고, 서로 다른 동작을 구현

open class Animalz(val name: String) {
    open fun sound() = println("동물이 소리냄")
}

class Doggy(name: String) : Animalz(name) {
    override fun sound() = println("$name: 멍멍!")
}

class Kitty(name: String) : Animalz(name) {
    override fun sound() = println("$name: 야옹!")
}

fun main() {
    val animals: List<Animalz> = listOf(Doggy("코코"), Kitty("나비"))
    for (animal in animals) {
        animal.sound() // Dog, Cat 각자의 소리 출력
    }
}

// 핵심: 부모 타입 Animal로 다루지만, 실제 객체별로 다른 동작 실행