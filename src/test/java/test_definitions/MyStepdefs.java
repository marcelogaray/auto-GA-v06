package test_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.managepage.wallet.AccountCreator;
import uitesting.upb.org.managepage.wallet.AccountHome;

import static uitesting.upb.org.handlewebsite.LoadPage.loadAccountCreator;

public class MyStepdefs {

    // No se olviden eliminar espacios innecesarios y subir hasta antes de las 5
    // En account creator esta un ejemplo de la estructura para cada linea en los features
    // accion objeto lugar (en ingles)

    private AccountCreator accountCreator;
    private AccountHome accountHome;

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
        boolean isVisibleAccountButton = accountCreator.isAccountNameButtonVisible(accountName);
        Assert.assertTrue(isVisibleAccountButton);
    }
}
