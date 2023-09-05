import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    @FindBy(id = "login2")
    public WebElement loginBtn;


    WebDriver driver = DriverSetup.getDriver();

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

}
