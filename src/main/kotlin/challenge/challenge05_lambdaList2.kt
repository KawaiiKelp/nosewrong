package challenge

fun main() {
    print("숫자 입력(공백으로 구분): ")
    val list = readln().split(" ").map{it.toInt()}

    val max = list.maxOrNull()
    val min = list.minOrNull()
    val avg = list.average()
    val dis = list.distinct()
    val desc = list.sortedDescending()

    println("최댓값: $max")
    println("최솟값: $min")
    println("평균값: $avg")
    println("중복 제거: $dis")
    println("내림차순 정렬: $desc")

}