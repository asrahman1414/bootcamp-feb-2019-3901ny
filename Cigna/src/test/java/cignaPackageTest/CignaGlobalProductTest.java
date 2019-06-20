package cignaPackageTest;

import cignapackage.CignaGlobalProductPage;
import fameWork.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CignaGlobalProductTest extends CommonAPI {

    CignaGlobalProductPage Object;
    public void init(){Object= PageFactory.initElements(driver, CignaGlobalProductPage.class);
    }
    @Test(priority = 10)
    public void setinternationalahealthplan(){
        Object.setInternationHealthInsurance();
    }
    @Test(priority = 11)
    public void setIndividualinterPlan(){
        Object.setIndividuaINTERlPlan();
    }
    @Test(priority = 12)
    public void setEmployerINterPlan(){
        Object.setEmployerinterinsurance();
    }
    @Test(priority = 13)
    public void setProfessionalhealthcare(){
        Object.setProfessionalHealhcare();
    }
}
