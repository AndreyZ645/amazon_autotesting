import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        String hubUrl = "http://localhost:4444";

        try {
            driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Некорректный URL-адрес хаба Selenium Grid: " + hubUrl, e);
        }
    }

    @AfterAll
    public static void teatDown() {
        driver.quit();
    }
}
