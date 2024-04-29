package e_control

fun main() {
    // if, if-else, if-else-if
    // 기본적으로 자바와 사용법이 같다.

    // 차이점
    // 자바에서 if-else 문은 Statement(명령문)
    // 코드 블록을 실행하고 흐름을 제어, 하나의 값으로 리턴되지 않음.

    100 + 200               // 표현식 Expression
    val number = 100 + 200  // 명령문 Statement

    // 코틀린에서 if-else 문은 Expression(표현식)
    // 표현식 : 값을 반환할 수 있고, 다른 변수에 할당하거나, 표현식의 일부로 사용할 수 있음.

    var age = 20

    // 명령문 (자바에서 사용방법)
    if (age > 19) {
        println("성인입니다.")
    } else {
        println("미성년자입니다.")
    }

    // 표현식
    val status = if (age > 19) "성인" else "미성년자"

    println("표현식 : ${status}입니다.")

    // 코틀린에서는 if-else를 표현식으로 사용가능하기 때문에 3항 연산자 없음.
}
