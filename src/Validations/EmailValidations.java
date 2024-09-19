package Validations;

public class EmailValidations {
    private final byte MIN_LENGTH = 5;
    private final short MAX_LENGTH = 254;

    public ValidationResult isValid(String email){
        email = email.trim();

        if (!ValidationUtils.isValidLength(email, MIN_LENGTH, MAX_LENGTH)){
            return ValidationUtils.validationError(
                    "Email length must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters."
            );
        } else if (!isValidEmailFormat(email)) {
            return ValidationUtils.validationError(
                    "Invalid email format."
            );
        }

        return new ValidationResult(true);
    }

    private boolean isValidEmailFormat(String email){
        final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(EMAIL_PATTERN);
    }
}
