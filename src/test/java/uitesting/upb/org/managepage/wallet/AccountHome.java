package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountHome extends BasePage {

    @FindBy(id = "Income")
    private WebElement incomeButton;

    public boolean isIncomeButtonVisible() {
        return Events.isVisibleWebElement(incomeButton);
    }

    public Income clickIncomeButton() {
        Events.click(incomeButton);
        return new Income();
    }
}
