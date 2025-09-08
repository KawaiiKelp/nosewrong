package tutorial

// 목표: 데이터에 직접 접근하지 않고, 안전하게 접근/수정하는 방법을 이해

class BankAccount(private var balance: Int) {
    fun deposit(amount: Int) {
        if (amount > 0) balance += amount
    }

    fun withdraw(amount: Int): Boolean {
        return if (amount <= balance) {
            balance -= amount
            true
        } else {
            false
        }
    }

    fun getBalance(): Int = balance
}

fun main() {
    val account = BankAccount(100)
    account.deposit(50)
    println(account.getBalance()) // 150
    val success = account.withdraw(200)
    println(success) // false
    println(account.getBalance()) // 150
}

// 핵심: private + getter/setter로 외부에서 데이터를 통제