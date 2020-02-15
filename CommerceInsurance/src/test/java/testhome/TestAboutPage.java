package testhome;

import home.pageobject.AboutPage;
import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAboutPage extends AboutPage {
    @Test
    public void Header1() throws InterruptedException { PageFactory.initElements(driver, AboutPage.class);sleepFor(2);setHeader1(); }
    @Test
    public void Header2() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);setHeader2(); }
    @Test
    public void searchBoxInput() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);setSearch();sleepFor(2);navigateBack();
        String actual = "Autoloan"; Assert.assertEquals(actual,"Autoloan");if (actual== null){System.out.println("Test Failed");} else { System.out.println("Test Passed"); }}
    @Test
    public void getHelpText() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);helpUsSpread();
        String actual = "[Help us spread the word!]"; Assert.assertEquals(actual,"[Help us spread the word!]");
        if (actual== "[Help us spread the word!]"){System.out.println("Test Passed");} else {
            System.out.println("Test Failed");}}
    @Test
    public void clickOnMphree() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickMphree();}
    @Test
    public void clickOnInsurance() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInsurance();}
    @Test
    public void clickOnClaim() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInClaim();}
    @Test
    public void clickOnCustomerServices() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInCustomerServices();}
    @Test
    public void clickOnAboutUs() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInAboutUs();}
    @Test
    public void clickOnContact() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInContact();sleepFor(2);navigateBack();}
    @Test
    public void clickOnCustomerAccess() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInCustomerAccess();sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void mouseHoverOnCustomerAccess() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);mouseHoverCustomerServices();sleepFor(2);}
    @Test
    public void clickOnMapfreeCorporate() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInMapreeCorporate();sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnCustomerAgent() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInAgent();sleepFor(2);}
    @Test
    public void clickOnCareer() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);ClickInMapreeCareer();sleepFor(2);navigateBack();}
    @Test
    public void clickOnLanguage() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);clickInLanguage();sleepFor(2);}
    @Test
    public void selectOnLanguage() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);clickInLanguage();sleepFor(2);selectLanguage();
        sleepFor(2);clickInLanguage();selectEnglishLanguage();}
    @Test
    public void selectEnglish() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);getListOfWebElementsByXpath(webElementTextQuote);
        String actual = "[Get a Quote" + "Auto" + "Property]"; Assert.assertEquals(actual,"[Get a Quote" + "Auto" + "Property]");
        if (actual== null){System.out.println("Test Fail");} else { System.out.println("Test Passed"); }}
    @Test
    public void clickOnAutoQuote() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);selectAutoQuote();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnPropertyQuote() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);selectProprtyQuote();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnMakePayment() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);selectMakePayment();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnReportClaim() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);selectReportClaim();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnFindAgent() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);selectFindAgent();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnWhereWe() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);setSelectCustomer();
        sleepFor(2);}
    @Test
    public void clickOnCustomer() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);setSelectCustomer();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnCustomer1() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);setSelectCustomer();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
    @Test
    public void clickOnCustomer2() throws InterruptedException { PageFactory.initElements(driver,AboutPage.class);sleepFor(2);setSelectCustomer();
        sleepFor(2);handleNewTab(driver).close();sleepFor(2);}
}
