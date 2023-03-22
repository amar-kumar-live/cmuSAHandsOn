import java.util.Scanner;

public class passwordChecker {
    // An array of commonly used passwords
    private static final String[] COMMON_PASSWORDS = { "password123", "123456", "qwerty", "letmein", "monkey",
            "football", "admin12345", "welcome", "abc123" };

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a password to check its strength:");
String password = scanner.nextLine();
// Check password length
if (password.length() < 8) {
System.out.println("Password is too short. It should be at least 8 characters long.");
}
// Check password complexity
else {
boolean hasUppercase = false;
boolean hasLowercase = false;
boolean hasNumber = false;
boolean hasSpecialChar = false;
for (int i = 0; i < password.length(); i++) {
char c = password.charAt(i);
if (Character.isUpperCase(c)) {
hasUppercase = true;
}
else if (Character.isLowerCase(c)) {
hasLowercase = true;
}
else if (Character.isDigit(c)) {
hasNumber = true;
}
else if (isSpecialChar(c)) {
hasSpecialChar = true;
}
}
if (!(hasUppercase && hasLowercase && hasNumber && hasSpecialChar)) {
System.out.println("Password is not complex enough. It should contain at least one uppercase letter, one
lowercase letter, one number, and one special character.");
}
// Check password uniqueness
else if (isCommonPassword(password)) {
System.out.println("Password is too common. Please choose a stronger password.");
}
else {
System.out.println("Password is strong!");
}
}
scanner.close();
}

    // Helper method to check if a character is a special character
    private static boolean isSpecialChar(char c) {
        String specialChars = "!@#$%^&*()-+";
        return specialChars.contains(String.valueOf(c));
    }

    // Helper method to check if a password is in the array of common passwords
    private static boolean isCommonPassword(String password) {
        for (String commonPassword : COMMON_PASSWORDS) {
            if (password.equals(commonPassword)) {
                return true;
            }
        }
        return false;
    }
}