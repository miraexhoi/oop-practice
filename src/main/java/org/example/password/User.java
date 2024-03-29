package org.example.password;

import org.example.password.PasswordGeneratePolicy;
import org.example.password.RandomPasswordGenerator;

public class User {
    private String password;

    public void initPassword(PasswordGeneratePolicy passwordGenerator) {
        // as - is 방식
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();
        // 비밀번호가 최소 8자 이상, 12자 이하여야 한다.
        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
