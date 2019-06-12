package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountCreator extends BasePage {
    @FindBy(id = "accountNameInput")
    private WebElement accountNameTextField;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    public AccountCreator fillAccountNameTextField(String nameAccount){
        Events.fillField(accountNameTextField, nameAccount);
        return this;
    }

    public void clickAddButton(){
        Events.click(addAccountButton);
    }

    public AccountCreator enterNameAndClickAddButton(String nameAccount){
        fillAccountNameTextField(nameAccount).clickAddButton();
        return this;
    }

    public AccountHome clickAccountButton(String nameAccount){
        Events.click(By.id(nameAccount));

        return new AccountHome();
    }

    public boolean isAccountNameFieldAndButtonVisible() {
        return Events.isVisibleWebElement(accountNameTextField) && Events.isVisibleWebElement(addAccountButton);
    }

    public boolean isAccountNameButtonVisible(String accountName) {
        return Events.isVisibleWebElement(webDriver.findElement(By.id(accountName)));
    }
}
