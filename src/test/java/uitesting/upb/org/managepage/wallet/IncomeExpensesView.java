package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class IncomeExpensesView extends BasePage {

    @FindBy(id = "name")
    private WebElement fieldName;

    @FindBy(id = "category")
    private WebElement categorySelectField;

    @FindBy(xpath = "//select[@id='category']//option[contains(text(),'Others')]")
    private WebElement othersCategoryOption;

    @FindBy(xpath = "//select[@id='old-name']//option[contains(text(),'Salario Junio')]")
    private WebElement registeredExpenseOption;

    @FindBy(id = "amount")
    private WebElement fieldAmount;

    @FindBy(id = "new-amount")
    private WebElement fieldModifiedAmount;

    @FindBy(id = "dateSpace")
    private WebElement fieldDate;

    @FindBy(id = "buttonTransaction")
    private WebElement transactionButton;

    @FindBy(id = "account-main-menu")
    private WebElement accountmainmenu;

    public IncomeExpensesView() {
        super();
    }

    public void fillFieldName(String name) {
        Events.fillField(fieldName, name);
    }

    public void selectOthersCategory() {
        Events.click(othersCategoryOption);
    }

    public void selectCreatedExpense() {
        Events.click(registeredExpenseOption);
    }

    public void fillAmountInput(String amount) {
        Events.fillField(fieldAmount, amount);
    }

    public void fillNewAmountInput(String amount) {
        Events.fillField(fieldModifiedAmount, amount);
    }

    public void fillDateInput(String date) {
        Events.fillField(fieldDate, date);
    }

    public void clickTransactionButton() {
        Events.click(transactionButton);
    }

    public boolean transactionErrorIsVisible() {
        WebElement transactionError =  webDriver.findElement(By.id("transactionFail"));

        return Events.isVisibleWebElement(transactionError);
    }

    public boolean amountInputIsEmpty() {
        return fieldAmount.getAttribute("value").isEmpty();
    }

    public boolean newAmountIsZero() {
        return fieldModifiedAmount.getAttribute("value").equals("0");
    }

    public void clickMainMenu() {
        Events.click(accountmainmenu);
    }

}
