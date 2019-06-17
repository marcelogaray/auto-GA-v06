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

    public AccountMainMenu() {
        super();
    }

    public boolean incomeButtonIsVisible() {
        return Events.isVisibleWebElement(incomeButton);
    }

    public IncomeExpensesView clickIncomeButton() {
        Events.click(incomeButton);

        return new IncomeExpensesView();
    }

    public IncomeExpensesView clickExpensesButton() {
        Events.click(expensesButton);

        return new IncomeExpensesView();
    }
}
