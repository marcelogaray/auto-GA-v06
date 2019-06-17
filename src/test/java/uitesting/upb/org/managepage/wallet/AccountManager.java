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

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id = "Expenses")
    private WebElement expenseButton;

    @FindBy(id = "name")
    private WebElement fieldName;

    @FindBy(xpath = "//select[@id='category']//option[contains(text(),'Salary')]")
    private WebElement optionIncome;

    @FindBy(xpath = "//select[@id='category']//option[contains(text(),'Expenses')]")
    private WebElement optionExpense;

    @FindBy(id = "amount")
    private WebElement fieldAmount;

    @FindBy(id = "dateSpace")
    private WebElement fieldDate;

    @FindBy(id = "buttonTransaction")
    private WebElement transactionButton;

    @FindBy(id = "exit")
    private WebElement exitButton;

    @FindBy(id = "Transfer")
    private WebElement transferButton;

    @FindBy(xpath = "//select[@id='destinationAccount']//option[contains(text(),'Second Account')]")
    private WebElement optionAccountDestination;

    @FindBy(id = "amount")
    private WebElement fieldAmountTransfer;

    @FindBy(id = "btn-transfer")
    private WebElement transferTransactionButton;

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

    public GeneralReports clickGeneralAccountButton() {
        Events.click(generalAccountButton);

        return new GeneralReports();
    }

    public AccountMainMenu selectAccount(String accountName) {
        WebElement newAccountButton = webDriver.findElement(By.id(accountName));
        Events.click(newAccountButton);

        return new AccountMainMenu();
    }

    public boolean newAccountButtonIsVisible(String accountName) {
        WebElement newAccountButton = webDriver.findElement(By.id(accountName));
        return Events.isVisibleWebElement(newAccountButton);
    }

    public boolean accountNameInputIsVisible() {
        return Events.isVisibleWebElement(accountNameInput);
    }

    public boolean addAccountButtonIsVisible() {
        return Events.isVisibleWebElement(addAccountButton);
    }

    public void clickIncomeButton() {
        Events.click(incomeButton);
    }

    public void fillName(String nameTransfer) {
        Events.fillField(fieldName, nameTransfer);
    }

    public void selectSalaryIncome() {
        Events.click(optionIncome);
    }

    public void fillAmount(String bs) {
        Events.fillField(fieldAmount, bs);
    }

    public void fillDate(String date) {
        Events.fillField(fieldDate, date);
    }

    public void registerTransaction() {
        Events.click(transactionButton);
    }

    public void clickExitButton() {
        Events.click(exitButton);
    }

    public void clickTransferButton() {
        Events.click(transferButton);
    }

    public void selectAccountDestination() {
        Events.click(optionAccountDestination);
    }

    public void fillAmountTransfer(String amount) {
        Events.fillField(fieldAmountTransfer, amount);
    }

    public void clearFieldAmount() {
        Events.clearFieldText(fieldAmountTransfer);
    }

    public void clickTransferTransactionButton() {
        Events.click(transferTransactionButton);
    }

}
