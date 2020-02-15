package home.webelement;

import common.WebAPI;

public class WebElementSelect extends WebAPI {
    //Click Customer Access
    public static final  String webElementClickCustomerAccess = "//ul[@class='header-links']//a[contains(text(),'Customer Access')]";
    //Click Customer Services
    public static final  String webElementClickCustomerServices = "//*[@id=\"nav02\"]/li[3]/div[1]/a/b";
    //Manage Policy
    public static final  String webElementManagePolicy = "//li//a[text()='Manage your policy']";
    //Customer Access
    public static final  String webElementClickCustomer = "//a[@class='button'][contains(text(),'Customer Access')]";
    //Select State
    public static final String webElementSelectState="//select[@id='state']";
    //Go Mphre
    public static final String webElementGoMaphre="//a[contains(text(),'Go Forward, Go Mobile, Go MAPFRE')]";
    //Click insurance button
    public static final String webElementClickInsurance = "//b[contains(text(),'Insurance')]";
    //Click Element Insurance
    public static final String webElementGetInsurance = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[1]/div[2]/div[1]";
    //MouseHover Claims
    public static final  String webElementClickClaim = "//b[contains(text(),'Claims')]";
    //GetText Claims
    public static final  String webElementGetClaim = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[2]/div[1]";
    //GetText Customer
    public static final  String webElementGetTextCustomer = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[2]/div[1]";
}
