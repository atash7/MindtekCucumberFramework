package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RedShelfAppPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class RedShelfAppSteps {

    WebDriver driver = Driver.getDriver();
    RedShelfAppPage redShelfAppPage = new RedShelfAppPage();

    @When("user searches author {string}")
    public void userSearchesAuthor(String author) throws InterruptedException {

        redShelfAppPage.searchBox.sendKeys(author+Keys.ENTER);
        //Thread.sleep(7000);
        BrowserUtils.waitElementToBeVisible(redShelfAppPage.searchBox);
    }


    @Then("user validates all books having author {string}")
    public void userValidatesAllBooksHavingAuthor(String author) {

        List<WebElement> listOfAuthor = redShelfAppPage.searchAuthor;
        for (WebElement element : listOfAuthor) {
            System.out.println(element.getText());
            Assert.assertTrue(element.getText().contains(author));
        }

    }
}
