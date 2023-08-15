package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class AccountInformationDetails
{
    private SHAFT.GUI.WebDriver webDriver;
    private By enterAccountInformation_Text = By.xpath("//b[contains(text(), 'Enter Account Information')]");
    private By titleMr_InputRadio = By.id("id_gender1");
    private By password_Input = By.id("password");
    private String userChoosenPassword = "@Yussif010";
    private By date_Select = By.id("days");
    private String userChoosenDay = "17";
    private By date_option(String day)
    {
        return By.xpath("//select[@id=\"days\"]//option[@value='"+day+"']");
    }
    private  By month_Select = By.id("months");
    private String userChoosenMonth = "5";
    private  By month_option(String month)
    {
        return By.xpath("//select[@id=\"months\"]//option[@value='"+month+"']");
    }
    private By year_Select = By.id("years");
    private String userChoosenYear = "1998";
    public By year_option(String year)
    {
        return By.xpath("//select[@id=\"years\"]//option[@value='"+year+"']");
    }
    private By newsletter_input = By.id("newsletter");
    private By optin_input = By.id("optin");
    private  By firstName_input = By.id("first_name");
    private String userChoosenFirstName = "mohamed";
    private final By lastName_input = By.id("last_name");
    private String userChoosenLastName = "yussif";
    private By company_input = By.id("company");
    private String userChoosenCompany = "_VOIS";
    private By address_input = By.id("address1");
    private String userChoosenAddrress1 = "maadi";
    private By address2_input = By.id("address2");
    private String userChoosenAddress2 = "Old Egypt";
    private String userChoosenCountry = "India";
    private By country_Select = By.id("country");
    private By country_Option(String userChoosenCountry)
    {
        return By.xpath("//select[@id=\"country\"]//option[@value='"+userChoosenCountry+"']");
    }
    private By state_Input = By.id("state");
    private String userChoosenState = "old egypt";
    private By city_Input = By.id("city");
    private String userChoosenCity = "cairo";
    private By zipcode_Input = By.id("zipcode");
    private String userChoosenZipcode = "11211";
    private By mobileNumber_Input = By.id("mobile_number");
    private String userChoosenMobileNumber = "01146771200";
    private By createAccount_button = By.xpath("//button[@data-qa= \"create-account\"]");
    private By accountCreated_Text = By.xpath("//h2[@class='title text-center']/b");
    private By continue_button = By.xpath("//div[@class='pull-right']//a");
    private By deleteAccount_Link = By.xpath("//i[@class='fa fa-trash-o']//parent::a");
    private By deleteAccount_Text = By.xpath("//h2//b");

    public AccountInformationDetails(SHAFT.GUI.WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public AccountInformationDetails enterAccountInformation()
    {
       webDriver.element().click(titleMr_InputRadio);
       webDriver.element().type(password_Input, userChoosenPassword);
        webDriver.element().select(date_Select, userChoosenDay);
        webDriver.element().select(month_Select, userChoosenMonth);
        webDriver.element().select(year_Select, userChoosenYear);
        webDriver.element().click(newsletter_input);
        webDriver.element().click(optin_input);
        return this;
    }
    public AccountInformationDetails enterAddressInformation()
    {
        webDriver.element().type(firstName_input, userChoosenFirstName);
        webDriver.element().type(lastName_input, userChoosenLastName);
        webDriver.element().type(company_input, userChoosenCompany);
        webDriver.element().type(address_input, userChoosenAddrress1);
        webDriver.element().type(address2_input, userChoosenAddress2);
        webDriver.element().click(country_Select);
        webDriver.element().select(country_Select, userChoosenCountry);
        webDriver.element().type(state_Input, userChoosenState);
        webDriver.element().type(city_Input, userChoosenCity);
        webDriver.element().type(zipcode_Input, userChoosenZipcode);
        webDriver.element().type(mobileNumber_Input, userChoosenMobileNumber);
        return this;
    }
    public AccountInformationDetails clickOn_CreateAccount_Button()
    {
        webDriver.element().click(createAccount_button);
        return this;
    }
    public AccountInformationDetails assertOn_ENTERACCOUNTINFORMATION_Text_IsDisplayed()
    {
        webDriver.assertThat().element(enterAccountInformation_Text).exists().perform();
        return this;
    }
    public AccountInformationDetails assertOn_ACCOUNTCREATED_Text_IsDisplayed()
    {
        webDriver.assertThat().element(accountCreated_Text).exists().perform();
        return this;
    }
    public AccountInformationDetails clickOn_Continue_Button()
    {
        webDriver.element().click(continue_button);
        return this;
    }
    public AccountInformationDetails clickOn_DeleteAccount_Link()
    {
        webDriver.element().click(deleteAccount_Link);
        return this;
    }
    public AccountInformationDetails assertOn_Account_Deleted_Text_IsDisplayed()
    {
        webDriver.assertThat().element(deleteAccount_Text).exists().perform();
        return this;
    }
}
