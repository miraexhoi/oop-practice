package org.example.password;

import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class RandomPasswordGenerator implements org.example.PasswordGenerator {
    public static final String ALLOWED_SPL_CHARACTERS = "!@#$%^&*()_+";

    public static final String ERROR_CODE = "ERRONEOUS_SPECIAL_CHARS";

    public String generatePassword() {
        PasswordGenerator gen = new PasswordGenerator();

        CharacterData lowerCaseChars = EnglishCharacterData.LowerCase;
        CharacterRule characterRule = new CharacterRule(lowerCaseChars);
        lowerCaseChars.setNumberOfCharacters(2);

        CharacterData upperCaseChars = EnglishCharacterData.UpperCase;
        CharacterRule upperCaseRules = new CharacterRule(upperCaseChars);
        lowerCaseChars.setNumberOfCharacters(2);

        CharacterData specialChars = new CharacterData() {
            @Override
            public String getErrorCode() {
                return ERROR_CODE;
            }

            @Override
            public String getCharacters() {
                return ALLOWED_SPL_CHARACTERS;
            }
            CharacterRule splCharRule = new CharacterRule(specialChars);
            CharacterRule.setNumberOfCharacters(2);

            return gen.generatePassword((int)(Math.random() * 13), splCharRule, lowerCaseRule, upperCaseRule, digitRule);
        }
    }
}
