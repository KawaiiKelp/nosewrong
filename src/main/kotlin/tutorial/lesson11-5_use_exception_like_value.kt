package tutorial

fun parsePositiveInt(s: String): Result<Int> =
    runCatching { s.toInt() }
        .mapCatching { n ->
            require(n > 0) { "양수만 허용" }
            n
        }
fun main() {
    val r = parsePositiveInt("10")
    println(r.getOrElse { -1 }) // 성공이면 10, 실패면 1
}