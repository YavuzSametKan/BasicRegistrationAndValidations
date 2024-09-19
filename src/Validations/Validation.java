package Validations;

import User.User;
import java.util.ArrayList;
import java.util.List;

public class Validation {
    private UserNameValidations userNameValidations = new UserNameValidations();
    private PasswordValidations passwordValidations = new PasswordValidations();
    private EmailValidations emailValidations = new EmailValidations();
    private NameValidation nameValidations = new NameValidation();
    private AgeValidation ageValidations = new AgeValidation();

    public List<String> validate(User user) {
        List<String> errors = new ArrayList<>();

        ValidationResult result;

        result = userNameValidations.isValid(user.getUserName());
        if (!result.isValid()) errors.add(result.getMessage());

        result = passwordValidations.isValid(user.getPassword());
        if (!result.isValid()) errors.add(result.getMessage());

        result = emailValidations.isValid(user.getEmail());
        if (!result.isValid()) errors.add(result.getMessage());

        result = nameValidations.isValid(user.getName());
        if (!result.isValid()) errors.add(result.getMessage());

        result = nameValidations.isValid(user.getSurname());
        if (!result.isValid()) errors.add(result.getMessage());

        result = ageValidations.isValid(user.getAge());
        if (!result.isValid()) errors.add(result.getMessage());

        return errors;
    }
}