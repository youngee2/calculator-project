package com.example.calculator.v2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        do {
            try {
                System.out.print("첫 번째 번호를 입력: ");
                int numA=sc.nextInt();
                if (calculator.valueCheck(numA)) {
                    calculator.setNumA(numA);
                }else{
                    continue;
                }

                System.out.print("두 번째 번호를 입력: ");
                int numB=sc.nextInt();
                if (calculator.valueCheck(numB)) {
                    calculator.setNumB(numB);
                }else{
                    continue;
                }

                System.out.print("사칙연산 기호를 입력하세요: ");
                String str = sc.next();

                //사칙연산 기호만 받을 수 있게 필터링.
                if (!str.matches("[\\+\\-\\*/]")) {
                    String temp = "사칙연산 기호만 작성해주세요. next 입력하면 처음으로 돌아갑니다.";
                    System.out.println(temp);
                    continue;
                } else {
                    calculator.setOperator(str.charAt(0));
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 제외한 값은 입력 불가. 처음으로 돌아갑니다.");
                continue;
            }

            //calculate 메서드 매개변수 입력 후 result 변수로 결과값 반환받음.
            int result = calculator.calculate(calculator.getNumA(), calculator.getNumB(), calculator.getOperator());

            System.out.println("계산 값: "+result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력");

            //만약 입력받은 게 exit인 경우 반복 종료.
        } while (!sc.next().equals("exit"));

    }
}