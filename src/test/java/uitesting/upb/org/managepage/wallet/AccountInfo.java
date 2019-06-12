package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountInfo extends BasePage {
    @FindBy(xpath = "//h1")
    private WebElement accountInfoLabel;

    @FindBy(xpath = "//input")
    private WebElement accountNameTextField;

    @FindBy(id = "changeNameButton")
    private WebElement changeNameButton;

    @FindBy(id = "exit")
    private WebElement exitButton;

    @FindBy(id = "deleteAccountButton")
    private WebElement deleteAccountButton;

    public boolean isAccountInfoLabelVisible() {
        return Events.isVisibleWebElement(accountInfoLabel);
    }

    public void fillOnTheAccountNameTextField(String newNameAccount) {
        Events.fillField(accountNameTextField, newNameAccount);
    }

    public void clearAccountNameTextField(){
        Events.clearField(accountNameTextField);
    }

    public void clickChangeNameButton() {
        Events.click(changeNameButton);
    }

    public AccountCreator clickExitButton() {
        Events.click(exitButton);
        return new AccountCreator();
    }

    public boolean isDeleteAccountButtonVisible() {
        return Events.isVisibleWebElement(deleteAccountButton);
    }

    public AccountCreator clickDeleteAccountButton() {
        Events.click(deleteAccountButton);
        return new AccountCreator();
    }
}
