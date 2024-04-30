package j_class

import jdk.jfr.DataAmount

/*
    연습문제 1: 은행 계좌 클래스 만들기

    요구사항:

    - BankAccount 클래스를 만듭니다.
    - 계좌 잔액(balance)을 나타내는 프로퍼티를 포함하세요. 초기 잔액은 0으로 설정합니다.
    - 입금(deposit)과 출금(withdraw) 메서드를 구현합니다. 출금 시 잔액보다 많은 금액을 출금하려고 하면 오류 메시지를 출력합니다.
    - 계좌의 현재 잔액을 반환하는 메서드 getBalance()를 만드세요.
    - 메인 메서드에서 계좌 인스턴스를 생성하고 메서드를 호출해서 각 상황마다 테스트하세요.
 */

class BankAccount(var balance: Int = 0) {
    fun deposit(amount: Int) {
        balance += amount
    }
    fun withdraw(amount: Int) {
        if (amount > balance) {
            println("출금할 금액보다 잔고가 부족합니다.")
        } else {
            balance -= amount
        }
    }
}

fun main() {
    val bankAccount = BankAccount(10000)
    bankAccount.deposit(10000)
    bankAccount.withdraw(20000)
    println("현재 잔고 : ${bankAccount.balance} ")
    bankAccount.withdraw(1000)  // 오류 메시지
}


