package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebAPI {

    // All the Home Page Action Methods comes on this class

//    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchBox)
//    public static WebElement searchBox;
//
//
//
//    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchButton)
//    public static WebElement searchButton;





//    public static WebElement getSearchButton(){
//        return searchButton;
//    }
    @FindBy(xpath = WebElementHomePage.webElementGoForward)
    public static WebElement goForward;


//    public static WebElement getSearchBox(){
//        return searchBox;
//    }
//
//    public static WebElement getSearchButton(){
//        return searchButton;
//    }
    public static  WebElement getGoForward(){
      return  goForward;
    }


//    public static void doSearch(String value){
//        getSearchBox().sendKeys(value);
//    }




}
