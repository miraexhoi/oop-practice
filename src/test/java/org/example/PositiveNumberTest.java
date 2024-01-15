package org.example;

import org.example.calculator.PositiveNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveNumberTest {
    @Test
    void createTest() {
        assertThatCode(() -> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0또는 음수를 전달할 수 없습니다.");
    }
}
