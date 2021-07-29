package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSearchResultsPage extends AbstractPage{

    @FindBy(className = "g")
    private List<WebElement> searchResultsList;

    public GoogleSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public GoogleSearchResultsPage countSearchResultsOnPage(){
        System.out.println("Number of search results on page: "+searchResultsList.size());
        return this;
    }

    public SelectedWebsite selectWebsite(int index){
        clickElement(searchResultsList.get(index-1));
        return new SelectedWebsite(driver);
    }


}
