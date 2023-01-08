package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMAppNewEmployeePage {

    public OrangeHRMAppNewEmployeePage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "middleName")
    public WebElement middleName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(className = "oxd-input oxd-input--active")
    public WebElement idBtn;

}
