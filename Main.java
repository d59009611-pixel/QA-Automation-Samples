public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();

        System.out.println("Phone: " + validator.checkPhone("+998 (99) 733-62-73"));
        System.out.println("Name with digits: " + validator.checkName("Daler123"));
        System.out.println("Pass: " + validator.checkPassword("password123"));
    }
}
