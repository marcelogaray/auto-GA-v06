package uitesting.upb.org.managepage.wallet;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ReportsPage extends BasePage {

    @FindBy(id = "reportType")
    private WebElement typeSelector;

    @FindBy(xpath = "//*[@value=\"category\"]")
    private  WebElement categorySelector;

    @FindBy(id = "showReport")
    private WebElement showReportButton;

    public void clickTypeSelector(){
        Events.click(typeSelector);
    }

    public void clickCategoryType(){
        Events.click(categorySelector);
    }

    public ReportTable clickShowReportButton(){
        Events.click(showReportButton);
        return new ReportTable();
    }

}
