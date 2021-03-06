package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void fillElement(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }
    public void clickElement(WebElement element) {
        element.click();
    }

    public String getCurrentAddress(){
        return driver.getCurrentUrl();
    }
}
