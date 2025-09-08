package tutorial

// 목표: 리스트, 맵 등 컬렉션을 활용해 객체 관리

class Zoo {
    private val animals = mutableListOf<Animalz>()

    fun addAnimal(animal: Animalz) = animals.add(animal)
    fun allSounds() = animals.forEach { it.sound() }

    fun findOldest(): Animalz? = animals.maxByOrNull { (it as? Ageable)?.age ?: 0 }
}

interface Ageable {
    val age: Int
}

class Doggy2(name: String, override val age: Int) : Animalz(name), Ageable {
    override fun sound() = println("$name: 멍")
}

class Kitty2(name: String, override val age: Int) : Animalz(name), Ageable {
    override fun sound() = println("$name: 냥")
}

fun main() {
    val zoo = Zoo()
    zoo.addAnimal(Doggy2("코코", 3))
    zoo.addAnimal(Kitty2("나비", 5))
    zoo.allSounds()
    println("나이가 가장 많은 동물: ${(zoo.findOldest() as? Ageable)?.age}")
}

// 핵심: 컬렉션 + 상속 + 인터페이스 + 다형성 결합