import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddToListTest extends BaseTest{

    @Test
    public void testSignInPageAfterAddToCart() {
        driver.get("https://www.amazon.com/");
        MainPage mainPage = new MainPage(driver);
        String query = "lego 21276";
        SearchResultsPage resultsPage = mainPage.makeQuery(query);
        resultsPage.fetchFirstCard().click();
        SignInPage signInPage = resultsPage.addToList();
        boolean isSignInPage = driver.getCurrentUrl().startsWith("https://www.amazon.com/ap/signin");
        Assertions.assertTrue(isSignInPage);
    }
}
