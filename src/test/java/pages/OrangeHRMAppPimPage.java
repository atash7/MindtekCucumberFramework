package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMAppPimPage {

    public OrangeHRMAppPimPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "oxd-button oxd-button--medium oxd-button--secondary")
    public WebElement addBtn;

    @FindBy(className = "oxd-text oxd-text--span oxd-main-menu-item--name")
    public WebElement adminBtn;

}
