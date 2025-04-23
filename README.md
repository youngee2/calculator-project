<h1>📌계산기 프로젝트</h1>

 <p>총 1, 2, 3단계로 나뉘어 구현합니다.</p>
 <br>
<br>
 <p><b>[1단계]:</b> 클래스 없이 자바의 기본 문법만을 사용하여 구현한 계산기</p>
 <p><b>[2단계]:</b> 객체지향 개념을 적용하여 클래스 정의, 연산을 수행하는 메소드 작성한 계산기</p>
 <p><b>[3단계]:</b> 자바의 Enum, 제네릭, 람다 & 스트림을 적용한 계산기</p>
<br>

<br>
<hr>
<h2>✔️프로젝트 목표</h2>
<p>자바 문법의 실습 및 객체지향 개념의 적용</p>
 <br>
<hr>
<h2>✔️개발환경</h2>
<p>JDK: 17</p>
<br>
<h2>✔️요구사항 정의</h2>
<details>
<summary>1단계</summary>
 <p><b>1. 양의 정수(0 포함) 입력받기</b></p>
 <p> - Scanner를 사용하여 양의 정수 2개(0포함)를 전달 받을 수 있습니다.</p>
 <p> - 양의 정수는 각각 하나씩 전달 받습니다.</p>
 <p> - 양의 정수는 적당한 타입으로 선언한 변수에 저장합니다.</p>
<br>
 <p><b>2. 사칙연산 기호(+, -, *, /)를 입력받기</b></p>
 <p> - Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.</p>
 <p> - 사칙연산 기호를 적당한 타입으로 선언한 변수에 저장합니다.(chatAt(0))</p>
 <br>
  <p><b>3. 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기</b></p>
 <p>키워드: if, switch</p>
 <p> - 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.</p>
 <p> - 입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다.</p>
 <p> - 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.</p>
 <p>ex)  "나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.</p>
 <br>
  <br>
  <p><b>4. 반복문을 사용하되, 반복의 종료를 알려주는 "exit"문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스코드 수정하기</b></p>
 <p>키워드: 무한으로 반복, 수정하기(처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)</p>
 <p>반복문을 사용합니다.(예를 들어, for,while...)</p>
 <br>

 </details>

 
 <details>
<summary>2단계</summary>
 <p><b>1. 사칙연산을 수행 후, 결과값 반환 메서드 구현&연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator클래스 생성</b></p>
 <p>  - 사칙연산 수행한 후, 결과값을 반환하는 메서드 구현</p>
 <p>  - 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성</p>
 <p>  - 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산 기능을 수행한 후 결과값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성합니다.</p>
<br>
 <p><b>2. 1단계에서 구현한 App클래스의 main메서드에 Calculator 클래스가 활용될 수 있도록 수정</b></p>
 <p>  - 연산 수행 역할은 Calculator가 담당</p>
 <p>  - 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장</p>
 <p>  - 소스코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.</p>
 <br>
  <p><b>3. App클래스의 main메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정(캡슐화)</b></p>
 <p>  - 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter메서드)</p>
 <p>  - 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)</p>
 <p>  - 위 요구사항을 모두 구현 했다면 App클래스의 main메서드에서 위에서 구현한 메서드를 활용</p>
 <br>
  <p><b>4. Calculrator 클래스에 저장된 연산결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정</b></p>
 <p>키워드: 컬렉션</p>
 <p>  - 컬렉션에서 값을 넣고 제거하는 방법을 이해한다.</p>
 <br>
 </details>


 <details>
<summary>3단계</summary>
 <p><b>1. 현재 사칙연산 계산기는 총 4가지 연산 타입으로 구성되어 있습니다.</b></p>
 <p>  - Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용 해봅니다.</p>
<br>
 <p><b>2. 실수, 즉 double타입의 값을 전달 받아도 연산이 수행하도록 만들기</b></p>
 <p>키워드: 제네릭</p>
 <p>  - 단순히, 기존의 int타입을 double로 바꾸는 게 아닌 점에 주의하세요.</p>
 <p>  - 지금까지는 ArithmeticCalculator, 즉 사칙연산 계산기는 양의 정수(0 포함)를 매개변수로 전달받아 연산을 수행</p>
 <p>  - 피연산자를 여러 타입으로 받을 수 있도록 기능을 확장</p>
  <br>
  <p><b>3. 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력</b></p>
 <p>  - ArithmeticCalculator 클래스에 위 요구사항을 만족하는 조회 메서드를 구현합니다. </p>
 <p>  - 단, 해당 메서드를 구현할 때 lambda, Stream을 활용하여 구현합니다.</p>
 <br>
 <br>
 </details>


