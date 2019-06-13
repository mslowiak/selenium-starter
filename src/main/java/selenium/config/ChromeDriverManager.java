package selenium.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        this.webDriver = new ChromeDriver(chromeOptions);
    }
}
