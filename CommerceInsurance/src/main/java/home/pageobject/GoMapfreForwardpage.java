package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementGoMapfrePage;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoMapfreForwardpage extends WebAPI {
    @FindBy(xpath = WebElementGoMapfrePage.webElementGoForward)
    public static WebElement goForward;
    @FindBy(xpath = WebElementGoMapfrePage.webElementPicture)
    public static WebElement getPicture;

    public static  WebElement getGoForward(){
        return  goForward;
    }
    public static  WebElement getPicture(){
        return  getPicture;
    }
}
