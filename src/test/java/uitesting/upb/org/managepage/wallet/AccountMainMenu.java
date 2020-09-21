package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountMainMenu extends BasePage {

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id = "Expenses")
    private WebElement expensesButton;

    @FindBy(id = "Transfer")
    private WebElement transferButton;

    @FindBy(id = "Report")
    private WebElement reportButton;

    public AccountMainMenu() {
        super();
    }

    public boolean incomeButtonIsVisible() {
        return Events.isVisibleWebElement(incomeButton);
    }

    public boolean expensesButtonIsVisible() {
        return Events.isVisibleWebElement(expensesButton);
    }

    public boolean transferButtonIsVisible() {
        return Events.isVisibleWebElement(transferButton);
    }

    public boolean reportButtonIsVisible() {
        return Events.isVisibleWebElement(reportButton);
    }

    public IncomeExpensesView clickIncomeButton() {
        Events.click(incomeButton);

        return new IncomeExpensesView();
    }

    public IncomeExpensesView clickExpensesButton() {
        Events.click(expensesButton);

        return new IncomeExpensesView();
    }

    public boolean mainMenuisLoaded(){
        return Events.isVisibleWebElement(incomeButton) && Events.isVisibleWebElement(expensesButton)
                && Events.isVisibleWebElement(reportButton);
    }

    public ReportsPage clickReportButton(){
        Events.click(reportButton);
        return new ReportsPage();
    }

}
