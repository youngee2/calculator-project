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

                if (!str.matches("[\\+\\-\\*/]")) {
                    System.out.println("사칙연산 기호만 작성해주세요.");
                    System.out.println("next 입력하면 처음으로 돌아갑니다.");
                    continue;
                } else {
                    calculator.setOperator(str.charAt(0));
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 제외한 값은 입력 불가. 처음으로 돌아갑니다.");
                continue;
            }

            boolean resultCheck=calculator.calculate(calculator.getNumA(), calculator.getNumB(), calculator.getOperator());

            if(resultCheck) {
                System.out.println("결과: " + calculator.getResult());
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력)");
            }

            //만약 입력받은 게 exit인 경우 반복 종료.
        } while (!sc.next().equals("exit"));
    }
}