package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccessor;
import uitesting.upb.org.managepage.wallet.AccountCreator;
import uitesting.upb.org.managepage.wallet.AccountManager;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class LoadPage {

    public static AccountManager loadAccountManager() {
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseURL());
        return new AccountManager();
    }

    public static AccountCreator loadAccountCreator() {
        return new AccountCreator();
    }

}
