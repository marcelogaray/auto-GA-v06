package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;


public class TransferPage extends BasePage {
    @FindBy(id = "amount")
    protected WebElement amountTransferTextField;
    @FindBy(id = "btn-transfer")
    protected WebElement transferButton;
    @FindBy(id = "msg-error")
    protected WebElement transferErrorMessage;
    @FindBy(id = "destinationAccount")
    protected WebElement destinationAccountSelector;
    @FindBy(id = "msg-successful")
    protected WebElement transferSuccessMessage;

    public  TransferPage fillAmountTransferTextField(String amount) {
        Events.fillField(amountTransferTextField, amount);
        return this;
    }

    public TransferPage clickTransferButton(){
        Events.click(transferButton);
        return this;
    }

    public TransferPage selectAccountDestination(String selectorAccountName){
        Events.fillField(destinationAccountSelector, selectorAccountName );
        return this;
    }
    public boolean isTransferErrorMessageVisible() {
        return Events.isWebElementVisible(transferErrorMessage);
    }

    public boolean isTransferSuccessMessageVisible() {
        return  Events.isWebElementVisible(transferSuccessMessage);
    }

}
