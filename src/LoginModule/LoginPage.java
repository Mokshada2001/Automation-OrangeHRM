package LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void inputCredentials(String uname, String psd) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        usernameField.sendKeys(uname);

        passwordField.sendKeys(psd);

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector
                (".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")));
        loginButton.click();

    }

}

