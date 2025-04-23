package com.example.calculator.v3;
import java.util.Scanner;


public class Main {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculator 인스턴스 생성
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        //Enum
        OperatorType operatorType;
        int result = 0;
        do {
            System.out.print("첫 번째 번호를 입력: ");
            String numA = sc.next();

            //check()메서드를 사용해서 numA가 조건에 맞는 숫자라면 setter로 접근
            //만약 조건이 맞지 않는다면 continue로 첫번째 값부터 입력받음.
            if (calculator.check(numA)) {
                calculator.setNumA(Integer.parseInt(numA));
            } else {
                continue;
            }

            //numA랑 같은 로직
            //check()메서드를 사용해서 numB가 조건에 맞는 숫자라면 setter로 접근
            //만약 조건이 맞지 않는다면 continue로 첫번째 값부터 입력받음.
            System.out.print("두 번째 번호를 입력: ");
            String numB = sc.next();
            if (calculator.check(numB)) {
                calculator.setNumB(Integer.parseInt(numB));
            } else {
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");

            //사칙연산 기호를 입력받고 character 자료형인 op에 저장
            //setter로 접근
            String str = sc.next();
            char op=str.charAt(0);
            calculator.setOperator(op);


            //Enum 값인 연산 기호를 하나씩 반복하는데
            // 만약 받은 입력 기호와 동일한 값을 가진 enum이 있다면 계산 메서드인 calculate()로 넘김.
            //여기서 b가 0일 때 나누면 예외가 발생하게 했으니까 예외처리를 해줌.
            //만약 계산이 완료되었다면 계산값 출력하고
            //더 계산할건지 물어봄. exit 입력 시 종료.
            for(OperatorType type:OperatorType.values()){
                if(type.getOperatorType()==op){
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