package Registration;

import User.User;
import Validations.Validation;
import java.util.List;

public class Registration {

    public void signUp(User user) {
        Validation validation = new Validation();
        List<String> errors = validation.validate(user);

        if (errors.isEmpty()) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed:");
            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
    }
}