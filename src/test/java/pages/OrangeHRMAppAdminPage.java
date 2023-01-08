package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMAppAdminPage {

    public OrangeHRMAppAdminPage(){
        WebDriver driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }



}
