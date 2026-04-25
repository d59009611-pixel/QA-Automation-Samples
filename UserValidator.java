public class UserValidator {

    public boolean checkPhone(String phone) {
        if (phone == null) return false;
        String cleanPhone = phone.replaceAll("[^0-9+]", ""); 
        return cleanPhone.startsWith("+998") && cleanPhone.length() == 13;
    }

    public boolean checkName(String name) {
        if (name == null || name.length() < 2) return false;
        return name.matches("[a-zA-Zа-яА-Я]+");
    }

    public boolean checkPassword(String pass) {
        return pass != null && pass.length() >= 8;
    }
}
