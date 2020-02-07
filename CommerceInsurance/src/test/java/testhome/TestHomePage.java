package testhome;

import common.WebAPI;
import home.pageobject.AboutPage;
import home.pageobject.HomePage;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.IResultMap;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
     static HomePage homepage;
     static AboutPage aboutpage;


     //PageFactory
    public void getInItElements(){
        homepage= PageFactory.initElements(driver, HomePage.class);
        aboutpage= PageFactory.initElements(driver, AboutPage.class);


    }
/*
    @Test(priority = 1)
    public void testGoForward() throws InterruptedException {
        getInItElements();
        maximize();
        sleepFor(2);
        scrollUpDown(4800);
        sleepFor(2);
        homepage.getGoForward().click();
        sleepFor(2);
        navigateBack();
        sleepFor(2);
        scrollUpDown(-4800);

    }

 */
   @Test()
        public void validateLogo() throws InterruptedException{
       getInItElements();
        boolean logoDisplayed   = homepage.titleLogo.isDisplayed();
       Assert.assertEquals(logoDisplayed,true);
       System.out.println("Text is valid. Hurray........");
        }


    }

//    @Test(priority = 1)
//    public void testDoSearch(){
//        getInItElements();
//        homepage.doSearch("mobile");
//    }
//
//    @Test(priority = 2)
//    public void testDoSearchForTshirt(){
//        getInItElements();
//        homepage.doSearch("t-shirt");
//    }
//
//    @Test(enabled = false)
//    public void testDoSearchForJewelery(){
//        getInItElements();
//        homepage.doSearch("Jewelery");
//    }
//
//    @Test(dataProvider = "Belt")
//    public void testDoSearchForBelt(){
//        getInItElements();
//        homepage.doSearch("Belt");
//    }




