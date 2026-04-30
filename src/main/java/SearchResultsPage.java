import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final By firstItemCard = By.xpath("(//div[@role='listitem'])[1]");

    public WebElement fetchFirstCard() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemCard));
    }
}
