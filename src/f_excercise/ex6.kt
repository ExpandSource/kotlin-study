package f_excercise

/*
### 연습문제 6: 시간대에 따른 인사 메시지

문제:
현재 시간(24시간제)에 따라 다른 인사 메시지를 출력하는 프로그램을 작성하세요. `when` 구문을 사용하여 오전, 오후, 저녁, 밤에 따라 적절한 메시지를 출력합니다.

요구사항:
- 변수 `currentHour`를 선언하고, 현재 시간에 해당하는 값을 할당하세요(시뮬레이션을 위해 임의의 값을 사용).
- `when` 구문을 사용하여 시간대에 따라 다음과 같이 메시지를 출력하세요:
  - 6시부터 11시까지: "좋은 아침입니다!"
  - 12시부터 17시까지: "좋은 오후입니다!"
  - 18시부터 21시까지: "좋은 저녁입니다!"
  - 22시부터 5시까지: "좋은 밤입니다!"

실행 예시:
```
좋은 오후입니다!
```
*/

fun main() {
    val currentHour = 20
    val message = when (currentHour) {
        in 6..11 -> "좋은 아침입니다!"
        in 12..17 -> "좋은 오후입니다!"
        in 18..21 -> "좋은 저녁입니다!"
        else -> "좋은 밤입니다!"
    }
    println(message)
}
