package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class GeneralReports extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Reports for: General')]")
    private WebElement title;

    public GeneralReports() {
        super();
    }

    public boolean titleIsVisible() {
        return Events.isVisibleWebElement(title);
    }

}
