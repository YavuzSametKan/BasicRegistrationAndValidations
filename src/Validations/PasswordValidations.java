package Validations;

public class PasswordValidations {
    private final byte MIN_LENGTH = 8;
    private final byte MAX_LENGTH = 64;

    public ValidationResult isValid(String password) {
        if (!ValidationUtils.isValidLength(password, MIN_LENGTH, MAX_LENGTH)){
            return ValidationUtils.validationError(
                    "Password must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters."
            );
        } else if (!ValidationUtils.containsUpperCase(password)) {
            return ValidationUtils.validationError(
                    "Password must contain at least one uppercase letter."
            );
        } else if (!ValidationUtils.containsLowerCase(password)){
            return ValidationUtils.validationError(
                    "Password must contain at least one lowercase letter."
            );
        } else if (!ValidationUtils.containsDigit(password)) {
            return ValidationUtils.validationError(
                    "Password must contain at least one number."
            );
        } else if (!ValidationUtils.containsSpecialChar(password)) {
            return ValidationUtils.validationError(
                    "Password must contain at least one special character."
            );
        } else if (isCommonlyPassword(password)) {
            return ValidationUtils.validationError(
                    "This password is a common password."
            );
        }

        return new ValidationResult(true);
    }

    private boolean isCommonlyPassword(String password) {
        String[] commonlyPasswords = {
                "123456",
                "123456789",
                "12345",
                "12345678",
                "1234567890",
                "111111",
                "admin",
                "Qwerty",
                "welcome",
                "Password",
                "Password1",
                "p@ssw0rd",
                "Qwerty123",
                "1q2w3e",
                "Q2w3e4r5t"
        };

        for(String commonlyPassword : commonlyPasswords) {
            if(password.equals(commonlyPassword)){
                return true;
            }
        }

        return false;
    }
}
