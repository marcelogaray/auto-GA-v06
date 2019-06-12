package uitesting.upb.org.managepage.personalWallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class MainMenu extends BasePage {
    @FindBy(id = "Report")
    private WebElement reportsButton;

    public ReportsPage clickReportsButton() {
        Events.click(reportsButton);
        return new ReportsPage();
    }
}
