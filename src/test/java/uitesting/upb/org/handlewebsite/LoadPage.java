package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class LoadPage {
    public static AccountHomeMenu loadHomeMenu() {
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountHomeMenu();
    }

    public static void main(String[] args) {
        loadHomeMenu().writeAccountName("Testing").clickAddButton();
    }
}
