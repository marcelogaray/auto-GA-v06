package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.AccountSettingsPage;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.Transactions.ExpensesPage;
import uitesting.upb.org.managepage.personalwallet.Transactions.IncomePage;
import uitesting.upb.org.managepage.personalwallet.TransferPage;

public class PersonalWalletSteps {

    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ExpensesPage expensesPage;
    private TransferPage transferPage;
    private IncomePage incomePage;
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

    @Given("^clicked \"([^\"]*)\" button on 'AccountHomeMenu'$")
    public void clickedTheButtonOnAccountHomeMenu(String accountId) {
        mainMenu = accountHomeMenu.clickButtonById(accountId);
    }

    @And("^fill 'category name' field with \"([^\"]*)\" on 'Expenses page'$")
    public void fillTheCategoryNameFieldWithOnExpensesPage(String name) throws Throwable {
        expensesPage = (ExpensesPage) expensesPage.fillCategoryRegisterField(name);
    }

    @Given("^clicked 'Expenses' button on 'MainMenu' page$")
    public void clickedTheExpensesButtonOnTheMainMenuPage() {
        expensesPage = mainMenu.clickExpensesButton();
    }

    @And("^click 'Register Category' button on 'Expenses page'$")
    public void clickTheRegisterCategoryButtonOnExpensesPage() {
        expensesPage = (ExpensesPage) expensesPage.clickRegisterCategoryButton();
    }

    @Then("^Search 'category success' alert on 'Expenses page'$")
    public void searchTheCategorySuccessAlertOnExpensesPage() {
        Assert.assertTrue(expensesPage.isCategorySuccessAlertVisible());
    }

    @And("^Search \"([^\"]*)\" on 'category' selector on 'Expenses page'$")
    public void searchTheCategoryOptionOnTheCategorySelectorOnExpensesPage(String category) {
        Assert.assertTrue(expensesPage.searchCategoryOnSelector(category));
    }

    @And("^fill 'expense name' field with \"([^\"]*)\" on 'Expenses Page'$")
    public void fillExpenseNameFieldWithOnExpensesPage(String name) {
        expensesPage = (ExpensesPage) expensesPage.fillTransactionNameField(name);
    }

    @And("^select \"([^\"]*)\" values on 'category' selector on 'Expenses Page'$")
    public void selectValuesOnCategorySelectorOnExpensesPage(String category) {
       expensesPage = (ExpensesPage) expensesPage.selectCategory(category);
    }

    @And("^fill 'AmountBS' field with \"([^\"]*)\" on 'Expenses Page'$")
    public void fillAmountBSFieldWithOnExpensesPage(String amount) {
        expensesPage = (ExpensesPage) expensesPage.fillAmountField(amount);
    }

    @And("^fill 'DateField' field with \"([^\"]*)\" on 'Expenses Page'$")
    public void fillDateFieldFieldWithOnExpensesPage(String date) {
        expensesPage = (ExpensesPage) expensesPage.fillDateField(date);
    }

    @And("^click 'Register Transition' button on 'Expenses Page'$")
    public void clickRegisterTransitionButtonOnExpensesPage() {
        expensesPage = (ExpensesPage) expensesPage.clickRegisterTransactionButton();
    }

    @Then("^Search 'transaction fail' alert on 'Expenses Page'$")
    public void searchTransactionFailAlertOnExpensesPage() {
        Assert.assertTrue(expensesPage.isTransactionFailAlertVisible());
    }

    @Given("^clicked the 'Transfer' Button on 'MainMenu' page$")
    public void clickedTheTransferButtonOnMainMenuPage() {
        transferPage = mainMenu.clickTransferButton();
    }

    @Given("^clicked 'Income' button on 'MainMenu' page$")
    public void clickedIncomeButtonOnMainMenuPage() {
        incomePage = mainMenu.clickIncomeButton();


    }

    @And("^filled 'amount in BS' text field with \"([^\"]*)\" on 'Transfer' page$")
    public void filledAmountInBSTextFieldWithOnTransferPage(String amount) {
        transferPage = transferPage.fillAmountTransferTextField(amount);
    }

    @And("^click the 'Transfer' Button on 'Transfer' page$")
    public void clickTheTransferButtonOnTransferPage() {
        transferPage = transferPage.clickTransferButton();
    }

