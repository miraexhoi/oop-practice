package org.example;

public class CorrectPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
