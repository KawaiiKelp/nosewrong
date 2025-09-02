package challenge

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("새 강아지 이름을 입력하세요: ")
    val name = scanner.nextLine()
    print("새 강아지 나이를 입력하세요: ")
    val age = scanner.nextInt()

    val newDog = Dog(name, age)

    val animals = mutableListOf<Animal>()
    animals.add(newDog)

    for (animal in animals) {
        animal.age()
        animal.sound()
    }
}