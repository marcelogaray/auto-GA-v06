package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
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

    @cucumber.api.java.en.Given("^The 'AccountHomeMenu' is loaded$")
    public void theMainPageIsLoaded() {
        accountHomeMenu = LoadPage.loadHomeMenu();
    }

    @Given("^filled 'Account name' field on 'AccountHomeMenu' with \"([^\"]*)\"$")
    public void filledTheAccountNameFieldOnAccountHomeMenuWith(String name) {
        accountHomeMenu = accountHomeMenu.writeAccountName(name);
    }

    @And("^clicked 'Add' button on 'AccountHomeMenu'$")
    public void clickedTheAddButtonOnAccountHomeMenu() {
        accountHomeMenu = accountHomeMenu.clickAddButton();
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
}
