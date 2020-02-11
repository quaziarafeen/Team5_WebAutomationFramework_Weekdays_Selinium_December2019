package testhome;

import common.WebAPI;
import home.pageobject.GoMapfreForwardpage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;


public class TestGoMapfrePage extends GoMapfreForwardpage {


    //@Test()
    public void testGetPicture () throws InterruptedException {
        driver.get("https://www.mapfreinsurance.com");
        PageFactory.initElements(driver,GoMapfreForwardpage.class);
        maximize();
        sleepFor(2);
        scrollUpDown(2800);
        sleepFor(2);
        getPicture().getScreenshotAs(OutputType.FILE);
//        sleepFor(2);
//        scrollUpDown(-2800);
    }

    @Test()
    public void testGoForoward () throws InterruptedException {
        driver.get("https://www.mapfreinsurance.com");
        PageFactory.initElements(driver,GoMapfreForwardpage.class);
        maximize();
        sleepFor(2);
        scrollUpDown(2800);
        sleepFor(2);
        getGoForward().click();
        System.out.println("*********************");
        getListOfWebElementsByXpath("//div[@class='col-sm-4 col-md-3 hidden-xs']");

        }


//        sleepFor(2);
//        scrollUpDown(-2800);
    }

