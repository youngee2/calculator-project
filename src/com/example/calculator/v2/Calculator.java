package com.example.calculator.v2;

import java.util.LinkedList;

public class Calculator {

    private int numA;
    private int numB;
    private char operator;
    private int result;

    //조건에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을
    //가진 메서드를 구현하라고 하셔서 LinkedList를 활용.
    private LinkedList<Integer> list = new LinkedList<>();

    public boolean valueCheck(int num) {
        if (num < 0) {
            System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
            System.out.println("next 입력하면 처음으로 돌아갑니다.");
            return false;
        } else {
            return true;
        }
    }

    //연산 int 반환
    public int calculate(int numA, int numB, char operator) {
        switch (operator) {
            case '+' -> result = numA + numB;
            case '-' -> result = numA - numB;
            case '*' -> result = numA * numB;
            case '/' -> {
                try { //예외가 발생할 수 있는 부분.
                    result = numA / numB;
                } catch (ArithmeticException e) { //ArtimeticException 발생 시 아래 메세지 출력하고 처음부터 입력받음.
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }
        }
        list.add(result);
        return result;
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
    //만약 수정하려는 인덱스보다 저장된 값의 수가 크면 가져온 인덱스에 수정할 값으로 추가.
    public void setList(int index, int num) {
        if(list.size()-1<index){
            System.out.println("해당 인덱스는 값이 비어 있어서 수정하실 수 없습니다.");
        }else{
            list.set(index,num);
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

    public int getNumA() {
        return numA;
    }

    public int getNumB() {
        return numB;
    }

    public char getOperator() {
        return operator;
    }
}