package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountSettings extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/form/div[1]/input")
    private WebElement changeAccountNameTextField;

    @FindBy(id = "changeNameButton")
    private WebElement changeNameButton;

    @FindBy(id = "deleteAccountButton")
    private WebElement deleteAccountButton;

    public void clickChangeNameButton() {
        Events.click(changeNameButton);
    }

    public void clickDeleteAccountButton() {
        Events.click(deleteAccountButton);
    }

    public void writeInChangeAccountNameTextField(String nombreCuenta) {
        Events.fillField(changeAccountNameTextField, nombreCuenta);
    }

    public void clearChangeAccountNameTextField(){
        Events.clearField(changeAccountNameTextField);
    }

    public boolean windowIsVisible() {
        return Events.isVisibleWebElement(changeAccountNameTextField);
    }

}