<br>
<br>
<hr>
<h3>✔️클래스 다이어그램 및 테스트 케이스</h3>
 <details>
  <summary>level 1 클래스 다이어그램</summary>
<img src="https://github.com/user-attachments/assets/28a20a70-7681-4832-85c4-a1bd1c571ddb" width="200" height="200">
</details>
<details>
<summary>Level 1 테스트케이스</summary>
<table class="tg"><thead>
  <tr>
    <th class="tg-wa1i">기능</th>
    <th class="tg-wa1i">테스트 시나리오</th>
    <th class="tg-wa1i">검증내용</th>
    <th class="tg-wa1i">입력 값</th>
    <th class="tg-wa1i">기대하는 결과</th>
    <th class="tg-wa1i">수행결과</th>
    <th class="tg-wa1i">비고</th>
  </tr></thead>
<tbody>
  <tr>
    <td class="tg-nrix" rowspan="30">계산기</td>
    <td class="tg-nrix" rowspan="8">값 입력받기</td>
    <td class="tg-nrix" rowspan="2">사용자가 첫번째 값을 입력 시 정상적으로 값을 입력받는가</td>
    <td class="tg-nrix" rowspan="2">0</td>
    <td class="tg-nrix" rowspan="2">첫번째 값 저장 후, 두번째 값 입력받음</td>
    <td class="tg-nrix" rowspan="2">P</td>
    <td class="tg-nrix" rowspan="8">양의 정수(0포함)만<br>입력가능</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">사용자가 두번째 값을 입력 시 정상적으로 값을 입력받는가</td>
    <td class="tg-nrix" rowspan="2">0</td>
    <td class="tg-nrix" rowspan="2">두번째 값 저장 후, 사칙연산자 입력받음</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="4">사용자가 양의 정수<br>(0 포함)를 제외한 값을<br> 입력 시 처음 로직으로 돌아가는가</td>
    <td class="tg-nrix" rowspan="2">"test"</td>
    <td class="tg-nrix" rowspan="2">"숫자를 제외한 값은 입력 불가. 처음으로 돌아갑니다."<br>출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">-1</td>
    <td class="tg-nrix" rowspan="2">"입력 가능한 값이 아닙니다.<br> 양의 정수(0 포함) 입력해주세요.<br> next 입력하면 처음으로 돌아갑니다. "<br> 출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="4">사칙연산자 입력받기</td>
    <td class="tg-nrix">사용자가 사칙연산 기호를 입력할 경우 정상적으로 값을 입력받는가</td>
    <td class="tg-nrix">*</td>
    <td class="tg-nrix">입력받은 사칙연산 기호 * 저장<br></td>
    <td class="tg-nrix">P</td>
    <td class="tg-nrix" rowspan="4">사칙연산자만 <br>입력가능</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="3">사용자가 사칙연산 기호가 아닌 잘못된 값을 입력 시 처음 로직으로 돌아가는가</td>
    <td class="tg-nrix">1</td>
    <td class="tg-nrix" rowspan="2">"사칙연산 기호가 옳지 않습니다. +, -, *, / 중 하나로 입력해주세요. 처음부터 진행하시려면 next 입력" 출력  후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
    <td class="tg-nrix">"test"</td>
  </tr>
  <tr>
    <td class="tg-nrix">-123</td>
    <td class="tg-cly1">"사칙연산 기호만 작성해주세요.<br> next 입력하면 처음으로 돌아갑니다." 출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix">P</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="3">연산 수행</td>
    <td class="tg-nrix" rowspan="2">입력받은 사칙연산 기호에 맞는 연산을 진행하는가</td>
    <td class="tg-nrix" rowspan="2">첫번째 값: 6<br>두번째 값: 2<br>사칙연산 기호: /</td>
    <td class="tg-nrix" rowspan="2">"결과: 3<br>더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력)"<br>출력.</td>
    <td class="tg-nrix" rowspan="2">P</td>
    <td class="tg-nrix" rowspan="3"></td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix">연산 오류가 발생할 경우 해당 오류 내용을 정제해서 출력하는가</td>
    <td class="tg-nrix">첫번째 값: 3<br> 두번째 값: 0<br> 사칙연산 기호: /</td>
    <td class="tg-cly1">"나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다." 출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix">P</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">반복</td>
    <td class="tg-cly1">"더 계산하시겠습니까?" 질문이 출력되었을 때, "exit" 문자열을 입력하기 전까지 무한으로 계산이 진행되는가</td>
    <td class="tg-nrix">"next"</td>
    <td class="tg-cly1">"exit"문자열 입력하기 전까지 아무 문자열이나 숫자를 넣으면<br> 무한으로 계산 진행</td>
    <td class="tg-nrix">P</td>
    <td class="tg-nrix" rowspan="2"></td>
  </tr>
  <tr>
    <td class="tg-cly1">"더 계산하시겠습니까?" 질문이 출력되었을 때, "exit" 문자열을 입력하면 계산 반복이 종료되는가</td>
    <td class="tg-nrix">"exit"</td>
    <td class="tg-cly1">반복 및 프로그램 종료</td>
    <td class="tg-nrix">P</td>
  </tr>
