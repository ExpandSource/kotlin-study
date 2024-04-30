# 코틀린

## 코틀린 언어 소개
- JetBrains 사 에서 오픈소스 그룹을 만들어 개발한 프로그래밍 언어
- 2011 년에 개발되고 2016년에 정식 출시
- 자바를 대체할 목적으로 만들어진 언어 
  - 자바의 단점 : 코드 장황하고, 복잡함, 설계, null 다루는 문제
    - 해당 단점을 개선하고자 만든 언어.
  - 코틀린의 특징
    - 간결한 코드
    - 안전한 코드
    - 자바와 100% 호환
    - 함수형 프로그래밍 지원
- Android 개발사 구글이 2017년에 안드로이드 공식언어로 코틀린을 추가
- 2019년부터 Kotlin First 를 선언하며 공식문서 샘플코드를 Java -> Kotlin 우선으로 변경
  - 이후 구글에서 작성하는 안드로이드 프로젝트는 Kotlin 으로 작성

  - 코틀린에 대한 조각 지식
    - 코틀린은 정적 타입 언어
    - 무료 오픈 소스 아파치2.0 라이센스 : 상업적 이용에 제한을 두고 있지 않음.
    - 확장자는 kt 이다.
    - 자바와 다르게 문장의 끝에 세미콜론을 붙이지 않아도 됨.
    - 주석 처리 방법은 자바와 동일.
    - 별도의 접근제한자를 붙이지 않으면 모두 public
    - 함수는 fun 이라는 키워드를 사용한다.
    - 자바에서는 '타입 변수명'이지만, 코틀린에서는 '변수명: 타입'으로 선언
    - 변수나 함수 클래스 모두 Top-Level(최상단)에 선언 가능

## 변수 선언
  1. val (Value)
    - java 의 final 키워드와 유사
    - 불변(immutable) 변수, 한 번 초기화하면 값을 변경할 수 없음.
  2. var (Variable)
    - 가변(mutable) 변수
    - 초기화 후에도 값을 변경할 수 있음.
    - 값이 업데이트 되어야 하는 경우에 var 를 사용함.
  
  - 타입을 명시적으로 작성하지 않아도 초기화된 값을 기준으로 타입을 추론
  - 만약 초기값을 작성하지 않는 경우는 반드시 명시적으로 타입을 작성해야 함.
  - 모든 변수는 우선 val로 만들고 업데이트가 필요한 경우 var을 사용함. 

 ## 코틀린의 타입
  - 자바의 primitive Type에 해당하는 Basic Type 기본 타입
  - 일반 클래스(포장 클래스)처럼 보이는 (ex. Int) 형태로 작성되지만
  - 내부적(컴파일 단계)으로는 primitive Type으로 처리 됨.
  - 객체를 인스턴스화할 때 new 키워드를 붙이지 않는다.
  - Java 에서처럼 자동 프로모션 캐스팅은 되지 않는다. 
    - 명시적으로 타입을 변환해줘야 함. 변수명.toType() ex) number.toLong()
  - 타입 체크
    - java에서 `instanceOf` 로 타입확인
    - 코틀린에서는 `is`  변수 is 타입 => Boolean
    - is로 체크되어 true가 된 타입은 스마트 캐스팅되어 해당 클래스 사용 가능
  - 코틀린의 특수 타입
    1. Any - 모든 객체의 최상위 타입
    2. Unit - Java의 void에 해당, 리턴값이 없음. 생략 가능.
    3. Nothing - 함수가 정상적으로 끝나지 않음
  - 문자열 템플릿
    - 문자열 내부에 ${변수명}, ${표현식} 등으로 사용가능
    - 가독성 높은 깔끔한 코딩 가능

## 연산자
  - 기본적인 단항, 산술, 대입 연산자는 Java와 동일
  - 비교 연산자 : 객체 간의 비교 연산자 사용이 가능 (Comparable 인터페이스 구현시)
  - 동등성 비교 : `==`  (java의 equals) 
  - 동일성 비교 : `===` (java의 `==`)
  - 특수 연산자
    1. in : 컬렉션이나 범위에 포함됨
    2. a..b : a부터 b까지의 범위 1..100
    3. a[i] : 특정 인덱스의 값을 가져옴.
    4. a[i] = b : 특정 인덱스의 값을 넣음. 

## 제어문
  1. if문
    - 기본적으로 Java와 동일함.
    - 자바에서 if-else는 Statement, 코틀린에서는 Expression 
  2. when문
    - Java의 switch - case 의 확장
    - 여러개의 조건이나 타입, 범위, 클래스와 조합해서 사용 가능
  3. for문
    - for-each 문 : for (number in numbers)
    - 기본 for 문 : for (i in 1..100)
      - 등차수열 방식으로 step, downTo 로 스텝, 역순 등을 조정할 수 있음.
  4. while문
    - Java와 동일

## null 안전성
 -  코틀린의 변수는 기본적으로 null을 허용하지 않는다.
    -  잠재적인 NPE 문제에 대해서 안전성을 갖춤.
 1. nullable(Type?) null값이 필요한 경우 명시적으로 선언
 2. safe Call(?.)  null값이 포함될 수 있는 속성이나 함수는 안전 호출
 3. elvis operator(?:) null값이 감지될 경우 어떻게 할지 선언
 4. 단언 연산자(!!)  강제로 null 안전하다고 선언 

## 예외처리
 - Checked Exception : 컴파일 시점 처리를 강제하는 예외
 - Unchecked Exception : 런타임에 발생하는 예외
 - 코틀린은 자바와 다르게 모든 예외가 Unchecked Exception
 - 예외 발생 코드를 최소화하고, 발생 가능성 있는 예외는 적절하게 처리

## 함수
  - 선언문법
    ```
    접근지시어 fun 함수이름(매개변수): 리턴타입 {}
    ```
  - 단일표현식 : 함수가 한 줄일때는 중괄호와 리턴 생략 `=`으로 대입
  - 기본매개변수 : 매개변수에 기본값 설정 가능, (Java의 오버로딩 효과)
  - 이름있는인자 : 호출할 때 인자에 파라미터 이름 지정 가능 (자유로운 순서)
  - 가변인자 : vararg 키워드로 같은 타입의 매개변수 입력 가능






