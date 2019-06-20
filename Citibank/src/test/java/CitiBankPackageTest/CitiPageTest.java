package CitiBankPackageTest;

import citiPackage.CitiPage;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CitiPageTest extends CommonAPI {

    CitiPage homepage;

    @BeforeMethod
    public void initialization() {
        homepage = PageFactory.initElements(driver, CitiPage.class);
    }

    @Test(enabled = false)
    public void testSignIn(){
        homepage.signIn();
        sleepFor(3);
    }

    @Test(enabled = false)
    public void testbanking(){
        homepage.banking();
    }

    @Test(enabled = true)
    public void testSearch(){
        homepage.search();
    }

}
