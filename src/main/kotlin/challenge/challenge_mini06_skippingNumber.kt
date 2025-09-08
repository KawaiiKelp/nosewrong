package challenge

import java.io.File

fun sumError(fileName: String): Int {
    var sum = 0
    var lineNumber = 0

    File(fileName).bufferedReader().use { reader ->
        reader.forEachLine { line ->
            lineNumber++

            try {
                val number = line.toInt()
                sum += number
            } catch (e: NumberFormatException) {
                println("${lineNumber}번째 줄은 숫자가 아닙니다: '$line'")
            }
        }
    }

    return sum
}

fun main() {
    val result = sumError("C:/Users/User/Desktop/JAVA/nosewrong/kotlin/src/numbers.txt")
    print("합계: $result")
}