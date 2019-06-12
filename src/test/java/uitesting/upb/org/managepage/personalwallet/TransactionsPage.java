package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

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

    public boolean isTransactionFailAlertVisible() {
        return Events.isWebElementVisible(transactionFailAlert);
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

}