    @Then("^Search the 'Error Message' fail alert on 'Transfer' page$")
    public void searchTheErrorMessageFailAlertOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferErrorMessageVisible());
    }

    @And("^select the \"([^\"]*)\" value on 'Destination Account' selector on 'Transfer' Page$")
    public void selectTheValueOnDestinationAccountSelectorOnTransferPage(String accountDestination) throws Throwable {
        transferPage = transferPage.selectAccountDestination(accountDestination);
    }

    @Then("^search the 'Success Message' alert on 'Transfer' page$")
    public void searchTheSuccessMessageAlertOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferSuccessMessageVisible());
    }

    @And("^fill the 'Name' field with \"([^\"]*)\" on the 'Income' page$")
    public void fillTheNameFieldWithOnTheIncomePage(String name) throws Throwable {
        incomePage = (IncomePage) incomePage.fillTransactionNameField(name);
    }

    @And("^select \"([^\"]*)\" value on the 'Category' selector on the 'Income' page$")
    public void selectValueOnTheCategorySelectorOnTheIncomePage(String category) throws Throwable {
        incomePage = (IncomePage) incomePage.selectCategory(category);
    }

    @And("^fill the 'Amount BS' field with \"([^\"]*)\" on the 'Income' page$")
    public void fillTheAmountBSFieldWithOnTheIncomePage(String amount) throws Throwable {
        incomePage = (IncomePage) incomePage.fillAmountField(amount);
    }

    @And("^fill the 'Date of the Transaction' date field with \"([^\"]*)\" on the 'Income' page$")
    public void fillTheDateOfTheTransactionDateFieldWithOnTheIncomePage(String date) throws Throwable {
        incomePage = (IncomePage) incomePage.fillDateField(date);
    }

    @And("^click the 'Register Transaction' button on the 'Income' page$")
    public void clickTheRegisterTransactionButtonOnTheIncomePage() {
        incomePage = (IncomePage) incomePage.clickRegisterTransactionButton();
    }

    @Then("^click the 'Exit' button on the 'Income' page$")
    public void clickTheExitButtonOnTheIncomePage() {
        accountHomeMenu = incomePage.clickExitButton();
    }

    @And("^fill 'category name' field with \"([^\"]*)\" on 'Income page'$")
    public void fillCategoryNameFieldWithOnIncomePage(String name)   {
        incomePage = (IncomePage) incomePage.fillCategoryRegisterField(name);
    }

    @And("^click 'Register Category' button on 'Income page'$")
    public void clickRegisterCategoryButtonOnIncomePage() {
        incomePage = (IncomePage) incomePage.clickRegisterCategoryButton();
    }

    @Then("^Search 'category success' alert on 'Income page'$")
    public void searchCategorySuccessAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isCategorySuccessAlertVisible());
    }

    @And("^Search \"([^\"]*)\" on 'category' selector on 'Income page'$")
    public void searchOnCategorySelectorOnIncomePage(String category)  {
        Assert.assertTrue(incomePage.searchCategoryOnSelector(category));
    }

    @And("^fill 'income name' field with \"([^\"]*)\" on 'Income Page'$")
    public void fillIncomeNameFieldWithOnIncomePage(String name)  {
        incomePage = (IncomePage) incomePage.fillTransactionNameField(name);
    }

    @And("^select \"([^\"]*)\" values on 'category' selector on 'Income Page'$")
    public void selectValuesOnCategorySelectorOnIncomePage(String category) {
        incomePage = (IncomePage) incomePage.selectCategory(category);
    }

    @And("^fill 'AmountBS' field with \"([^\"]*)\" on 'Income Page'$")
    public void fillAmountBSFieldWithOnIncomePage(String amount){
        incomePage = (IncomePage) incomePage.fillAmountField(amount);

    }

    @And("^fill 'DateField' field with \"([^\"]*)\" on 'Income Page'$")
    public void fillDateFieldFieldWithOnIncomePage(String date) {
        incomePage = (IncomePage) incomePage.fillDateField(date);
    }

    @And("^click 'Register Transition' button on 'Income Page'$")
    public void clickRegisterTransitionButtonOnIncomePage() {
        incomePage = (IncomePage) incomePage.clickRegisterTransactionButton();
    }

    @Then("^Search 'transaction success' alert on 'Income Page'$")
    public void searchTransactionSuccessAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isTransactionSuccessAlertVisible());
    }

    @And("^Click 'Account Settings' button on 'Income' page$")
    public void clickAccountSettingsButtonOnIncomePage() {
        accountSettingsPage = incomePage.clickAccountSettingsButton();
    }

    @Then("^Button \"([^\"]*)\" exists$")
    public void buttonExists(String button) {
        Assert.assertTrue(accountHomeMenu.isAccountButtonVisible(button));
    }

    @Then("^'Account Info' title is visible on 'AccountSettings' page$")
    public void accountInfoTitleIsVisibleOnAccountSettingsPage() {
        Assert.assertTrue(accountSettingsPage.accountSettingsTitleIsVisible());
    }

    @Then("^'Account name' field on 'AccountSettings' is filled with \"([^\"]*)\"$")
    public void accountNameFieldOnAccountSettingsIsFilledWith(String name) {
        Assert.assertEquals(accountSettingsPage.getInputText(), name);
    }
}
