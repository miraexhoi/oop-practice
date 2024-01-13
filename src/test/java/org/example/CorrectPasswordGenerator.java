package org.example;

import org.example.password.PasswordGeneratePolicy;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
