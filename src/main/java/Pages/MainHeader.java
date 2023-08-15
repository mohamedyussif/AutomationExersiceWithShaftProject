package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class MainHeader
{
    private static SoftAssert softAssert;
    private static SHAFT.GUI.WebDriver webDriver;
    private By loggedInAsUserName_Link = By.xpath("//i[@class='fa fa-user']//parent::a");
    public MainHeader(SHAFT.GUI.WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }
    public MainHeader assertOn_Logged_in_a_username_Link_IsDisplayed(String name)
    {
        webDriver.assertThat().element(loggedInAsUserName_Link).text().isEqualTo("Logged in as "+name).perform();
        return this;
    }
    public MainHeader assertOnDisplayedNameInLoggedInAsEqualToAccounName(String name)
    {
        webDriver.assertThat().element(loggedInAsUserName_Link).text().isEqualTo("Logged in as "+name+"");
        return this;
    }
}
