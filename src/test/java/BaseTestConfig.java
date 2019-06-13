import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import selenium.config.DriverManager;
import selenium.config.DriverManagerFactory;
import selenium.config.DriverType;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class BaseTestConfig {
    private static final String reportName = new SimpleDateFormat("'report'yyyyMMddHHmm'.html'").format(new Date());
    private static DriverManager driverManager;
    static ExtentTest test;
    static ExtentReports report;
    static WebDriver webDriver;

    @BeforeAll
    static void setUpBeforeClass() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        webDriver = driverManager.getWebDriver();
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\selenium\\" + reportName);
        htmlReporter.config().enableTimeline(true);
        htmlReporter.config().setTheme(Theme.STANDARD);

        report = new ExtentReports();
        report.attachReporter(htmlReporter);
    }


    @AfterAll
    static void tearDownAfterClass() {
        driverManager.quitWebDriver();
        report.flush();
    }
}
