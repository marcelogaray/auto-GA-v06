package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountSettings extends BasePage {

    @FindBy(xpath = "//*[@placeholder = \"Account name\"]")
    private WebElement changeAccountNameTextField;

    @FindBy(id = "changeNameButton")
    private WebElement changeNameButton;

    @FindBy(id = "deleteAccountButton")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//*[@for = 'account name']")
    private  WebElement accountNameLabel;

    @FindBy(xpath = "//*[@class = \"text-center\" and contains(.,\"Account Info\")]")
    private  WebElement accountInfoTitle;





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


    public boolean isVisibleChangeAccountNameTextField(){
        return Events.isVisibleWebElement(changeAccountNameTextField);
    }
    public boolean isVisibleChangeNameButton(){
        return Events.isVisibleWebElement(changeNameButton);
    }
    public boolean isVisibledeleteAccountButton(){
        return Events.isVisibleWebElement(deleteAccountButton);
    }
    public boolean isVisibleAccountNameLabel(){
        return Events.isVisibleWebElement(accountNameLabel);
    }
    public boolean isVisibleAccountInfoTitle(){
        return  Events.isVisibleWebElement(accountInfoTitle);
    }

}
