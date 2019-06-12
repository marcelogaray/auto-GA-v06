package test_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.managepage.wallet.AccountCreator;
import uitesting.upb.org.managepage.wallet.AccountHome;
import uitesting.upb.org.managepage.wallet.AccountInfo;

import static uitesting.upb.org.handlewebsite.LoadPage.loadAccountCreator;

public class MyStepdefs {

    // No se olviden eliminar espacios innecesarios y subir hasta antes de las 5
    // En account creator esta un ejemplo de la estructura para cada linea en los features
    // accion objeto lugar (en ingles)

    private AccountCreator accountCreator;
    private AccountHome accountHome;
    private AccountInfo accountInfo;

    @Given("^'Account creator' is loaded$")
    public void accountCreatorIsLoaded() {
        accountCreator = loadAccountCreator();
    }

    @Then("^the 'Account name' text field and 'add' button is visible in 'Account Creator'$")
    public void theAccountNameTextFieldAndAddButtonIsVisibleInAccountCreator() {
        boolean isAccountNameTextFieldAndAddButtonIsVisible = accountCreator.isAccountNameFieldAndButtonVisible();
        Assert.assertTrue(isAccountNameTextFieldAndAddButtonIsVisible);
    }


    @And("^fill \"([^\"]*)\" 'Account name' text field on 'Account Creator'$")
    public void fillAccountNameTextFieldOnAccountCreator(String newAccountName) throws Throwable {
        accountCreator.fillAccountNameTextField(newAccountName);
    }

    @And("^press 'Add' button on 'Account Creator'$")
    public void pressAddButtonOnAccountCreator() {
        accountCreator.clickAddButton();
    }

    @Then("^\"([^\"]*)\" button is visible on 'Account Creator'$")
    public void buttonIsVisibleOnAccountCreator(String accountName) {
        boolean isAccountButtonVisible = accountCreator.isAccountNameButtonVisible(accountName);
        Assert.assertTrue(isAccountButtonVisible);
    }

    @Then("^click \"([^\"]*)\" button in the list accounts on 'Account Creator'$")
    public void clickButtonInTheListAccountsOnAccountCreator(String accountName) throws Throwable {
        accountHome = accountCreator.clickAccountButton(accountName);
    }

    @And("^'Personal Wallet' button is visible on 'Account Home'$")
    public void personalWalletButtonIsVisibleOnAccountHome() {
        boolean isPersonalWalletVisible = accountHome.isPersonalWalletButtonVisible();
        Assert.assertTrue(isPersonalWalletVisible);
    }

    @And("^click 'Account settings' button on 'Account Home'$")
    public void clickAccountSettingsButtonOnAccountHome() {
        accountInfo = accountHome.clickAccountSettingsButton();
    }

    @Then("^'Delete account' button is visible on 'Account Info'$")
    public void deleteAccountButtonIsVisibleOnAccountInfo() {
        boolean isDeleteAccountButtonVisible = accountInfo.isDeleteAccountButtonVisible();
        Assert.assertTrue(isDeleteAccountButtonVisible);
    }

    @And("^click 'Delete account' button on 'Account Info'$")
    public void clickDeleteAccountButtonOnAccountInfo() {
        accountCreator = accountInfo.clickDeleteAccountButton();
    }

    @And("^'General' button is visible on 'Account Creator'$")
    public void generalButtonIsVisibleOnAccountCreator() {
        boolean isGeneralButtonVisible = accountCreator.isGeneralButtonVisible();
    }

    @When("^click \"([^\"]*)\" button existent in the list accounts on 'Account Creator'$")
    public void clickButtonExistentInTheListAccountsOnAccountCreator(String accountName) throws Throwable {
        accountCreator = accountCreator.createNewAccount(accountName);
        accountHome = accountCreator.clickAccountButton(accountName);
    }

    @When("^'Account settings' button is visible on 'Account Home'$")
    public void accountSettingsButtonIsVisibleOnAccountHome() {
        boolean isAccountSettingsButtonVisible = accountHome.isAccountSettingsButtonIsVisible();
        Assert.assertTrue(isAccountSettingsButtonVisible);
    }

    @And("^'Account Info' label is visible on 'Account Info'$")
    public void accountInfoLabelIsVisibleOnAccountInfo() {
        boolean accountInfoLabelVisible = accountInfo.isAccountInfoLabelVisible();
        Assert.assertTrue(accountInfoLabelVisible);
    }

    @And("^clear 'Account name' text field on 'Account Info'$")
    public void clearAccountNameTextFieldOnAccountInfo() {
        accountInfo.clearAccountNameTextField();
    }

    @And("^fill \"([^\"]*)\" 'Account name' text field on 'Account Info'$")
    public void fillAccountNameTextFieldOnAccountInfo(String newAccountName) throws Throwable {
        accountInfo.fillOnTheAccountNameTextField(newAccountName);
    }

    @And("^click 'Change name' button on 'Account Info'$")
    public void clickChangeNameButtonOnAccountInfo() {
        accountInfo.clickChangeNameButton();
    }

    @Then("^click 'exit' button on 'Account Info'$")
    public void clickExitButtonOnAccountInfo() {
        accountCreator = accountInfo.clickExitButton();
    }
}
