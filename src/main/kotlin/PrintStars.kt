package kr.kro.kelp

fun main() {
    for (i in 0..5) {
        for (j in 0..i) {
            print('*')
        }
        println(" ")
    }
    for (i in 1..5) {
        for (j in i..5) {
            print('*')
        }
        println(" ")
    }
}