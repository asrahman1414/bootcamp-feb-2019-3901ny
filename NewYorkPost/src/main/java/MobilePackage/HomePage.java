package MobilePackage;

import fameWork.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//android.widget.TextView[@='TAP TO CONTINUE'")
    WebElement TapCountnue;

    public void setTapCountnue(){
        TapCountnue.click();
    }
}
