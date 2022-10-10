package org.example.calculate;

public interface NewArithmeticOperator {

    boolean supports(String opertor);
    int calculate(int operand1,int operand2);
}