</tbody></table>

</details>

<details>
  <summary>level 2 클래스 다이어그램</summary>
 <img src="https://github.com/user-attachments/assets/ce1ada78-46f5-4838-ae45-322949ebd1f0">

</details>

<details>
<summary>Level 2 테스트케이스</summary>
<table class="tg"><thead>
  <tr>
    <th class="tg-wa1i">기능</th>
    <th class="tg-wa1i">테스트 시나리오</th>
    <th class="tg-wa1i">검증내용</th>
    <th class="tg-wa1i">입력 값</th>
    <th class="tg-wa1i">기대하는 결과</th>
    <th class="tg-wa1i">수행결과(P/F)</th>
    <th class="tg-wa1i">비고</th>
  </tr></thead>
<tbody>
  <tr>
    <td class="tg-nrix" rowspan="30">계산기</td>
    <td class="tg-nrix" rowspan="8">값 입력받기</td>
    <td class="tg-nrix" rowspan="2">사용자가 첫번째 값을 입력 시 정상적으로 값을 입력받는가</td>
    <td class="tg-nrix" rowspan="2">0</td>
    <td class="tg-nrix" rowspan="2">첫번째 값 저장 후, 두번째 값 입력받음</td>
    <td class="tg-nrix" rowspan="2">P</td>
    <td class="tg-nrix" rowspan="8">양의 정수(0포함)만<br>입력가능</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">사용자가 두번째 값을 입력 시 정상적으로 값을 입력받는가</td>
    <td class="tg-nrix" rowspan="2">0</td>
    <td class="tg-nrix" rowspan="2">두번째 값 저장 후, 사칙연산자 입력받음</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="4">사용자가 양의 정수<br>(0 포함)를 제외한 값을<br> 입력 시 처음 로직으로 돌아가는가</td>
    <td class="tg-nrix" rowspan="2">"test"</td>
    <td class="tg-nrix" rowspan="2">"숫자를 제외한 값은 입력 불가. 처음으로 돌아갑니다."<br>출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">-1</td>
    <td class="tg-nrix" rowspan="2">"입력 가능한 값이 아닙니다.<br> 양의 정수(0 포함) 입력해주세요.<br> next 입력하면 처음으로 돌아갑니다. "<br> 출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="4">사칙연산자 입력받기</td>
    <td class="tg-nrix">사용자가 사칙연산 기호를 입력할 경우 정상적으로 값을 입력받는가</td>
    <td class="tg-nrix">*</td>
    <td class="tg-nrix">입력받은 사칙연산 기호 * 저장<br></td>
    <td class="tg-nrix">P</td>
    <td class="tg-nrix" rowspan="4">사칙연산자만 <br>입력가능</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="3">사용자가 사칙연산 기호가 아닌 잘못된 값을 입력 시 처음 로직으로 돌아가는가</td>
    <td class="tg-nrix">1</td>
    <td class="tg-nrix" rowspan="2">"사칙연산 기호가 옳지 않습니다. +, -, *, / 중 하나로 입력해주세요. 처음부터 진행하시려면 next 입력" 출력  후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix" rowspan="2">P</td>
  </tr>
  <tr>
    <td class="tg-nrix">"test"</td>
  </tr>
  <tr>
    <td class="tg-nrix">-123</td>
    <td class="tg-cly1">"사칙연산 기호만 작성해주세요.<br> next 입력하면 처음으로 돌아갑니다." 출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix">P</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="3">연산 수행</td>
    <td class="tg-nrix" rowspan="2">입력받은 사칙연산 기호에 맞는 연산을 진행하는가</td>
    <td class="tg-nrix" rowspan="2">첫번째 값: 6<br>두번째 값: 2<br>사칙연산 기호: /</td>
    <td class="tg-nrix" rowspan="2">"결과: 3<br>더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력)"<br>출력.</td>
    <td class="tg-nrix" rowspan="2">P</td>
    <td class="tg-nrix" rowspan="3"></td>
  </tr>
  <tr>
  </tr>
  <tr>
    <td class="tg-nrix">연산 오류가 발생할 경우 해당 오류 내용을 정제해서 출력하는가</td>
    <td class="tg-nrix">첫번째 값: 3<br> 두번째 값: 0<br> 사칙연산 기호: /</td>
    <td class="tg-cly1">"나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다." 출력 후 프로그램 처음 로직으로 돌아감</td>
    <td class="tg-nrix">P</td>
  </tr>
  <tr>
    <td class="tg-nrix" rowspan="2">반복</td>
    <td class="tg-cly1">"더 계산하시겠습니까?" 질문이 출력되었을 때, "exit" 문자열을 입력하기 전까지 무한으로 계산이 진행되는가</td>
    <td class="tg-nrix">"next"</td>
    <td class="tg-cly1">"exit"문자열 입력하기 전까지 아무 문자열이나 숫자를 넣으면<br> 무한으로 계산 진행</td>
    <td class="tg-nrix">P</td>
    <td class="tg-nrix" rowspan="2"></td>
  </tr>
  <tr>
    <td class="tg-cly1">"더 계산하시겠습니까?" 질문이 출력되었을 때, "exit" 문자열을 입력하면 계산 반복이 종료되는가</td>
    <td class="tg-nrix">"exit"</td>
    <td class="tg-cly1">반복 및 프로그램 종료</td>
    <td class="tg-nrix">P</td>
  </tr>
   <tr>
    <td class="tg-nrix">캡슐화</td> <!-- 기능 -->
    <td class="tg-nrix">App클래스의 main메서드에서 Calculator클래스의 연산 결과를 저장하고 있는 컬렉션타입 필드에 직접 접근하지 못하는가</td> <!-- 테스트 시나리오 -->
        <td class="tg-nrix">calculator.list.get(0);</td> <!-- 입력 값 -->
        <td class="tg-nrix">private 접근 제어자로 인해 컴파일 오류 발생</td> <!-- 기대하는 결과 -->
    <td class="tg-nrix">P</td> <!-- 수행결과 (P/F) -->
  </tr>
