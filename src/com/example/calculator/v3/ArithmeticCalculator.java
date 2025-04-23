package com.example.calculator.v3;

import java.util.InputMismatchException;
import java.util.LinkedList;

public class ArithmeticCalculator {

    // 속성
    private int numA;
    private int numB;
    private char operator;
    private int result;
    private OperatorType operatorType;

    //조건에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을
    //가진 메서드를 구현하라고 하셔서 LinkedList를 활용.
    private LinkedList<Integer> list = new LinkedList<>();


    //연산하는 메서드.
    //ENUM에 해당하는 메서드이면 해당하는 계산식 실행.
    //만약 나눌 때 2번째 번호가 0이면 continue 처리 할 수 있게 예외를 메인메서드로 던짐.
    public int calculate(int numA, int numB, OperatorType operator) {
        switch (operator) {
            case PLUS -> result = numA + numB;
            case MINUS -> result = numA - numB;
            case MULTIPLY -> result = numA * numB;
            case DIVIDE -> { if(numB==0) throw new ArithmeticException();
            }
        }
        list.add(result); //결과값 저장
        return result; //결과값 main()로 반환
    }

    //입력값 체크. 만약 0보다 작은 수이면 입력가능한 값이 아니다.
    //만약 숫자가 아닌 값이 들어온다면 예외처리(숫자를 제외한 값은 입력 불가)
    public boolean check(String val) {
        try {
            int num = Integer.parseInt(val);
            if (num < 0) {
                System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
                return false;
            } else {
                return true;
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자를 제외한 값은 입력 불가. 처음으로 돌아갑니다.");
            return false;
        }
    }

    //가장 먼저 저장된 데이터 삭제하는 메서드
    public void removeResult() {
        list.removeFirst();
    }

    //getter
    public LinkedList<Integer> getList() {
        return list;
    }

    //setter
    //결과를 저장하는 컬렉션에서 값을 수정하는 메서드.
    //수정하려는 인덱스보다 저장된 값의 수가 적으면 인덱스 수정X
    //만약 수정하려는 인덱스보다 저장된 값의 수가 크면 수정 가능.
    public void setList(int index, int num) {
        if(list.size()-1<index){
            System.out.println("해당 인덱스는 값이 비어 있어서 수정하실 수 없습니다.");
        }else{
            list.set(index,num);
            System.out.println(index+"번째 인덱스 값이 "+num+"으로 수정되었습니다.");
        }
    }

    //numA setter
    public void setNumA(int numA) {
        this.numA = numA;
    }

    //numB setter
    public void setNumB(int numB) {
        this.numB = numB;
    }

    //Operator setter
    public void setOperator(char operator) {
        this.operator = operator;
    }
}