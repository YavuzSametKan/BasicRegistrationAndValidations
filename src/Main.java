import User.User;
import Registration.Registration;

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