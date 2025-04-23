package com.example.calculator.v3;
//3-2 도전하다가 제네릭 응용이 안되어서 중단.


//extends로 Number를 상속받아서 T는 숫자타입만 가능하게 제한.
public class ValueType<T extends Number> {
    private T item;
    private Number num;
    //생성자
    //기능

    public T getItem() {
        return item;
    }

    //
    public void setItem(T item) {
        this.item = item;
    }

    public boolean valueCheck(String num) {
        int value = Integer.parseInt(num);
        if (value < 0 || num==null) {
            System.out.println("입력 가능한 값이 아닙니다. 양의 정수(0 포함) 입력해주세요.");
            System.out.println("next 입력하면 처음으로 돌아갑니다.");
            return false;
        }
        return true;
    }
}


