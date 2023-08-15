package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SignupPage
{
     SHAFT.GUI.WebDriver webDriver;
    private By newUserSignup_h2 = By.xpath("//div[@class='signup-form']//h2");
    private By newUserName_Input = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By newUserEmail_Input = By.xpath("//input[@data-qa=\"signup-email\"]");
    private String userSignupName = "Mohamed";
    private String userSignupEmailAddress = "mohamed" + (System.currentTimeMillis()) + ("@gmail.com");
    private By signUp_Button = By.xpath("//button[@data-qa=\"signup-button\"]");
    public SignupPage(SHAFT.GUI.WebDriver webDriver)
    {
        this.webDriver = webDriver;

    }

    public SignupPage enteringNameAndEmailAddressFields()
    {
        webDriver.element().type(newUserName_Input, userSignupName);
        webDriver.element().type(newUserEmail_Input, userSignupEmailAddress);
        return this;
    }
    public SignupPage clickOnSignUpButton()
    {
        webDriver.element().click(signUp_Button);
        return this;
    }
    public SignupPage assertOnNewUserSignUp_Text_IsDisplayed()
    {
        webDriver.assertThat().element(newUserSignup_h2).exists().perform();
        return this;
    }
}
