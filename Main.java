public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        System.out.println("Проверка номера +998... : " + validator.checkPhone("+998997336273"));
        System.out.println("Проверка короткого пароля: " + validator.checkPassword("123"));
        System.out.println("Проверка имени: " + validator.checkName("Daler"));
    }
}
