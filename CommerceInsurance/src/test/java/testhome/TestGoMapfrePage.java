package testhome;

import common.WebAPI;
import home.pageobject.GoMapfreForwardpage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class TestGoMapfrePage extends GoMapfreForwardpage {


    @Test()
    public void testGetPicture () throws InterruptedException {
        PageFactory.initElements(driver,GoMapfreForwardpage.class);
        maximize();
        sleepFor(2);
        scrollUpDown(2800);
        sleepFor(2);
        TestGoMapfrePage.getPicture().getScreenshotAs(OutputType.FILE);
        sleepFor(2);
        scrollUpDown(-2800);
        afterEachTestMethod(null);
    }
}
