package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ReportTable extends BasePage {

    @FindBy(xpath = "//*[@id=\"reportTable\"]/div/table/tbody/tr[1]/button")
    private WebElement buttonEliminarIncomeMateo;

    @FindBy(xpath = "//*[@id=\"reportTable\"]/div/table/tbody/tr[3]/button")
    private  WebElement buttonEliminarExpenseCelular;


    public void clickDeleteIncomeMateo(){
        Events.click(buttonEliminarIncomeMateo);
    }

    public void clickDeleteExpenseCelular(){
        Events.click(buttonEliminarExpenseCelular);
    }

}
