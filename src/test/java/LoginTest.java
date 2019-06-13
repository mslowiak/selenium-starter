import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenium.pages.LoginPage;

class LoginTest extends BaseTestConfig {

    @BeforeAll
    static void startTest() {
        test = report.createTest("Login test 1");
    }

    @BeforeEach
    void setUp() {
        webDriver.get("https://www.phptravels.net/login");
    }

    @Test
    void loginTest() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("user@phptravels.com", "demouser");
        test.createNode("Credentials entered");
        loginPage.clickLogin();
        test.createNode("Login button clicked");
        loginPage.waitForLogin();
        test.createNode("Login complete");

        /*
        @RunWith(Suite.class)
        @Suite.SuiteClasses({Class1.class, Class2.class, Class3.class})
         */
    }
}
