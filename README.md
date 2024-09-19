# User Registration and Validation System

## Overview

This project is a Java-based user registration and validation system designed to ensure that user information meets specific criteria before registration. The system validates various user attributes like username, password, email, name, surname, and age to ensure they adhere to predefined validation rules. If any of the criteria are not met, the system provides detailed error messages.

## Features

- **User Registration:** Users can register with a username, password, email, name, surname, age, and gender.
- **Validation:** Each user attribute undergoes strict validation to ensure it meets the required format and conditions.
- **Error Reporting:** If a validation rule is violated, the system returns a detailed error message for each issue.

### Example

```java
public class Main {
    public static void main(String[] args) {
        User user1 = new User(
                "Charter34",
                "<123Yavuz123>",
                "yssk.personal@gmail.com",
                "Yavuz Samet",
                "Kan",
                (byte) 21,
                true
        );

        User user2 = new User(
                "_Wind21",
                "12345678",
                "wind33@gmail",
                "Tulin",
                "Kara",
                (byte) 13,
                false
        );

        Registration registration = new Registration();

        registration.signUp(user1);
        user1.printInfoToConsole();

        registration.signUp(user2);
        user2.printInfoToConsole();
    }
}
```

### Output
```
Registration successful!
### USER INFO ###
Username: Charter34
E-mail: yssk.personal@gmail.com
Name: Yavuz Samet
Surname: Kan
Age: 21
Gender: Male

Registration failed:
- The username must start with a letter.
- Password must contain at least one uppercase letter.
- Invalid email format.
- Age must be between 16 and 127
### USER INFO ###
Username: _Wind21
E-mail: wind33@gmail
Name: Tulin
Surname: Kara
Age: 13
Gender: Female
```


