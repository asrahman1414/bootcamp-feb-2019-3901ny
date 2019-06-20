package MobilePackageTest;

import MobilePackage.HomePage;
import fameWork.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MobileAPI {
    HomePage homePage;


    //@BeforeMethod
    public void initi(){
        homePage= PageFactory.initElements(appiumDriver,HomePage.class);
    }
    @Test
    public  void setTapCountnueTest(){
        homePage.setTapCountnue();
    }
}
