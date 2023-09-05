import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ElementWaiting {

    public static void waitForElement(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<>(DriverSetup.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
