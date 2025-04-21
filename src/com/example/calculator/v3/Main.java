package com.example.calculator.v3;
import java.util.Scanner;


public class Main {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculator 인스턴스 생성
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        OperatorType operatorType;
        int result = 0;
        do {
            System.out.print("첫 번째 번호를 입력: ");
            String numA = sc.next();
            if (calculator.check(numA)) {
                calculator.setNumA(Integer.parseInt(numA));
            } else {
                continue;
            }

            System.out.print("두 번째 번호를 입력: ");
            String numB = sc.next();
            if (calculator.check(numB)) {
                calculator.setNumB(Integer.parseInt(numB));
            } else {
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");

            //char ch 적당한 변수명 고민하기..
            String str = sc.next();
            char ch=str.charAt(0);
            calculator.setOperator(ch);


            for(OperatorType type:OperatorType.values()){
                if(type.getOperatorType()==ch){
                    try {
                        result = calculator.calculate(Integer.parseInt(numA), Integer.parseInt(numB), type);
                    }catch(ArithmeticException e){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }
                System.out.println("계산 값: "+result);
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료 / 계속 진행하시려면 next 입력)");
                break;
                }
            }
            //만약 입력받은 게 exit인 경우 반복 종료.
        } while (!sc.next().equals("exit"));
    }
}