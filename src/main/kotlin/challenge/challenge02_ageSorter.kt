package challenge

fun ageCategory(age: Int): String {
    val sortedAge = when(age) {
        in 0..3 -> "어린이"
        in 4..8 -> "성인"
        else -> "노년"
    }
    return sortedAge
}

fun main() {
    val dog = Dog("야옹이", 5)
    val cat = Cat("멍멍이", 10)

    val animals = listOf(dog, cat)

    for (animal in animals) {
        animal.sound()
        animal.age()
    }
}