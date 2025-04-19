package com.example.calculator.v2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private int numA;
    private int numB;
    private char operator;
    private int result;

    //조건에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을
    //가진 메서드를 구현하라고 하셔서 queue를 활용.
    private Queue<Integer> queue = new LinkedList<>();
    private Queue<Integer> queueTemp = new LinkedList<>();


    public boolean valueCheck(int num){
        if (((num < 0) && (num<Integer.MAX_VALUE))) {
            System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
            System.out.println("next 입력하면 처음으로 돌아갑니다.");
            return false;
        }else{
            return true;
        }
    }

    //연산
    public boolean calculate(int numA, int numB, char operator) {
        switch (operator) {
            case '+' -> result = numA + numB;
            case '-' -> result = numA - numB;
            case '*' -> result = numA * numB;
            case '/' -> {
                try { //예외가 발생할 수 있는 부분.
                    result = numA / numB;
                } catch (ArithmeticException e) { //ArtimeticException 발생 시 아래 메세지 출력하고 처음부터 입력받음.
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return false;
                }
            }
        }
        queue.add(result);
        return true;
    }

    //가장 먼저 저장된 데이터 삭제하는 메서드
    public void removeResult() {
        queue.remove();
    }

    public Queue getQueue() {
        return queue;
    }


    public void setQueue(int idx,int num) {
        int oldidx=0;
        while((!queue.isEmpty())) { //queue가 비어있지 않고
            if (idx <= queue.size()) {//setter로 받은 idx값이  현재 queue 사이즈보다 작거나 같다면
                int value = queue.poll(); // 맨 처음 받은 값을 value에 저장
                if (oldidx == idx) { //바꿀 인덱스가 같으면
                    queueTemp.add(num); //값을 덮어씌운다.
                } else {
                    queueTemp.add(value); //만약 매개변수로 받은 바꿀 인덱스와 같지 않으면 덮어씌우지않는다.
                }
                oldidx++; //하나씩 증가하면서 인덱스를 증가.
            }else{ //인덱스 범위를 벗어난다면
                System.out.println("잘못된 인덱스입니다.");
                break;
            }
        }
        queue=queueTemp; //수정된 queueTemp를 queue에 저장.
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
            this.numA = numA;

    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
            this.numB = numB;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }
}