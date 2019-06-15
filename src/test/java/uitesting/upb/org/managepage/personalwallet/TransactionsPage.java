package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class TransactionsPage extends BasePage {
    @FindBy(id = "categoryRegister")
    protected WebElement categoryRegisterField;

    @FindBy(id = "buttonCategory")
    protected WebElement catergoryButton;

    @FindBy(id = "categorySuccess")
    protected WebElement categorySuccessAlert;

    @FindBy(id = "category")
    protected WebElement categorySelector;

    @FindBy(id = "name")
    protected WebElement transactionNameField;

    @FindBy(id = "amount")
    protected WebElement amountField;

    @FindBy(id = "dateSpace")
    protected WebElement dateField;

    @FindBy(id = "buttonTransaction")
    protected WebElement transactionButton;

    @FindBy(id = "transactionFail")
    protected WebElement transactionFailAlert;

    @FindBy(id = "categoryFail")
    protected WebElement categoryFailAlert;

    @FindBy(id = "exit")
    private WebElement exitButton;
    @FindBy(id = "transactionSuccess")
    protected WebElement transactionSuccessAlert;

    public boolean isTransactionFailAlertVisible() {
        return Events.isWebElementVisible(transactionFailAlert);
    }

    public boolean isCategoryFailAlertVisible() {
        return Events.isWebElementVisible(categoryFailAlert);
    }

    public int getCategorySelectorNumberOptions () {
     return Events.getSelectorNumberOptions(new Select(categorySelector));
    }

    public boolean isTransactionSuccessAlertVisible() {
        return Events.isWebElementVisible(transactionSuccessAlert);
    }

    public TransactionsPage fillAmountField(String amount) {
       Events.fillField(amountField,amount);
        return this;
    }

    public TransactionsPage clickRegisterTransactionButton() {
        Events.click(transactionButton);
        return this;
    }

    public TransactionsPage fillDateField(String date) {
        Events.fillField(dateField, date);
        return this;
    }

    public TransactionsPage fillCategoryRegisterField(String name) {
        Events.fillField(categoryRegisterField, name);
        return this;
    }

    public TransactionsPage fillTransactionNameField(String name) {
        Events.fillField(transactionNameField, name);
        return this;
    }

    public TransactionsPage clickRegisterCategoryButton() {
        Events.click(catergoryButton);
        return this;
    }

    public boolean isCategorySuccessAlertVisible() {
        return Events.isWebElementVisible(categorySuccessAlert);
    }

    public boolean searchCategoryOnSelector(String category) {
        return Events.isElementOnSelector(categorySelector, category);
    }

    public TransactionsPage selectCategory(String category) {
        Events.fillField(categorySelector, category);
        return this;
    }

    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }

}
