package i_function

import java.util.*

/*
### 연습문제 1: 성적 계산기

#### 문제 설명
학생들의 성적을 입력받아 평균 성적을 계산하는 함수를 작성하세요. 함수는 가변 인자를 받으며, 입력된 모든 성적의 평균을 반환해야 합니다.

#### 요구사항
- 함수 이름은 `calculateAverage`로 하세요.
- 성적은 가변 인자 `vararg`를 사용하여 받으세요.
- 평균은 소수점 두 자리까지 표시하세요.

--- 출력예시
[90, 80, 100, 70]
평균 성적은 85.00입니다.
 */

fun calculateAverage(vararg grades: Int): Double {
    println(Arrays.toString( grades ))
    return grades.sum().toDouble() / grades.size
}

fun main() {
    val array = arrayOf(90, 80, 100, 70)
    val average = calculateAverage(*array.toIntArray())
    println("평균 성적은 ${"%.2f".format(average)}입니다." )
}

