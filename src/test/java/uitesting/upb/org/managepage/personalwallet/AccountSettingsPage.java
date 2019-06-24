package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountSettingsPage extends BasePage {
    @FindBy(className = "form-control")
    private WebElement accountNameInput;

    @FindBy(id = "changeNameButton")
    private WebElement changeNameButton;

    @FindBy(id = "deleteAccountButton")
    private WebElement deleteAccountButton;

    @FindBy(id = "exit")
    private WebElement exitButton;

    @FindBy(xpath = "//div[@class='container']//h1")
    private WebElement accountSettingstitle;

    public AccountSettingsPage writeNewAccountName(String name) {
        Events.fillField(accountNameInput, name);
        return this;
    }

    public AccountSettingsPage clickChangeNameButton() {
        Events.click(changeNameButton);
        return this;
    }
    public AccountHomeMenu clickDeleteAccountButton() {
        Events.click(deleteAccountButton);
        return new AccountHomeMenu();
    }
    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }
    public boolean accountSettingsTitleIsVisible() {
        return Events.isWebElementVisible(accountSettingstitle);
    }
    public String getInputText() {
        return accountNameInput.getAttribute("value");
    }
    public AccountSettingsPage setNewAccountName(String name) {
        accountNameInput.clear();
        accountNameInput.sendKeys(name);
        return this;
    }
    public boolean deleteAccountButtonIsVisible() {
        return Events.isWebElementVisible(deleteAccountButton);
    }
    public boolean changeNameButtonIsVisible() {
        return Events.isWebElementVisible(changeNameButton);
    }
}
