package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class NavBar extends BasePage {

    @FindBy(id = "settings")
    private WebElement accountSettingsButton;


    public AccountSettings clickAccountSettings() {

        Events.click(accountSettingsButton);
        return new AccountSettings();
    }

    public boolean navBarIsVisible() {
        return Events.isVisibleWebElement(accountSettingsButton);
    }
}
