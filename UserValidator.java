public class UserValidator {
    public boolean isSecurePassword(String password) {
        return password != null && password.length() >= 8;
    }
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}

