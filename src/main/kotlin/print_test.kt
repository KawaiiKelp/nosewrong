package kr.kro.kelp

import kotlin.reflect.typeOf

fun main() {
    print("첫번째 수 입력: ")
    val a = readLine()!!.toInt()
    print("두번째 수 입력: ")
    val b = readLine()!!.toInt()
    val c = a + b
    println("계산 결과: ${c}")
    println(a::class)
}