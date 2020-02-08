package testhome;

import home.pageobject.AboutPage;
import home.pageobject.GoMapfreForwardpage;
import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    static HomePage homepage;
    @Test()
    public void validateLogo() throws InterruptedException {
        PageFactory.initElements(driver, TestHomePage.class);
        boolean logoDisplayed = homepage.titleLogo.isDisplayed();
        Assert.assertEquals(logoDisplayed, true);
        System.out.println("Text is valid. Hurray........");
    }



    @Test()
    public void InsuranceOptionCheck () throws InterruptedException {
        PageFactory.initElements(driver,TestHomePage.class);
        boolean isInsuranceOptionClicked = homepage.insuranceOption.isDisplayed();
        Assert.assertEquals(isInsuranceOptionClicked, true);
        System.out.println("insurance option worked...........");

    }



}






