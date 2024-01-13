package org.example.password;

@FunctionalInterface
public interface PasswordGeneratePolicy {
    String generatePassword();
}
