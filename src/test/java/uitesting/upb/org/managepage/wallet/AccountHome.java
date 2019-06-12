package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountHome extends BasePage {

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id = "Expenses")
    private WebElement expenseButton;

    @FindBy(id = "account-main-menu")
    private WebElement personalWalletButton;

    @FindBy(xpath = "//a[contains(text(),'Account settings')]")
    private WebElement accountSettingsButton;

    public boolean expensesButtonIsVisible(){
        return Events.isVisibleWebElement(expenseButton);
    }

    public boolean isPersonalWalletButtonVisible() {
        return Events.isVisibleWebElement(personalWalletButton);
    }

    public AccountInfo clickAccountSettingsButton() {
        Events.click(accountSettingsButton);
        return new AccountInfo();
    }

    public boolean isAccountSettingsButtonIsVisible() {
        return Events.isVisibleWebElement(accountSettingsButton);
    }
}
