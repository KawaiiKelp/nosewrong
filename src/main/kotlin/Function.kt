package kr.kro.kelp

fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    println(add(x, y))
}

fun add(a: Int, b: Int): Int {
    return a + b
}