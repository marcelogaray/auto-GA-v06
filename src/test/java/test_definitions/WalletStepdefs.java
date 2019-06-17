package test_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.*;

public class WalletStepdefs {

    public final static String EXAMPLE_ACCOUNT_NAME = "My new account";

    private AccountManager accountManager;

    @Given("^Account manager is loaded$")
    public void accountManagerIsLoaded() {
        accountManager = LoadPage.loadAccountManager();
    }

    @And("^fill \"([^\"]*)\" 'Account name' input on 'Account Manager'$")
    public void fillAccountNameInputOnAccountManager(String accountName) {
        accountManager.fillAccountNameField(accountName);
    }

    @Then("^click 'Add' button on 'Account Manager'$")
    public void clickAddButtonOnAccountManager() {
        accountManager.clickAddAccountButton();
    }

    @And("^new account is created$")
    public void newAccountIsCreated() {
        accountManager.createAccount(EXAMPLE_ACCOUNT_NAME);
    }

    @Then("^check if \"([^\"]*)\" button is visible on 'Account Manager'$")
    public void checkIfButtonIsVisibleOnAccountManager(String accountName) {
        boolean check = accountManager.checkIfNewAccountButtonIsVisible(accountName);

        Assert.assertTrue(check);
    }

    @Then("^click 'General' account button on 'Account Manager'$")
    public void clickGeneralAccountButtonOnAccountManager() {
        accountManager.clickGeneralAccountButton();
    }


    //StepDefs para EditAccount y DeleteAccount


    AccountManager accountManager1;
    AccountCreator accountCreator;
    NavBar navBar;
    AccountSettings accountSettings;

    @Given("^Browser is loaded$")
    public void browserIsLoaded() {
        accountManager1 = LoadPage.loadAccountManager();
        accountCreator = LoadPage.loadAccountCreator();

    }

    @Then("^Fill 'Account Name' text field in 'Account Creator' page$")
    public void fillAccountNameTextFieldInAccountCreator() {
        accountCreator.writeInAccountTextField("Mateo");
    }

    @And("^Click 'Add' button in 'Account Creator' page$")
    public void clickAddButtonInAccountCreator() {
        accountCreator.clickAddAccountButton();

    }

    @And("^Click 'Mateo' button in 'Account Creator' page$")
    public void clickMateoButtonInAccountCreator() {
        navBar = accountCreator.clickAccountMateoButton();
    }

    @When("^'Navbar' is loaded in 'Nav Bar' page$")
    public void navbarIsLoaded() {
        boolean isVisible = navBar.navBarIsVisible();
        org.junit.Assert.assertTrue(isVisible);
    }

    @Then("^Click 'Account Settings' button in 'NavBar' page$")
    public void clickAccountSettingsButtonInNavBar() {
        accountSettings = navBar.clickAccountSettings();

    }

    @When("^'Account Settings' window is loaded$")
    public void accountSettingsWindowIsLoaded() {
        boolean isVisible = accountSettings.windowIsVisible();

        Assert.assertTrue(isVisible);
    }

    @Then("^Click 'Delete' button in Account Settings$")
    public void clickDeleteButtonInAccountSettings() {
        accountSettings.clickDeleteAccountButton();
    }

    @Then("^Fill 'Account Name' text field with \"([^\"]*)\" in 'Account Settings' page$")
    public void fillAccountNameTextFieldWithInAccountSettings(String nuevoNombre) {
        accountSettings.clearChangeAccountNameTextField();
        accountSettings.writeInChangeAccountNameTextField(nuevoNombre);
    }



    @And("^Click 'Change name' button in 'Account Settings' page$")
    public void clickChangeNameButtonInAccountSettings() {
        accountSettings.clickChangeNameButton();
    }



    AccountMainMenu accountMainMenu;
    ReportsPage reportsPage;
    ReportTable reportTable;


    @Then("^Click 'Mateo' button in 'Account Creator' page to load Account Main Menu$")
    public void clickMateoButtonInAccountCreatorPageToLoadAccountMainMenu() {


        accountMainMenu = accountCreator.clickAccountMButton();


    }

    @When("^'Account Main Menu' Page is loaded$")
    public void accountMainMenuPageIsLoaded() {

        Assert.assertTrue(accountMainMenu.mainMenuisLoaded());

    }

    @Then("^Click 'Report' button in 'Account Main Menu' Page$")
    public void clickReportButtonInAccountMainMenuPage() {
        reportsPage = accountMainMenu.clickReportButton();
    }

    @And("^Click 'Report Type' Selector in 'Report' Page$")
    public void clickReportTypeSelectorInReportPage() {
        reportsPage.clickTypeSelector();
    }

    @And("^Click 'By category' Type in 'Report Type Selector' in 'Report' Page$")
    public void clickByCategoryTypeInReportTypeSelectorInReportPage() {
        reportsPage.clickCategoryType();
    }

    @Then("^Click 'Show Report' Button in 'Report' Page$")
    public void clickShowReportButtonInReportPage() {
        reportTable =  reportsPage.clickShowReportButton();
    }

    @And("^Click 'Mateo' delete button in 'Report' table in 'Report' page$")
    public void clickMateoElementInReportTableInReportPage() {
        reportTable.clickDeleteIncomeMateo();
    }

    @And("^Click 'Celular' delete button in 'Report' table in 'Report' page$")
    public void clickCelularElementInReportTableInReportPage() {
        reportTable.clickDeleteExpenseCelular();
    }


    @Then("^Text field 'Account Name' should be empty in  'Account Creator' Page$")
    public void textFieldAccountNameShouldBeClear() {
        Assert.assertTrue(accountCreator.isAccountNameTextFieldEmpty());
    }

    int lengthOfAccountListBefore;

    @And("^List 'Account List' length should not change in 'Account Creator Page'$")
    public void listAccountListShouldHaveTheSameLength() {

    }

    @Then("^Get length of 'Account List' List in 'Account Creator' Page$")
    public void getLengthOfAccountListListInAccountCreatorPage() {
         //accountCreator.getAccountListLength();
    }
}
