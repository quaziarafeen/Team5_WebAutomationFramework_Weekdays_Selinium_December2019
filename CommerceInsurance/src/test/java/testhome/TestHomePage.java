package testhome;

import common.WebAPI;
import home.pageobject.AboutPage;
import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
     static HomePage homepage;
     static AboutPage aboutpage;


     //PageFactory
//    public void getInItElements(){
//        homepage= PageFactory.initElements(driver, HomePage.class);
//        aboutpage= PageFactory.initElements(driver, AboutPage.class);
//    }
    public void getInPicture(){
        homepage= PageFactory.initElements(driver, HomePage.class);
        aboutpage= PageFactory.initElements(driver, AboutPage.class);


    }


    @Test(priority = 1)
    public void testClickPicture() throws InterruptedException {
        maximize();
        sleepFor(2);
        scrollDown(0,4800);
       sleepFor(5);
       getInPicture();
        homepage.getPicture().click();
    }

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


}
