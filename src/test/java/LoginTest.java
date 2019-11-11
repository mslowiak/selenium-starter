import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenium.pages.BhpPage;

class LoginTest extends BaseTestConfig {

    @BeforeAll
    static void startTest() {
        test = report.createTest("Login test 1");
    }

    @BeforeEach
    void setUp() {
        webDriver.get("https://bhkszkolenia.cm-uj.krakow.pl/index.php/wejscie/adres/pl/6B6B61726F6C696E612E747572656B40676D61696C2E636F6D");
    }

    @Test
    void loginTest() {
        BhpPage bhpPage = new BhpPage(webDriver);
        while (true) {
            bhpPage.clickNext();
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        /*
        @RunWith(Suite.class)
        @Suite.SuiteClasses({Class1.class, Class2.class, Class3.class})
         */
    }
}
