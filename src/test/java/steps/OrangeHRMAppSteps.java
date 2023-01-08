package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class OrangeHRMAppSteps {

    WebDriver driver = Driver.getDriver();


    @When("user enters username {string} and password {string} and press ENTER")
    public void user_enters_username_and_password_and_press_ENTER(String username, String password) {

    }
    @And("user lands on homepage and clicks PIM button")
    public void user_Lands_On_Homepage_And_Clicks_PIM_Button() {
    }

    @And("user lands on PIM page and clicks the +add button")
    public void user_Lands_On_PIM_Page_And_Clicks_The_Add_Button() {
    }

    @And("user lands on create employee page and create a new employee by entering firstName {string}, middleName {string} lastName {string} and click Save")
    public void user_Lands_On_Create_Employee_Page_And_Create_A_New_Employee_By_Entering_FirstName_MiddleName_LastName_And_Click_Save(String firstName, String middleName, String lastName) {
    }

    @And("user lands back on PIM page and clicks Admin page")
    public void user_Lands_Back_On_PIM_Page_And_Clicks_Admin_Page() {
    }

    @And("user lands on Admin User Management page and clicks add button")
    public void user_Lands_On_Admin_User_Management_Page_And_Clicks_Add_Button() {
    }

    @And("user lands on +add user page and clicks userRole {string} status {string} employee {string} userName {string} confirmPassword {string}")
    public void userLandsOnAddUserPageAndClicksUserRoleStatusEmployeeUserNameConfirmPassword(String Admin, String Enabled, String JenniferLopez, String Jen1234, String Jen123456) {
    }
}
