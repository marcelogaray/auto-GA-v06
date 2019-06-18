package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ReportTable extends BasePage {

    @FindBy(xpath = "//*[@id=\"reportTable\"]/div/table/tbody/tr[1]/button")
    private WebElement buttonEliminarIncome0;

    @FindBy(xpath = "//*[@id=\"reportTable\"]/div/table/tbody/tr[2]/button")
    private  WebElement buttonEliminarExpense0;


    public void clickDeleteIncomeMateo(){
        Events.click(buttonEliminarIncome0);
    }

    public void clickDeleteExpenseCelular(){
        Events.click(buttonEliminarExpense0);
    }

}
