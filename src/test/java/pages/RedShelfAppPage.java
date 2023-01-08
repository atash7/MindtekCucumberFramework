package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RedShelfAppPage {

    public RedShelfAppPage() {
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-catalog-navbar")
    public WebElement searchBox;


    @FindBy(xpath = "//*[@id=\"ember32\"]/div[1]/div")
    public List<WebElement> searchAuthor;

}
