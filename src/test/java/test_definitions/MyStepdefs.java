package test_definitions;

import cucumber.api.java.en.Given;
import uitesting.upb.org.managepage.wallet.AccountCreator;

import static uitesting.upb.org.handlewebsite.LoadPage.loadAccountCreator;

public class MyStepdefs {

    private AccountCreator accountCreator;

    @Given("^'Account creator' is loaded$")
    public void accountCreatorIsLoaded() {
        accountCreator = loadAccountCreator();

    }
}
