package uitesting.upb.org.managepage.personalWallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountHomeMenu extends BasePage {
    @FindBy(id = "accountNameInput")
    private WebElement accountNameInput;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    public AccountHomeMenu writeAccountName(String name) {
        Events.fillField(accountNameInput, name);
        return this;
    }

    public AccountHomeMenu clickAddButton() {
        Events.click(addAccountButton);
        return this;
    }

    public MainMenu clickButtonById(String id) {
        Events.click(new By.ById(id));
        return new MainMenu();
    }
}
