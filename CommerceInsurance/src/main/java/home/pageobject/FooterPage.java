package home.pageobject;

import home.webelement.WebElementFooter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterPage extends WebElementFooter {
    // All the Home Page Action Methods comes on this class
    //Header
    @FindBy(xpath = webElementHeader1) public static String header1;

    @FindBy(xpath = webElementHeader2) public static WebElement header2;

    public static String getHeader1(){return header1;}
    public static WebElement getHeader2(){return header2;}

    public static void setHeader1() { System.out.println( getTextFromWebElements(webElementHeader1)); }
    public static void setHeader2() { System.out.println( getTextFromWebElements(webElementHeader2)); }
    //SearchBox
    @FindBy(xpath = webElementsearchBox) public static WebElement search;

    public static WebElement getSearch() { return search; }

    public static void setSearch() {getSearch().sendKeys("Autoloan", Keys.ENTER);}

    //Get Text
    public static void helpUsSpread() { System.out.println( getTextFromWebElements(webElementhelpUsSpread)); }
    //Click Mphree
    @FindBy(xpath = webElementClickMphree) public static WebElement clickMphree;

    public static WebElement setClickMphree (){return clickMphree;}

    public static void ClickMphree() { setClickMphree().click(); }

    //Click Insurance
    @FindBy(xpath = webElementClickInsurance) public static WebElement clickInsurance;

    public static WebElement getClickInsurance() { return clickInsurance; }

    public static void ClickInsurance() { getClickInsurance().click(); }

    //Click Claims
    @FindBy(xpath = webElementClickClaim) public static WebElement clickClaim;

    public static WebElement getClickClaim() { return clickClaim; }

    public static void ClickInClaim() { getClickClaim().click(); }

    //Click CustomerServices
    @FindBy(xpath = webElementClickCustomerServices) public static WebElement clickCustomerServices;

    public static WebElement getClickCustomerServices() { return clickCustomerServices; }

    public static void ClickInCustomerServices() { getClickCustomerServices().click(); }

    //Click Claims
    @FindBy(xpath = webElementClickAbouUs) public static WebElement clickAboutUs;

    public static WebElement getClickAboutUs() { return clickAboutUs; }

    public static void ClickInAboutUs() { getClickAboutUs().click(); }

    //Click Contact
    @FindBy(xpath = webElementClickContact) public static WebElement clickContact;

    public static WebElement getClickContact() { return clickContact; }

    public static void ClickInContact() { getClickContact().click(); }

    //Click Customer Access
    @FindBy(how = How.XPATH,using = webElementClickCustomerAccess) public static WebElement clickCustomerAccess;

    public static WebElement getClickCustomerAccess() { return clickCustomerAccess; }

    public static void ClickInCustomerAccess() { getClickCustomerAccess().click(); }
    //MouseHover Customer services
    public static void mouseHoverCustomerServices() { mouseHoverByXpath(webElementClickCustomerServices); }

    //MouseHover Agent portal
    @FindBy(how = How.XPATH,using = webElementClickAgent) public static WebElement clickAgent;

    public static WebElement getClickAgent() { return clickAgent; }

    public static void ClickInAgent() { getClickAgent().click(); }

    //Click Mapfree Corporete
    @FindBy(how = How.XPATH,using = webElementClickMphreeCorporate) public static WebElement clickMapfreeCorporate;

    public static WebElement getClickMapfreeCorporate() { return clickMapfreeCorporate; }

    public static void ClickInMapreeCorporate() { getClickMapfreeCorporate().click(); }

    //Click Carrers
    @FindBy(how = How.XPATH,using = webElementClickCareer) public static WebElement clickMapfreeCareer;

    public static WebElement getClickMapfreeCareer() { return clickMapfreeCareer; }

    public static void ClickInMapreeCareer() { getClickMapfreeCareer().click(); }

    //Click Language
    @FindBy(how = How.XPATH,using = webElementClickLanguage) public static WebElement clickLanguage;

    public static WebElement getClickLanguage() { return clickLanguage; }

    public static void clickInLanguage() { getClickLanguage().click(); }

    //Select Language Spanish
    @FindBy(how = How.XPATH,using = webElementSelectLanguage) public static WebElement selectLanguage;

    public static WebElement getSelectLanguage() { return selectLanguage; }

    public static void selectLanguage() { getSelectLanguage().click(); }

    //Select Language Spanish
    @FindBy(how = How.XPATH,using = webElementSelectEnglish) public static WebElement selectEnglish;

    public static WebElement getLanguageEnglish() { return selectEnglish; }

    public static void selectEnglishLanguage() { getLanguageEnglish().click(); }

    //Click on Auto quote
    @FindBy(how = How.XPATH,using = webElementAutoQoute) public static WebElement selectAutoQuote;

    public static WebElement getAutoQuote() { return selectAutoQuote; }

    public static void selectAutoQuote() { getAutoQuote().click(); }

    //Click on Property quote
    @FindBy(how = How.XPATH,using = webElementPropertyQuote) public static WebElement selectPropertyQuote;

    public static WebElement getPropertyQuote() { return selectPropertyQuote; }

    public static void selectProprtyQuote() { getPropertyQuote().click(); }
    //Click on Make Payment
    @FindBy(how = How.XPATH,using = webElementClickMakePayment) public static WebElement selectMakePayment;

    public static WebElement getSelectMakePayment() { return selectMakePayment; }

    public static void selectMakePayment() { getSelectMakePayment().click(); }
    //Click on Report Claims
    @FindBy(how = How.XPATH,using = webElementClickReportClaim) public static WebElement selectReportClaim;

    public static WebElement getSelectReportClaim() { return selectReportClaim; }

    public static void selectReportClaim() { getSelectReportClaim().click(); }

    //Click on Find Agent
    @FindBy(how = How.XPATH,using = webElementClickFindAgent) public static WebElement selectFindAgent;

    public static WebElement getSelectFindAgent() { return selectFindAgent; }

    public static void selectFindAgent() { getSelectFindAgent().click(); }

    //Click on Where we are
    @FindBy(how = How.XPATH,using = webElementClickWhere) public static WebElement selectWhereWeAre;

    public static WebElement getSelectWhereWe() { return selectWhereWeAre; }

    public static void selectWhereWe() { getSelectWhereWe().click(); }
    //Click on Customer
    @FindBy(how = How.XPATH,using = webElementClickCustomer) public static WebElement selectCustomer;

    public static WebElement getSelectCustomer() { return selectCustomer; }

    public static void setSelectCustomer() { getSelectCustomer().click(); }
}
