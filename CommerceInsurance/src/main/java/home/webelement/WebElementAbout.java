package home.webelement;

import common.WebAPI;

public class WebElementAbout extends WebAPI {

    //Mapfre Header WebElements
    public static final String webElementHeader1 = "body.js-ready.js-load:nth-child(2) div:nth-child(4) header:nth-child(2) div.model-b > div.layer01:nth-child(1)";
    public static final String webElementHeader2 = "body.js-ready.js-load:nth-child(2) div:nth-child(4) header:nth-child(2) div.model-b > div.layer02:nth-child(2)";

    //SearchBox
    public static final String webElementsearchBox = "//input[@name='q']";
    //Assert Validation
    public static final String webElementhelpUsSpread = "#carousel-slideset > a:nth-child(1) > div > div > div.content-block > div > div > div > h2";
    //Click Mphree
    public static final  String webElementClickMphree = "//div[@class='logo']//a[contains(text(),'MAPFRE')]";
    //Click insurance button
    public static final  String webElementClickInsurance = "//b[contains(text(),'Insurance')]";
    //Click Claims
    public static final  String webElementClickClaim = "//b[contains(text(),'Claims')]";
    //Click Customer Services
    public static final  String webElementClickCustomerServices = "//*[@id=\"nav02\"]/li[3]/div[1]/a/b";
    //Click About Us
    public static final  String webElementClickAbouUs = "//b[contains(text(),'About')]";
    //Click Contact
    public static final  String webElementClickContact = "//b[contains(text(),'Con')]";
    //Click Customer Access
    public static final  String webElementClickCustomerAccess = "//ul[@class='header-links']//a[contains(text(),'Customer Access')]";
    //Click Agent
    public static final  String webElementClickAgent = "//ul[@class='header-links']//a[contains(text(),'Agents Portal')]";
    //Click Mapfree Corporete
    public static final  String webElementClickMphreeCorporate = "//a[contains(text(),'MAPFRE Corporate')]";
    //Click Carrers
    public static final  String webElementClickCareer = "//div[@class='box']//a[contains(text(),'Careers')]";
    //Click Language
    public static final  String webElementClickLanguage = "//a[@id='language-selector']";
    //Select Language Spanish
    public static final  String webElementSelectLanguage = "//a[contains(text(),'Spanish')]";
    //Select Language English
    public static final  String webElementSelectEnglish = "//a[contains(text(),'Inglés')]";
    //GetQuote Element
    public static final  String webElementTextQuote = "//div[@class='quick-quote-links plus same-height-left']";
    //GtQuote Auto
    public static final  String webElementAutoQoute = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/em[1]";
    //GetQuote Property
    public static final  String webElementPropertyQuote = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/em[1]";
    //Make Payment
    public static final  String webElementClickMakePayment = "//em[text()='Make a Payment']";
    //Report Claim
    public static final  String webElementClickReportClaim = "//em[text()='Report a Claim']";
    //Find Agent
    public static final  String webElementClickFindAgent = "//em[text()='Find an agent']";
    //Where We Are
    public static final  String webElementClickWhere = "//em[text()='Where we are']";
    //Customer Access
    public static final  String webElementClickCustomer = "//a[@class='button'][contains(text(),'Customer Access')]";
//    public static final  String webElementClickMphree = "//div[@class='logo']//a[contains(text(),'MAPFRE')]";
    //Iframe Handaling
    public static final String webElementIfrrame = "//*[@id=\"carousel-slideset\"]/div[1]/div/div[1]/img[1]";
}
