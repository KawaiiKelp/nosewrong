package challenge

import java.net.URL

fun getURL(value: String): Result<URL> {
    return runCatching { URL(value) }
}

fun main() {
    print("URL을 입력하세요(주의: https 또는 http가 포함되어야 합니다!): ")
    val url = getURL(readln())

    url.onSuccess { println("성공! $it")}
    url.onFailure { println("실패! ${it.message}")}
}