package com.example.calculator;


//기본적인 로직만 짜둔 상태
//유효성
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    //사용자에게 입력받은 번호를 양의 정수인지 검사하는 변수(양의 정수(0 포함))
    //static 메서드라서 뺄까 말까 고민중.. 작은 프로그램이라 상관 없을 것 같기도..
    static boolean valueCheck(int num){

        if (num < 0) {
            System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
            System.out.println("아무거나 입력하면 처음으로 돌아갑니다.");
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

        //do-while을 선택한 이유
        //한 번은 무조건 실행하기 때문에.
        do{
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

                System.out.print("사칙연산 기호를 입력하세요: ");
                //-1를 입력해도 -만 입력되기 때문에 넘어가는 현상 발생.
                operator = sc.next().charAt(0);
            }catch(InputMismatchException e){
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
                    }catch (ArithmeticException e){ //ArtimeticException 발생 시 아래 메세지 출력하고 처음부터 입력받음.
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    };
                    break;

                default: //사칙연산 기호가 아닐 경우 출력.
                    System.out.println("사칙연산 기호가 옳지 않습니다. +, -, *, / 중 하나로 입력해주세요. 처음부터 진행하시려면 next 입력");
                    continue;
            }

            //if문으로 연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력.
            // 나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.

            System.out.println("결과: " + result);
            //exit 값이 입력받으면 종료가 되나  계속 계산하려면 다른 값을 받아야 함.
            // 2시간동안 고민하다가  담임매니저님께 가서 여쭤봤는데
            // 요구사항에 exit 입력 시 종료, exit 아닐 시 반복되는게 튜터님이 원하는 요구사항 조건 충족하는 것 같다 그러셔서
            // 유효성 검사를 하기 위해 exit-종료/next-진행으로 일단 하기로 결정.
            // 예시에는 "더 계산하시겠습니까? (exit 입력 시 종료)라고 출력하라고 되어있는데, 사용자가 헷갈릴 것 같아서 계속 진행하려면 next 입력도 추가할 생각으로
            // println문도 조금 수정해도 되냐고 여쭤봤더니 가능하다고 하셨다.

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력)");
            //유효성 검사 할지는 좀 더 고민해보기.
            //일단 exit 입력 시 종료/아무거나 입력시 계산 계속 진행 구현 O
        }while(!sc.next().equals("exit"));
    }
}
