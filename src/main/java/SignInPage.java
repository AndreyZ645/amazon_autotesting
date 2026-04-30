import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
