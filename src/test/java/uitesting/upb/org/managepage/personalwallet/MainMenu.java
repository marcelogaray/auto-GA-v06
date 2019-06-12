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
    @FindBy(id = "Income")
    private WebElement incomeButton;

    public ReportsPage clickReportsButton() {
        Events.click(reportsButton);
        return new ReportsPage();
    }

    public ExpensesPage clickExpensesButton() {
        Events.click(expensesButton);
        return new ExpensesPage();
    }

    public IncomePage clickIncomeButton(){
        Events.click(incomeButton);
        return new IncomePage();

    }
}
