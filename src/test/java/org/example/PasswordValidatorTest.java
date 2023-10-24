package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외 발생 x")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();

    }

    @DisplayName("비밀번호가 최소 8자 이하거나, 12자 이상일 경우 IllegalArgumentException 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"aabb","aabbccddeeffgg"})
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalAccessError.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
