package com.example.calculator.v3;

import java.util.InputMismatchException;
import java.util.LinkedList;

public class ArithmeticCalculator {

    //양의 정수만 아닌 피연산자를 여러타입으로 받을 수 있도록 확장 (calculate 메서드로 작성)
    //
    private int numA;
    private int numB;
    private char operator;
    private int result;
    private OperatorType operatorType;

    //조건에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을
    //가진 메서드를 구현하라고 하셔서 LinkedList를 활용.
    private LinkedList<Integer> list = new LinkedList<>();


    //연산 int 반환
    public int calculate(int numA, int numB, OperatorType operator) {
        switch (operator) {
            case PLUS -> result = numA + numB;
            case MINUS -> result = numA - numB;
            case MULTIPLY -> result = numA * numB;
            case DIVIDE -> { if(numB==0) throw new ArithmeticException();
                //만약 2번째 번호가 0이면 예외 메인으로 던짐. continue 처리 할 수 있게.
            }
        }
            list.add(result);
            return result;
    }

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
    //수정하려는 인덱스보다 저장된 값의 수가 적으면 인덱스 수정X
    //만약 수정하려는 인덱스보다 저장된 값의 수가 크면 기존 인덱스 값 삭제하고 가져온 인덱스에 수정할 값으로 추가.
    public void setList(int index, int num) {
        if(list.size()-1<index){
            System.out.println("해당 인덱스는 값이 비어 있어서 수정하실 수 없습니다.");
        }else{
            list.remove(index);
            list.add(index, num);
            System.out.println(index+"번째 인덱스 값이 "+num+"으로 수정되었습니다.");
        }
    }
    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}