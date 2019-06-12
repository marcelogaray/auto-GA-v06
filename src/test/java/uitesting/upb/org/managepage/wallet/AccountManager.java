package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountManager extends BasePage {

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "general")
    private WebElement generalAccountButton;

    @FindBy(id = "accountNameInput")
    private WebElement accountNameInput;

    public AccountManager() {
        super();
    }

    public void createAccount(String accountName) {
        fillAccountNameField(accountName);
        clickAddAccountButton();
    }

    public void fillAccountNameField(String accountName) {
        Events.fillField(accountNameInput, accountName);
    }

    public void clickAddAccountButton() {
        Events.click(addAccountButton);
    }

    public void clickGeneralAccountButton() {
        Events.click(generalAccountButton);
    }

    public void selectAccount(String accountName) {
        WebElement newAccountButton = webDriver.findElement(By.id(accountName));

        Events.click(newAccountButton);
    }

    public boolean checkIfNewAccountButtonIsVisible(String accountName) {
        WebElement newAccountButton = webDriver.findElement(By.id(accountName));

        return Events.isVisibleWebElement(newAccountButton);
    }

}
