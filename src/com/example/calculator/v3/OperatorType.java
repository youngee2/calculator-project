package com.example.calculator.v3;

//사칙연산 타입 관리
public enum OperatorType {

    PLUS('+') ,
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char operatorType;

     OperatorType (char operatorType){
        this.operatorType=operatorType;
    }
    //getter
    public char getOperatorType() {
        return operatorType;
    }
}
