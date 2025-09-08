package challenge

fun safeDivide(a: Int, b: Int): Double {
    return try {
        if (b == 0) {
            Double.NaN
        } else {
            a.toDouble() / b.toDouble()
        }
    } catch (e: ArithmeticException) {
        Double.NaN
    }
}

fun main() {
    println(safeDivide(4, 0))
    println(safeDivide(4, 2))
    println(safeDivide(10, 0))
}