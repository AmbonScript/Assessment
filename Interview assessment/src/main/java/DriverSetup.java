import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {

    private static WebDriver driver;

    public static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--window-size=1920,1200", "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

}
