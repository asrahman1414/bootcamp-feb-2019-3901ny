package cignaPackageTest;

import cignapackage.CignaNavigationTabPage;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaNaVigationTabPageTest extends CommonAPI {

     CignaNavigationTabPage cignaNavicationObej;

    @BeforeMethod
    public void init() {
        cignaNavicationObej = PageFactory.initElements(driver, CignaNavigationTabPage.class);
    }





    @Test(priority = 2)
    public void setIndivFamily () {
        cignaNavicationObej.setIndivFamily();
    }
    @Test(priority = 3)
    public void setempBroker(){
        cignaNavicationObej.setEmpBroker();
    }
    @Test(priority = 4)
    public void sethealthprovider(){
        cignaNavicationObej.setHealthprovider();
    }
    @Test(priority = 5)
    public void setmedicaltool(){
        cignaNavicationObej.setSearchmedicaltool();
    }
}
