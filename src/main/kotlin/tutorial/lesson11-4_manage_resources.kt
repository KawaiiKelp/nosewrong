package tutorial

import java.io.File
import java.io.FileNotFoundException

fun sumFile(path: String): Int {
    return File(path).bufferedReader().use { br ->
        br.lineSequence()
            .filter { it.isNotBlank() }
            .sumOf { it.trim().toInt() } // NumberFormatException 가능
    }
}

fun main() {
    try {
        println(sumFile("C:/Users/"))
    } catch (e: NumberFormatException) {
        println(e.message)
    } catch (e: FileNotFoundException) {
        println(e.message)
    }
}