package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountMainMenu extends BasePage {

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id =  "Expenses")
    private WebElement expensesButton;

    @FindBy(id = "Report")
    private WebElement reportButton;


    public boolean mainMenuisLoaded(){
        return Events.isVisibleWebElement(incomeButton) && Events.isVisibleWebElement(expensesButton)
                && Events.isVisibleWebElement(reportButton);
    }

    public ReportsPage clickReportButton(){
        Events.click(reportButton);
        return new ReportsPage();
    }


}
