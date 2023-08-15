package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage
{
    private SHAFT.GUI.WebDriver webDriver;
    private String url = "https://automationexercise.com/";
    private By login_Link = By.xpath("//a[@href=\"/login\"]");

    public HomePage(SHAFT.GUI.WebDriver webDriver)
    {
        this.webDriver = webDriver;

    }

    public HomePage clickOnSignupLink()
    {
        webDriver.element().click(login_Link);
        return this;
    }
    public HomePage navigateToHomePage()
    {
        webDriver.browser().navigateToURL(url);
        return this;
    }

}
