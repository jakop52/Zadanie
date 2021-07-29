package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class ZadanieTest extends AbstractTest {

    @Test
    public void zadanie() {
        Assert.assertEquals(
                new GoogleSearchPage(driver)
                        .applyRegulations()
                        .fillSearchBox("ChromeDriver - WebDriver for Chrome - Downloads")
                        .clickSearchButton()
                        .countSearchResultsOnPage()
                        .selectWebsite(3)
                        .getCurrentAddress(), "https://chromedriver.chromium.org/downloads/version-selection");

    }
}
