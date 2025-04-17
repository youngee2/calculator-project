package com.example.calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    int numA, numB;
    char operator;
    int result = 0;

    //조건에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을
    //가진 메서드를 구현하라고 하셔서 queue를 활용.
    Queue<Integer> queue = new LinkedList<>();




    //연산
    public int calculate(int numA, int numB, char operator) {
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
                }
                break;
        }
        queue.add(result);
        return result;
    }

    //가장 먼저 저장된 데이터 삭제하는 메서드
    public void removeResult() {
        queue.remove();
    }

    //사용자에게 입력받은 번호를 양의 정수인지 검사하는 메서드(양의 정수(0 포함))
    public boolean valueCheck(int num) {
        if (num < 0) {
            System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
            System.out.println("next 입력하면 처음으로 돌아갑니다.");
            return true;
        }
        return false;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }
}