package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage  extends AbstractPage{

    @FindBy(name="q")
    private WebElement searchTextBox;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/span/div/div/div[3]/button[2]")
    private WebElement applyRegulationsButton;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    public GoogleSearchPage applyRegulations(){
        clickElement(applyRegulationsButton);
        return this;
    }
    public GoogleSearchPage fillSearchBox(String textToSearch){
        fillElement(searchTextBox,textToSearch);
        return this;
    }

    public GoogleSearchResultsPage clickSearchButton(){
        clickElement(searchButton);
        return new GoogleSearchResultsPage(driver);
    }


}
