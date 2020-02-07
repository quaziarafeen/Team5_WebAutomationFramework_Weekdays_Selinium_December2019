package home.pageobject;

import common.WebAPI;
import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;

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

    //public static  void validateLogo(){
      //  driver.get("https://www.mapfreinsurance.com");
    @FindBy(xpath = WebElementHomePage.webElementInsuranceLogo)
   public static  WebElement titleLogo;

//public void validateLogo(String logo){
//  titleLogo.click();
//
//}



       //able to click on customer access
        @FindBy(xpath = WebElementHomePage.customeraccess)
        public static WebElement customeraccess;

       //new tab opens up
       //shows select your state box with dropdown button.
        @FindBy(xpath=WebElementHomePage.selectyourstate)
        public static WebElement selectyourstate;


       //Below select your state shows Login or Register button.
        @FindBy(xpath = WebElementHomePage.loginorregister)
        public static WebElement loginorregister;



        //able to click on agents portal
        @FindBy(xpath = WebElementHomePage.agentsportal)
        public static WebElement agentsportal;

}





