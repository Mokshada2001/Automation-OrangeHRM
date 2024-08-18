package MyInfoModule;

import LoginModule.BaseTest;
import org.testng.annotations.Test;

public class MyInfoTest extends BaseTest {

    @Test
    public void MITest() {
        MyInfo mi = new MyInfo(driver);

        mi.inputInfo("Admin", "admin123");

        mi.MyInfoAction();
    }
}
