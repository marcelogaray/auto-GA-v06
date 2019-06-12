package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.AccountSettingsPage;
import uitesting.upb.org.managepage.personalwallet.MainMenu;

public class PersonalWalletSteps {
    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private AccountSettingsPage accountSettingsPage;

    @Given("^The 'AccountHomeMenu' is loaded$")
    public void mainPageIsLoaded() {
        accountHomeMenu = LoadPage.loadHomeMenu();
    }

    @And("^filled 'Account name' field on 'AccountHomeMenu' with \"([^\"]*)\"$")
    public void filledAccountNameField(String accountName) {
        accountHomeMenu.writeAccountName(accountName);
    }

    @And("^clicked 'Add' button on 'AccountHomeMenu'$")
    public void clickedAddButton() {
        accountHomeMenu.clickAddButton();
    }

    @Given("^Clicked \"([^\"]*)\" account button 'AccountHomeMenu' page$")
    public void clickedAccountButton(String accountId) {
        mainMenu = accountHomeMenu.clickButtonById(accountId);
    }

    @When("^Click 'Account Settings' button on 'MainMenu' page$")
    public void clickAccountSettingsButton() {
        accountSettingsPage = mainMenu.clickAccountSettingsButton();
    }

    @And("^Click 'Delete account' button on 'AccountSettings' page$")
    public void clickDeleteAccountButton() {
        accountHomeMenu = accountSettingsPage.clickDeleteAccountButton();
    }

    @Then("^'AccountHomeMenu' has (\\d+) account button$")
    public void accounthomemenuHasOneAccountButton(int number) {
        Assert.assertEquals(accountHomeMenu.getNumberOfButtons(), number);
    }

    @And("^Change 'Account name' field on 'AccountSettings' page by adding \"([^\"]*)\" to it$")
    public void changeAccountNameField(String newAccountName) {
        accountSettingsPage.writeNewAccountName(newAccountName);
    }

    @And("^Click 'Change name' button on 'AccountSettings' page$")
    public void clickChangeNameButton() {
        accountSettingsPage.clickChangeNameButton();
    }

    @And("^Click 'Exit' button on 'AccountSettings' page$")
    public void clickExitButton() {
        accountHomeMenu = accountSettingsPage.clickExitButton();
    }

    @Then("^The account title is \"([^\"]*)\"$")
    public void theAccountTitleIs(String newTitle) {
        Assert.assertEquals(accountHomeMenu.getButtonNameById(newTitle), newTitle);
    }
}
