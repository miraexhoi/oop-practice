package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {
    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1, String operator, int operand2, int result) {
        int calculateresult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        assertThat(calculateresult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
                arguments(1,"+",2,3),
                arguments(1,"-",2,-1),
                arguments(4,"*",2,8),
                arguments(4,"/",2,2)
        );
    }

//    // refactoring 과정에서 해당 코드는 의미가 없어짐
//    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.")
//    @Test
//    void calculateExceptionTest() {
//        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10),"/",new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("0으로 나눌 수 없습니다.");
//    }
}
