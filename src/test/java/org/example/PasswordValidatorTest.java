package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외 발생 x")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();

    }

    @DisplayName("비밀번호가 최소 8자 이하거나, 12자 이상일 경우 IllegalArgumentException 예외 발생")
    @Test
    void validatePasswordTest2() {
        assertThatCode(() -> PasswordValidator.validate("aadd"))
                .isInstanceOf(IllegalAccessError.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
