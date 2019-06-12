package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class MainMenu extends BasePage {
    @FindBy(id = "settings")
    private WebElement accountSettingsButton;

    public AccountSettingsPage clickAccountSettingsButton() {
        Events.click(accountSettingsButton);
        return new AccountSettingsPage();
    }
}
