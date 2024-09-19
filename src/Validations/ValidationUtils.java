package Validations;

public class ValidationUtils {
    public static ValidationResult validationError(String message) {
        return new ValidationResult(false, message);
    }

    public static boolean isEmpty(String argument){
        return argument == null || argument.trim().isEmpty();
    }

    public static boolean isValidLength(String argument, int MIN_LENGTH, int MAX_LENGTH) {
        return argument.length() >= MIN_LENGTH && argument.length() <= MAX_LENGTH;
    }

    public static boolean hasSpaces(String argument){
        return argument.contains(" ");
    }

    public static boolean isValidCharacters(String argument){
        return argument.matches("^[a-zA-Z0-9_]+$");
    }

    public static boolean startsWithAlphabet(String argument){
        return Character.isLetter(argument.charAt(0));
    }

    public static boolean containsBannedKeyword(String argument, String[] bannedKeyWords){

        for(String bannedKeyWord : bannedKeyWords){
            if(argument.toLowerCase().contains(bannedKeyWord.toLowerCase())){
                return true;
            }
        }

        return false;
    }

    public static boolean containsUpperCase(String argument) {
        return argument.matches(".*[A-Z].*");
    }

    public static boolean containsLowerCase(String argument) {
        return argument.matches(".*[a-z].*");
    }

    public static boolean containsDigit(String argument) {
        return argument.matches(".*\\d.*");
    }

    public static boolean containsSpecialChar(String argument) {
        return argument.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }
}
