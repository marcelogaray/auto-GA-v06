package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.wallet.AccountCreator;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {

    public static AccountCreator loadAccountCreator(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountCreator();
    }

    public static void maximizeWindow() {
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
    }

    public static void closeWindow(){
        DriverManager.getInstance().getWebDriver().quit();
    }
}
