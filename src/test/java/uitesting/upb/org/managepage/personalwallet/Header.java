package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Header extends BasePage {
    @FindBy (id="account-main-menu")
    WebElement personalWalletButton;

    @FindBy (id = "exit")
    private WebElement exitButton;

    @FindBy (id = "settings")
    private WebElement settingsButton;

    public Header clickPersonalWalletButton() {
        Events.click(personalWalletButton);
        return this;
    }
    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }
    public AccountSettingsPage clickSettingsButton() {
        Events.click(settingsButton);
        return new AccountSettingsPage();
    }
}
