package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;


public class AccountCreator extends BasePage {


    @FindBy(id = "accountNameInput")
    private WebElement accountNameTextField;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "Mateo")
    private WebElement accountMateoButton;

    @FindBy(className = "account-list")
    private  WebElement[] accountList;


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

    public void getAccountListLength(){

        System.out.println(accountList);
    }

}
