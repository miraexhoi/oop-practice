package org.example;

@FunctionalInterface
public interface PasswordGeneratePolicy {
    String generatePassword();
}
