package home.pageobject;

import home.webelement.WebElementSelect;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectPage extends WebElementSelect {
    //Click on Customer
    @FindBy(how = How.XPATH,using = webElementClickCustomer) public static WebElement selectCustomer;

    public static WebElement getSelectCustomer() { return selectCustomer; }

    public static void setSelectCustomer() { getSelectCustomer().click(); }
    //Click Customer Access
    @FindBy(how = How.XPATH,using = webElementClickCustomerAccess) public static WebElement clickCustomerAccess;

    public static WebElement getClickCustomerAccess() { return clickCustomerAccess; }

    public static void ClickInCustomerAccess() { getClickCustomerAccess().click(); }
    //MouseHover Customer services
    public static void mouseHoverCustomerServices() { mouseHoverByXpath(webElementClickCustomerServices); }
    //Click on Customer
    @FindBy(how = How.XPATH,using = webElementManagePolicy) public static WebElement selectManage;

    public static WebElement getSelectManage() { return selectManage; }

    public static void selectManage() { getSelectManage().click(); }
    //Select State
    @FindBy(how = How.XPATH,using = webElementSelectState) public static WebElement selectState;

    public static WebElement getSelectState() { return selectState; }

    public static void selectOnState() { getSelectState().getScreenshotAs(OutputType.FILE); }
    //Select State
    @FindBy(how = How.XPATH,using = webElementGoMaphre) public static WebElement selectGoMaphre;

    public static WebElement getGoMaphree() { return selectGoMaphre; }

    public static void selectOnGo() { getGoMaphree().click(); }
    //Click Insurance
    @FindBy(xpath = webElementClickInsurance) public static WebElement clickInsurance;

    public static WebElement getClickInsurance() { return clickInsurance; }

    public static void mouseHoverInsurance() { mouseHoverByXpath(webElementClickInsurance); }
    //MouseHover Claim
    @FindBy(xpath = webElementClickClaim) public static WebElement clickClaim;

    public static WebElement getMouseHoverClaim() { return clickClaim; }

    public static void mouseHoverClaim() { mouseHoverByXpath(webElementClickClaim); }
}
