package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class BrowserUtils {

    /**
     * This method will accept WebElement of dropdown
     * and String value of dropdown, and will select
     * provided value in dropdown.
     */

    public static void selectDropdownByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }

    /**
     * This method takes screenshots.
     * Ex:
     *      takeScreenshot("SauceDemo Test")
     */

    public static void takeScreenshot(String testName) throws IOException {
        WebDriver driver = Driver.getDriver();
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path = "src/test/resources/screenshots/"+testName+".png";
        File file = new File(path);
        FileUtils.copyFile(screenshot, file);
    }

    /**
     * This methods generates eMails.
     * Ex:
     *      getRandomEmail(); -> returns testUser12345@gmail.com
     */
    public static String getRandomEmail(){
        String userName = "user";
        UUID uuid = UUID.randomUUID();
        return userName+uuid+"@gmail.com";
    }

    /**
     * This method generates very strong password.
     * Ex:
     *      getRandomStrongPassword(); -> returns random very strong password
     */
    public static String getRandomStrongPassword(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static WebElement watElementToBeClickable(WebElement element){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        WebElement element1= wait.until((ExpectedConditions.elementToBeClickable(element)));
        return element1;
    }
    public static WebElement waitElementToBeVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        WebElement element1= wait.until((ExpectedConditions.visibilityOf(element)));
        return element1;
    }

}
