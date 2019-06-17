package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Header extends BasePage {
    @FindBy (id="account-main-menu")
    WebElement personalWalletButton;

    public Header clickPersonalWalletButton() {
        Events.click(personalWalletButton);
        return this;
    }

}
