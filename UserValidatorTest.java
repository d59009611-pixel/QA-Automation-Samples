import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    UserValidator validator = new UserValidator();

    @Test
    void testPassword() {
        assertTrue(validator.isSecurePassword("mySafePassword123"));
        assertFalse(validator.isSecurePassword("123"));
    }

    @Test
    void testEmail() {
        assertTrue(validator.isValidEmail("daler@google.com"));
        assertFalse(validator.isValidEmail("daler.com"));
    }
}

