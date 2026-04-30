import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SearchTest extends BaseTest{

    @Test
    public void testSearch() {
        driver.get("https://www.amazon.com/");
        MainPage mainPage = new MainPage(driver);
        String query = "lego 21276";
        SearchResultsPage resultsPage = mainPage.makeQuery(query);
        String description = resultsPage.fetchFirstCard().getText().toLowerCase();
        boolean mathesQuery = Arrays.stream(query.split("\\s+")).allMatch(description::contains);
        Assertions.assertTrue(mathesQuery, "Item doesn't match the query");
    }
}
