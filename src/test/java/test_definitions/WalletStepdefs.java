package test_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.AccountManager;

public class WalletStepdefs {

    public final static String EXAMPLE_ACCOUNT_NAME = "My new account";

    private AccountManager accountManager;

    @Given("^Account manager is loaded$")
    public void accountManagerIsLoaded() {
        accountManager = LoadPage.loadAccountManager();
    }

    @And("^fill \"([^\"]*)\" account name input$")
    public void fillAccountNameInput(String accountName) {
        accountManager.fillAccountNameField(accountName);
    }

    @Then("^click create button$")
    public void clickCreateButton() {
        accountManager.clickAddAccountButton();
    }

    @And("^new account is created$")
    public void newAccountIsCreated() {
        accountManager.createAccount(EXAMPLE_ACCOUNT_NAME);
    }

    @Then("^check if the account button is visible$")
    public void checkIfTheAccountButtonIsVisible() {
        boolean check = accountManager.checkIfNewAccountButtonIsVisible(EXAMPLE_ACCOUNT_NAME);

        Assert.assertTrue(check);
    }

    @Then("^click General button$")
    public void clickGeneralButton() {
        accountManager.clickGeneralAccountButton();
    }

}
