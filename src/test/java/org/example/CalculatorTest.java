package org.example;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @DisplayName("덧셈 연산을 수행한다.")
    @Test
    void additionTest() {
        Calculator.calculate();
    }
}
