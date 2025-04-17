package com.example.calculator.v1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    //사용자에게 입력받은 번호를 양의 정수인지 검사하는 메서드(양의 정수(0 포함))
    static boolean valueCheck(int num) {
        if (num < 0) {
            System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
            System.out.println("next 입력하면 처음으로 돌아갑니다.");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //첫 번째 번호를 저장할 int형 numA 변수 선언
        //두 번째 번호를 저장할 int형 numB 변수 선언
        int numA, numB;
        //사칙연산 기호를 저장할 char형 operator 변수 선언
        char operator;
        //연산한 결과를 저장할 int형 result 변수 선언
        int result = 0;

        //한 번은 무조건 실행하기 때문에 do-while문 선택
        //번호를 입력받은 후 valueCheck메서드로 범위에 해당하는 값인지 체크. 범위 포함 안되는 경우 continue로 프로그램 처음부터 실행.
        //첫 번째 번호와 두번째 번호 같은 로직으로 진행.
        do {
            try {
                System.out.print("첫 번째 번호를 입력: ");
                numA = sc.nextInt();
                if (valueCheck(numA)) {
                    continue;
                }

                System.out.print("두 번째 번호를 입력: ");
                numB = sc.nextInt();
                if (valueCheck(numB)) {
                    continue;
                }

                //사칙연산 기호를 입력받는 로직
                //chatAt(0)으로 기호만 꺼내면 -1를 입력해도 -만 입력되기 때문에 그냥 넘어가는 현상 발생이 발생했기 때문에
                //정규표현식으로 필터링. 만약 사칙연산 기호가 아닌 경우 프로그램 처음부터 실행.
                System.out.print("사칙연산 기호를 입력하세요: ");
                String str = sc.next();

                //정규표현식으로 필터링 가능
                // 사칙연산 기호를 받은 str 변수가 +,-,*,/가 아닌 경우 처음 로직으로 돌아감.
                // 만약 올바른 사칙연산 기호를 입력받았다면 operation 변수에 저장.
                if (!str.matches("[\\+\\-\\*/]")) {
                    System.out.println("사칙연산 기호만 작성해주세요.");
                    System.out.println("next 입력하면 처음으로 돌아갑니다.");
                    continue;
                } else {
                    operator = str.charAt(0);
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 제외한 값은 입력 불가. 처음으로 돌아갑니다.");
                continue;
            }

            //switch문으로 해당 사칙연산 기호에 맞는 계산을 한 후, result변수에 저장하고 switch문을 빠져나감.
            switch (operator) {
                case '+':
                    result = numA + numB;
                    break;
                case '-':
                    result = numA - numB;
                    break;
                case '*':
                    result = numA * numB;
                    break;
                case '/':
                    try { //예외가 발생할 수 있는 부분.
                        result = numA / numB;
                    } catch (ArithmeticException e) { //ArtimeticException 발생 시 아래 메세지 출력하고 처음부터 입력받음.
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    ;
                    break;
            }

            //계산된 값을 출력.
            System.out.println("결과: " + result);

            //exit 입력 시 종료하는 요구사항은 구현했지만 계속 진행하려면 next를 입력하라는 요구사항이 없었다.
            //아무 값이나 입력하면 로직대로 진행되지만 사용자가 무엇을 입력해야 할 지 모를수도 있기 때문에 next를 입력하면 넘어간다고 표시했다.
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력)");

            //만약 입력받은 게 exit인 경우 반복 종료.
        } while (!sc.next().equals("exit"));
    }
}