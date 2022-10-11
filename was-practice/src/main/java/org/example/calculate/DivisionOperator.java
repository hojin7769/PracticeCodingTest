package org.example.calculate;

public class DivisionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String opertor) {
        return "/".equals(opertor);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {

        if(operand2.toInt() == 0){
            throw new IllegalArgumentException("나눌수 없다");
        }
        return operand1.toInt() / operand2.toInt();
    }
}
