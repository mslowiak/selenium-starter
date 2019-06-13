package selenium.config;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected WebDriver webDriver;

    protected abstract void createWebDriver();

    public void quitWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

    public WebDriver getWebDriver() {
        if (webDriver == null) {
            createWebDriver();
        }
        return webDriver;
    }
}
