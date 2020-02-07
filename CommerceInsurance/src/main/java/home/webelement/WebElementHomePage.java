package home.webelement;

public class WebElementHomePage {


// All the Web Elements comes in this class from HomePage


   // public static final String webElementSearchBox="//*[@id=\"twotabsearchtextbox\"]";
    //public static final String webElementSearchButton="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public static final String webElementGoForward = "//*[@id=\"main\"]/div/div[3]/div/div[2]/article/div/h2/a";
    public static final String webElementInsuranceLogo="//div[@class='logo']//img";


    //able to click customer access.
    public static final String customeraccess= "//ul[@class='header-links']//a[contains(text(),'Customer Access')]";

    //new tab opens up.
    //shows select your state box with dropdown button.
    public static final String selectyourstate= "//select[@id='state']";

    //Below select your state shows Login or Register button.
    public static final String loginorregister= "//span[contains(text(),'LOGIN OR REGISTER')]";

    //dont see your state link on footer title.
    public static final String dontseeyourstate= "//div[@id='footer-title']";


    //able to click on agents portal.
    public static final String agentsportal = "//ul[@class='header-links']//a[contains(text(),'Agents Portal')]";











}
