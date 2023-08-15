import Pages.AccountInformationDetails;
import Pages.HomePage;
import Pages.MainHeader;
import Pages.SignupPage;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegisterUser
{
    SHAFT.GUI.WebDriver webDriver;

    @BeforeMethod
    public void beforeUserRegister()
    {
        webDriver = new SHAFT.GUI.WebDriver();
        new HomePage(webDriver).navigateToHomePage();

    }
    @Test
    public void checkUserRegisteration()
    {
        new HomePage(webDriver)
                .clickOnSignupLink();
        new SignupPage(webDriver)
                .assertOnNewUserSignUp_Text_IsDisplayed()
                .enteringNameAndEmailAddressFields()
                .clickOnSignUpButton();
        new AccountInformationDetails(webDriver)
                .assertOn_ENTERACCOUNTINFORMATION_Text_IsDisplayed()
                .enterAccountInformation()
                .enterAddressInformation()
                .clickOn_CreateAccount_Button()
                .assertOn_ACCOUNTCREATED_Text_IsDisplayed()
                .clickOn_Continue_Button();
        new MainHeader(webDriver)
                .assertOn_Logged_in_a_username_Link_IsDisplayed()
                .assertOnDisplayedNameInLoggedInAsEqualToAccounName("Mohamed");
        new AccountInformationDetails(webDriver)
                .clickOn_DeleteAccount_Link()
                .assertOn_Account_Deleted_Text_IsDisplayed()
                .clickOn_Continue_Button();

    }
    @AfterMethod
    public void afterRegisterUser()
    {
        webDriver.quit();
    }
}
