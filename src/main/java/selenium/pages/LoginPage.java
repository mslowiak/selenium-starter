package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver webDriver;
    private By emailInput = By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input");
    private By passwordInput = By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input");
    private By loginButton = By.xpath("//*[@id=\"loginfrm\"]/button");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void login(String username, String password) {
        webDriver.findElement(emailInput).sendKeys(username);
        webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        webDriver.findElement(loginButton).click();
    }

    public void waitForLogin() {
        WebDriverWait wait = new WebDriverWait(webDriver, TimeUnit.SECONDS.toSeconds(10));
        wait.until(ExpectedConditions.titleIs("My Account"));
    }
}
