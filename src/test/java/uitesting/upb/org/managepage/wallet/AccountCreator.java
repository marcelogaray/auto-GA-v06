package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AccountCreator extends BasePage {

    @FindBy(id = "accountNameInput")
    private WebElement accountNameTextField;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "Mateo")
    private WebElement accountMateoButton;

    @FindBy(xpath = "//div[contains(@class,'account-list')]")
    private  List<WebElement> accountList;

    @FindBy(xpath = "//*[@id='general']")
    private  WebElement general;

    public NavBar clickAccountGeneralButton(){
        Events.click(general);
        return new NavBar();
    }
    public void clickAddAccountButton() {
        Events.click(addAccountButton);
    }

    public NavBar clickAccountMateoButton() {
        Events.click(accountMateoButton);
        return new NavBar();
    }

    public AccountMainMenu clickAccountMButton(){
        Events.click(accountMateoButton);
        return new AccountMainMenu();
    }

    public void writeInAccountTextField(String nombreCuenta) {
        Events.fillField(accountNameTextField, nombreCuenta);
    }

    public boolean isAccountNameTextFieldEmpty(){
        return accountNameTextField.getText().equals("");
    }


    public int getAccountListLength(){

        return accountList.size();
    }

    public WebElement accountButtonExists(String accountName) {
        return  webDriver.findElement(By.id(accountName));
    }
}
