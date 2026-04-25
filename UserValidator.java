public class UserValidator {

    public boolean isValidPhoneNumber(String phone) {
        if (phone == null) return false;
        String cleanPhone = phone.trim();
        return cleanPhone.startsWith("+998") && cleanPhone.length() == 13;
    }

    public boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty() && name.matches("^[a-zA-Zа-яА-Я]*$");
    }

    public boolean isSecurePassword(String password) {
        return password != null && password.length() >= 8;
    }
}
