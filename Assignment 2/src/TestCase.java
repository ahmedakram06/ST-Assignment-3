import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TestCase {

    @Test
    void testValidLogin() {
        LoginApp loginService = new LoginApp();
        String email = "johndoe@example.com";
        String password = "password123";
        String result = loginService.authenticateUser(email, password);
        assertEquals("John Doe", result);

    }

    @Test
    public void testInvalidPassword() {
        LoginApp loginService = new LoginApp();
        String email = "johndoe@example.com";
        String password = "444444";
        String result = loginService.authenticateUser(email, password);
        assertNull(result);
    }
    @Test
    public void testInvalidEmail() {
        LoginApp loginService = new LoginApp();
        String email = "ahmedakram@gmail.com";
        String password = "123456789";
        String result = loginService.authenticateUser(email, password);
        assertNull(result);
    }
    @Test
    public void testEmptyEmailAndPassword() {
        LoginApp loginService = new LoginApp();
        String email = "";
        String password = "";
        String result = loginService.authenticateUser(email, password);
        assertNull(result);
    }
    @Test
    public void testNullEmailAndPassword() {
        LoginApp loginService = new LoginApp();
        String result = loginService.authenticateUser(null, null);
        assertNull(result);
    }
}