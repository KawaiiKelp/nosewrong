package tutorial

// 기본 클래스
open class Animal(val name: String) {
    open fun sound() {
        println("$name: ???")
    }
}

// 상속
class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name: 멍멍!")
    }
}

class Cat(name: String) : Animal(name) {
    override fun sound() {
        println("$name: 야옹~")
    }
}

// 인터페이스
interface Pet {
    fun play()
}

class Hamster(name: String) : Animal(name), Pet {
    override fun sound() {
        println("$name: 찍찍")
    }

    override fun play() {
        println("${name}가 바퀴를 돌립니다 🐹")
    }
}

fun main() {
    val dog = Dog("초코")
    val cat = Cat("나비")
    val hamster = Hamster("햄찌")

    val animals = listOf(dog, cat, hamster)

    for (a in animals) {
        a.sound()
    }

    hamster.play()
}