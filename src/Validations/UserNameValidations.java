package Validations;

public class UserNameValidations {
    private final byte MIN_LENGTH = 3;
    private final byte MAX_LENGTH = 24;
    private final String[] BANNED_KEYWORDS = {
            "admin",
            "root",
            "swear"
    };

    public ValidationResult isValid(String userName) {
        userName = userName.trim();

        if (!ValidationUtils.isValidLength(userName, MIN_LENGTH, MAX_LENGTH)){
            return ValidationUtils.validationError(
                    "Username must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters."
            );
        } else if (ValidationUtils.hasSpaces(userName)){
            return ValidationUtils.validationError(
                    "Username cannot contains spaces."
            );
        } else if (!ValidationUtils.isValidCharacters(userName)){
            return ValidationUtils.validationError(
                    "The username can only contain letters, numbers, and characters such as underscore (_)."
            );
        } else if (!ValidationUtils.startsWithAlphabet(userName)){
            return ValidationUtils.validationError(
                    "The username must start with a letter."
            );
        } else if (ValidationUtils.containsBannedKeyword(userName, BANNED_KEYWORDS)){
            return ValidationUtils.validationError(
                    "Username must not contains banned keywords"
            );
        }

        return new ValidationResult(true);
    }
}
