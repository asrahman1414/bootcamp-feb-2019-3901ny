package cignaPackageTest;

import cignapackage.CignaHealthCovPage;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CingnaHealthPageTest extends CommonAPI {
      CignaHealthCovPage cignaObject;
    @BeforeMethod
    public void init(){ cignaObject = PageFactory.initElements(driver, CignaHealthCovPage.class);}

    @Test(priority = 5)
    public void setindivfamilyHI(){
        cignaObject.setIndivFamilyHealthInsurance();
    }
    @Test(priority = 6)
    public void setdentalinsuarnce(){
        cignaObject.setDentalInsurance();
    }
    @Test(priority = 7)
    public void setmedicalplan(){
        cignaObject.setMedicarePlan();
    }
    @Test(priority = 8)
    public void setmedicaresuplemplan(){
        cignaObject.setMedicareSuplemPlan();
    }
    @Test(priority = 9)
    public void setinternationalahealthplan() {
        cignaObject.setInternationHealthInsurance();
    }

}
