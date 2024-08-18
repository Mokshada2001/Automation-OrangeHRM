package MyInfoModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyInfo {

    WebDriver driver;
    WebDriverWait wait;

    public MyInfo (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void inputInfo(String uname, String psd) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        usernameField.sendKeys(uname);

        passwordField.sendKeys(psd);

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector
                (".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")));
        loginButton.click();

    }
    public void MyInfoAction() {

        WebElement clickMyInfo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[contains(@class, 'oxd-main-menu-item') and contains(@class, 'active')]")));
        clickMyInfo.click();

    }

}

