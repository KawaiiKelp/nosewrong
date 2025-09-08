package challenge

data class Student(val name: String, val age: Int, val scores: List<Int>) : Person {
    fun averageScore(): Double {
        return scores.average()
    }

    override fun introduce(): String {
        return "저는 ${name}이고 나이는 ${age}입니다."
    }
}

class Teacher(val name: String) : Person {
    fun greet(): String {
        return "저는 $name 선생님입니다."
    }

    override fun introduce(): String {
        return "저는 $name 선생님입니다."
    }
}
interface Person {
    fun introduce(): String
}

fun main() {
    val students = listOf(
        Student("Alice", 20, listOf(80, 90, 70)),
        Student("Bob", 22, listOf(60, 75, 68)),
        Student("Clams92", 19, listOf(40, 55, 78))
    )

    val teacher = Teacher("Mr. Kim")

    // 소개 출력
    students.forEach { println(it.introduce()) }
    println(teacher.introduce())

    val goodScores = students.filter { it.averageScore() >= 70 }.map{ it.name }
    val bestStudents = students.maxByOrNull { it.averageScore() }?.name
    val studentsSort = students.sortedBy { it.name }.map{ it.name }

    println("평균 점수 70 이상: $goodScores")
    println("최고 점수 학생: $bestStudents")
    println("알파벳 순: $studentsSort")
}