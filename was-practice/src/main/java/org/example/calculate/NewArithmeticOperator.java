package org.example.calculate;

public interface NewArithmeticOperator {

    boolean supports(String opertor);
    int calculate(PositiveNumber operand1,PositiveNumber operand2);
}
