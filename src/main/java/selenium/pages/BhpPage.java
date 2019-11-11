package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BhpPage {
    private WebDriver webDriver;
    private By clickButton = By.xpath("//*[@id=\"bdalej\"]");
    private By waitSpan = By.xpath("//*[@id=\"sec\"]");

    public BhpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickNext() {
        try {
            waitForTextEmpty();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(clickButton).click();
    }

    private void waitForTextEmpty() throws InterruptedException {
        for (int i = 0; i < 120; ++i) {
            WebElement element = webDriver.findElement(waitSpan);
            String text = element.getText();
            if (text.isEmpty()) {
                return;
            }
            Thread.sleep(1000L);
        }
    }
}
