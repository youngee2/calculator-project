<details>
  <summary>level 1 클래스 다이어그램</summary>
<img src="https://github.com/user-attachments/assets/28a20a70-7681-4832-85c4-a1bd1c571ddb" width="200" height="200">

</details>

<details>
<summary>Level 1 계산기 테스트케이스</summary>
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
    <td class="tg-nrix" rowspan="17">계산기</td>
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
