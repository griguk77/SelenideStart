import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    private final static String BASE_URL = "http://localhost:5173/login";
    private final static String userLogin = "student";
    private final static String userPassword = "student123";

    @Test
    public void loginTest() {
        new LoginPage(BASE_URL).login(userLogin, userPassword);
    }
}