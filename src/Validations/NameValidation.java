package Validations;

public class NameValidation {
    private final int MIN_LENGTH = 2;
    private final int MAX_LENGTH = 128;

    public ValidationResult isValid(String name){
        if (!ValidationUtils.isValidLength(name, MIN_LENGTH, MAX_LENGTH)){
            return ValidationUtils.validationError(
                    "Name must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters."
            );
        } else if (!isValidNameFormat(name)) {
            return ValidationUtils.validationError(
                    "Name can only contain letters, spaces, apostrophes, and hyphens."
            );
        }

        return new ValidationResult(true);
    }

    private boolean isValidNameFormat(String name){
        return name.matches("[a-zA-Z\\s'-]+");
    }
}
