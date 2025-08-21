package kr.kro.kelp

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {

    print("x 값을 입력하세요(공백/문자 불가): ")
    var x = readLine()!!.toInt()
    println(" ")

    print("y 값을 입력하세요(공백/문자 불가): ")
    var y = readLine()!!.toInt()
    println(" ")
    var z = x+y

    if (x >= y) {
        println("출력 값은 ${z}입니다.")
        println("그리고, ${x} 가 ${y} 보다 큽니다.")
    }
    else if (y >= x) {
        println("출력 값은 ${z} 입니다.")
        println("그리고, ${y} 가 ${x} 보다 큽니다.")
    }

}