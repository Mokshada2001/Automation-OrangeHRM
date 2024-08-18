package LoginModule;


import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LPTest() {
        LoginPage lp = new LoginPage(driver);

        lp.inputCredentials("Admin", "admin123");
    }
}

