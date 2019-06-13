package selenium.config;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType driverType) {
        DriverManager driverManager;

        if (driverType == DriverType.CHROME) {
            driverManager = new ChromeDriverManager();
        } else {
            throw new UnsupportedOperationException();
        }

        return driverManager;
    }
}
