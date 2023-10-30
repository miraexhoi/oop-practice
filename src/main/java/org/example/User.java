package org.example;

public class User {
    private String password;
    public void initPassword() {
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPassword = randomPasswordGenerator.generatePassword();

        // 비밀번호가 최소 8자 이상, 12자 이하여야 한다.
        if (randomPassword.length() >= 8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }
    }
}
