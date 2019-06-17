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
    private AccountCreator accountCreator;
    private NavBar navBar;
    private AccountSettings accountSettings;

    private AccountMainMenu accountMainMenu;

    private IncomeExpensesView incomeExpensesView;

    private GeneralReports generalReports;

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
        boolean check = accountManager.newAccountButtonIsVisible(accountName);

        Assert.assertTrue(check);
    }

    @And("^click 'General' account button on 'Account Manager'$")
    public void clickGeneralAccountButtonOnAccountManager() {
        generalReports = accountManager.clickGeneralAccountButton();
    }

    @Then("^title is visible on 'General Reports'$")
    public void titleIsVisibleOnGeneralReports() {
        Assert.assertTrue(generalReports.titleIsVisible());
    }

    @Given("^Account creator is loaded$")
    public void accountCreatorIsLoaded() {
        accountManager=LoadPage.loadAccountManager();
    }

    @And("^fill 'Account name' input with first account$")
    public void fillAccountNameInputWithFirstAccount() {
        accountManager.fillAccountNameField("First Account");
    }

    @And("^click 'Add' button for first account$")
    public void clickAddButtonForFirstAccount() {
        accountManager.clickAddAccountButton();
    }

    @And("^fill 'Account name' input with second account$")
    public void fillAccountNameInputWithSecondAccount() {
        accountManager.fillAccountNameField("Second Account");
    }

    @And("^click 'Add' button for second account$")
    public void clickAddButtonForSecondAccount() {
        accountManager.clickAddAccountButton();
    }

    @Then("^select first account$")
    public void selectFirstAccount() {
        accountManager.selectAccount("First Account");
    }

    @And("^click 'Income' button$")
    public void clickIncomeButton() {
        accountManager.clickIncomeButton();
    }

    @And("^click 'Income' button on 'Account Main Menu'$")
    public void clickIncomeButtonOnAccountMainMenu() {
        incomeExpensesView = accountMainMenu.clickIncomeButton();
    }

    @And("^click 'Expenses' button on 'Account Main Menu'$")
    public void clickExpensesButtonOnAccountMainMenu() {
        incomeExpensesView = accountMainMenu.clickExpensesButton();
    }

    @And("^fill 'Enter Name' input$")
    public void fillEnterNameInput() {
        accountManager.fillName("Salario Junio");
    }

    @And("^fill 'Category' field$")
    public void fillCategoryField() {
        accountManager.selectSalaryIncome();
    }

    @And("^fill 'Enter Amount' input$")
    public void fillEnterAmountInput() {
        accountManager.fillAmount("1000");
    }

    @And("^fill 'mm/dd/yyyy' input$")
    public void fillMmDdYyyyInput() {
        accountManager.fillDate("01/02/2019");
    }

    @Then("^click 'Register Transaction' button$")
    public void clickRegisterTransactionButton() {
        accountManager.registerTransaction();
    }

    @Then("^click 'Exit' Button$")
    public void clickExitButton() {
        accountManager.clickExitButton();
    }

    @And("^Then select first account again$")
    public void thenSelectFirstAccountAgain() {
        accountManager.selectAccount("First Account");
    }

    @And("^click 'Transfer' button$")
    public void clickTransferButton() {
        accountManager.clickTransferButton();
    }

    @And("^select 'Second Account' option$")
    public void selectSecondAccountOption() {
        accountManager.selectAccountDestination();
    }

    @And("^fill \"([^\"]*)\" on field amount$")
    public void fillOnFieldAmount(String amount) throws Throwable {
        accountManager.clearFieldAmount();
        accountManager.fillAmountTransfer(amount);
    }

    @Then("^click 'Transfer' button on transfer page$")
    public void clickTransferButtonOnTransferPage() {
        accountManager.clickTransferTransactionButton();
    }

    @Given("^Browser is loaded$")
    public void browserIsLoaded() {
        accountManager = LoadPage.loadAccountManager();
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
        accountSettings.writeInChangeAccountNameTextField(nuevoNombre);
    }

    @And("^Click 'Change name' button in 'Account Settings' page$")
    public void clickChangeNameButtonInAccountSettings() {
        accountSettings.clickChangeNameButton();
    }

    @Then("^'Add' button is visible on 'Account Creator'$")
    public void addButtonIsVisibleOnAccountCreator() {
        Assert.assertTrue(accountManager.addAccountButtonIsVisible());
    }

    @And("^'Account name' input is visible on 'Account Creator'$")
    public void accountNameInputIsVisibleOnAccountCreator() {
        Assert.assertTrue(accountManager.accountNameInputIsVisible());
    }

    @Then("^'Income' button from account choose is visible on 'Account Main Menu'$")
    public void incomeButtonFromAccountChooseIsVisibleOnAccountMainMenu() {
        Assert.assertTrue(accountMainMenu.incomeButtonIsVisible());
    }

    @And("^click \"([^\"]*)\" button on 'Account Manager'$")
    public void clickButtonOnAccountManager(String accountName) {
        accountMainMenu = accountManager.selectAccount(accountName);
    }

    @Then("^fill 'Enter Name' input on 'Income Expenses View'$")
    public void fillEnterNameInputOnIncomeExpensesView() {

    }

    @Then("^fill \"([^\"]*)\" in 'Enter Name' input on 'Income Expenses View'$")
    public void fillInEnterNameInputOnIncomeExpensesView(String expenseName) {
        incomeExpensesView.fillFieldName(expenseName);
    }

    @And("^select 'Category' field on 'Income Expenses View'$")
    public void selectCategoryFieldOnIncomeExpensesView() {
        incomeExpensesView.selectOthersCategory();
    }

    @And("^fill \"([^\"]*)\" 'Enter amount' input on 'Income Expenses View'$")
    public void fillEnterAmountInputOnIncomeExpensesView(String amount) {
        incomeExpensesView.fillAmountInput(amount);
    }

    @And("^fill \"([^\"]*)\" 'Date' input on 'Income Expenses View'$")
    public void fillDateInputOnIncomeExpensesView(String date) {
        incomeExpensesView.fillDateInput(date);
    }

    @Then("^click 'Register Transaction' button on 'Income Expenses View'$")
    public void clickRegisterTransactionButtonOnIncomeExpensesView() {
        incomeExpensesView.clickTransactionButton();
    }

    @Then("^'Transaction error' is visible$")
    public void transactionErrorIsVisible() {
        Assert.assertTrue(incomeExpensesView.transactionErrorIsVisible());
    }

    @Then("^'Enter amount' input is empty$")
    public void enterAmountInputIsEmpty() {
        Assert.assertTrue(incomeExpensesView.amountInputIsEmpty());
    }

    @And("^fill \"([^\"]*)\" 'Enter new amount' input on 'Income Expenses View'$")
    public void fillEnterNewAmountInputOnIncomeExpensesView(String amount) {
        incomeExpensesView.fillNewAmountInput(amount);
    }

    @Then("^'Enter new amount' input is zero$")
    public void enterNewAmountInputIsZero() {
        Assert.assertTrue(incomeExpensesView.newAmountIsZero());
    }

    @Then("^go back home in 'Expenses'$")
    public void goBackHomeInExpenses() {
        incomeExpensesView.clickMainMenu();
    }

    @Then("^select expense registered on 'Expense View'$")
    public void selectExpenseRegisteredOnExpenseView() {
        incomeExpensesView.selectCreatedExpense();
    }
}
