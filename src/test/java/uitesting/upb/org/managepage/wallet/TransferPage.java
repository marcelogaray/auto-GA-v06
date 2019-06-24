package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.awt.*;

public class TransferPage extends BasePage {

    @FindBy(id="destinationAccount")
    private WebElement fieldDestinationTranfer;

    @FindBy (id = "amount")
    private  WebElement ingresoMountfield;

    @FindBy(id="btn-transfer")
    private WebElement buttonActionTransfer;

    @FindBy(id="msg-successful")
    private  WebElement successful;

    @FindBy(id="msg-error")
    private WebElement bad;

    public void setFieldDestinationTranfer (String NameDestination){
        Events.fillField(fieldDestinationTranfer,NameDestination);
    }

    public void setIngresoMountfield (String MountField){
        Events.fillField(ingresoMountfield,MountField);
    }

    public void setButtonActionTransfer(){
        Events.click(buttonActionTransfer);
    }

    public boolean messagegood(){
        return Events.isVisibleWebElement(successful);
    }

    public boolean messagebad(){
        return Events.isVisibleWebElement(bad);
    }




}
