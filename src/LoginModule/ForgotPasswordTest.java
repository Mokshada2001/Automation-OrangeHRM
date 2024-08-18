package LoginModule;

import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest{

    @Test
    public void FPTest() {
        ForgotPassword fp = new ForgotPassword(driver);

        fp.resetPassword("Admin");

    }

}


