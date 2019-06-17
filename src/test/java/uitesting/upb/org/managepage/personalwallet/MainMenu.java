package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import uitesting.upb.org.managepage.personalwallet.Transactions.ExpensesPage;
import uitesting.upb.org.managepage.personalwallet.Transactions.IncomePage;

public class MainMenu extends BasePage {
    @FindBy(id = "Report")
    private WebElement reportsButton;
    @FindBy(id = "Expenses")
    private WebElement expensesButton;
    @FindBy(id = "Transfer")
    private WebElement transferButton;
    @FindBy(id = "Income")
    private WebElement incomeButton;
    @FindBy(id = "settings")
    private WebElement accountSettingsButton;
    @FindBy(xpath = "//div[@class='card']/div[@class=\"container content\"]/div[@class=\"d-flex my-1 mt-2\"]")
    private WebElement totalAmount;

    public AccountSettingsPage clickAccountSettingsButton() {
        Events.click(accountSettingsButton);
        return new AccountSettingsPage();
    }

    public String getAmount() {
        return Events.getText(totalAmount);
    }

    public ReportsPage clickReportsButton() {
        Events.click(reportsButton);
        return new ReportsPage();
    }

    public ExpensesPage clickExpensesButton() {
        Events.click(expensesButton);
        return new ExpensesPage();
    }

    public TransferPage clickTransferButton() {
        Events.click(transferButton);
        return new TransferPage();
    }

    public IncomePage clickIncomeButton() {
        Events.click(incomeButton);
        return new IncomePage();
    }
}
