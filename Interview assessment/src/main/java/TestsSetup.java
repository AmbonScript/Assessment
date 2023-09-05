import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestsSetup {

    @BeforeAll
    public static void setup() {
        DriverSetup.setDriver();
    }

    @BeforeEach
    public void open() {
        WebDriver driver = DriverSetup.getDriver();
        driver.get("https://www.demoblaze.com");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() {
        DriverSetup.closeDriver();
    }


}
