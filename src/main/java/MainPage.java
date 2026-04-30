import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public MainPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final By searchBar = By.id("twotabsearchtextbox");
    private final By submitButton = By.id("nav-search-submit-button");

    public SearchResultsPage makeQuery(String query) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).sendKeys(query);
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
        return new SearchResultsPage(driver);
    }
}
