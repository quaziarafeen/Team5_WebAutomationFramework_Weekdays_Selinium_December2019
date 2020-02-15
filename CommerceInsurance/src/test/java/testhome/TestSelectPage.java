package testhome;

import home.pageobject.ManagePolicyPage;
import home.pageobject.SelectPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSelectPage extends SelectPage {
    @Test
    public void clickOnManagePolicy() throws InterruptedException { PageFactory.initElements(driver, SelectPage.class);sleepFor(2);mouseHoverCustomerServices();
        sleepFor(2);selectManage();sleepFor(2); }

    @Test
    public void clickONSelectState() throws InterruptedException { clickOnManagePolicy(); }
    @Test
    public void clickOnGo() throws InterruptedException { PageFactory.initElements(driver, SelectPage.class);sleepFor(2);scrollUpDown(4800);selectOnGo(); }
    @Test
    public void mouseHoverInsurancePolicy() throws InterruptedException { PageFactory.initElements(driver, SelectPage.class);sleepFor(2);mouseHoverInsurance(); }
    @Test
    public void getTextInsurance() throws InterruptedException { mouseHoverInsurancePolicy();getListOfWebElementsByXpath(webElementGetInsurance); assertCheck("Products","Products");}
    @Test
    public void mouseHoverClaims() throws InterruptedException { PageFactory.initElements(driver, SelectPage.class);sleepFor(2);mouseHoverClaim();}
    @Test
    public void getTextClaims() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Claims Information","Claims Information");}
    @Test
    public void getTextClaims1() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Auto Claims","Auto Claims");}
    @Test
    public void getTextClaims2() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Property Claims","Property Claims");}
    @Test
    public void getTextClaims3() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Travel Claims","Travel Claims");}
    @Test
    public void getTextClaims4() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Catastrophe Assistance","Catastrophe Assistance");}
    @Test
    public void getTextClaims5() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Claims","Claims");}
    @Test
    public void getTextClaims6() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Report a Claim","Report a Claim");}
    @Test
    public void getTextClaims7() throws InterruptedException { mouseHoverClaims();getListOfWebElementsByXpath(webElementGetClaim); assertCheck("Send Claim Documents","Send Claim Documents");}

}
