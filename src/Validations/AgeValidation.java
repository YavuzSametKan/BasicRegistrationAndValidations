package Validations;

public class AgeValidation {
    private final int MIN_AGE = 16;
    private final int MAX_AGE = 127;

    public ValidationResult isValid(byte age){
        if (age < MIN_AGE || age > MAX_AGE){
            return ValidationUtils.validationError(
                    "Age must be between " + MIN_AGE + " and " + MAX_AGE
            );
        }

        return new ValidationResult(true);
    }
}
