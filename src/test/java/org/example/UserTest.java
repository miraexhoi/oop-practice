package org.example;

import org.example.password.RandomPasswordGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("패스워드가 초기화된다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        user.initPassword(new RandomPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화되지 않는다.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(new WrongFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNull();
    }
}