<tr>
  <td class="tg-nrix">조회</td> <!-- 기능: 계산기 -->
  <td class="tg-nrix">간접 접근을 통해 Calculator 클래스의 컬렉션타입 필드에 접근하여 값을 가져올 수 있는가</td>
  <td class="tg-nrix">calculator.getList();</td>
  <td class="tg-nrix">컬렉션 간접 접근 성공 및 저장된 결과값 정상 출력</td>
  <td class="tg-nrix">P</td>
</tr>
<tr>
  <td class="tg-nrix">수정</td> <!-- 기능: 계산기 -->
  <td class="tg-nrix">간접 접근을 통해 Calculator 클래스의 컬렉션타입 필드에 접근하여 값을 수정할 수 있는가</td>
  <td class="tg-nrix">calculator.setList(1,4);</td>
  <td class="tg-nrix">컬렉션 간접 접근 성공 및 저장된 결과값 정상 수정</td>
  <td class="tg-nrix">P</td>
</tr>
<tr>
  <td class="tg-nrix">삭제</td> <!-- 기능: 계산기 -->
  <td class="tg-nrix">컬렉션에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드가 동작하는가 </td>
  <td class="tg-nrix">calculator.removeResult();</td>
  <td class="tg-nrix">컬렉션 접근 성공 및 가장 앞에 저장된 결과값 정상 삭제</td>
  <td class="tg-nrix">P</td>
</tr>
</tbody></table>
</details>
<br>
<br>
<hr>
<h3>✔️회고</h3>
<p>티스토리에 회고 작성했습니다.</p>
<p> 계산기(티스토리)<a src="https://young2develop.tistory.com/56"></p>
