package LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPassword{

    WebDriver driver;
    WebDriverWait wait;

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void resetPassword(String username) {
        WebElement forgotPasswordLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")));
        forgotPasswordLink.click();

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        usernameField.sendKeys(username);

        WebElement resetButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        resetButton.click();
    }

}
