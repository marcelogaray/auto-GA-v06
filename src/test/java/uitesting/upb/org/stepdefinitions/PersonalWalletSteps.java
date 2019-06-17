package uitesting.upb.org.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.*;
import uitesting.upb.org.managepage.personalwallet.Transactions.ExpensesPage;
import uitesting.upb.org.managepage.personalwallet.Transactions.IncomePage;

import java.util.List;


public class PersonalWalletSteps {

    private AccountHomeMenu accountHomeMenu;
    private Header header;
    private MainMenu mainMenu;
    private ReportsPage reportsPage;
    private ExpensesPage expensesPage;
    private TransferPage transferPage;
    private IncomePage incomePage;
    private AccountSettingsPage accountSettingsPage;

    @Given("^Fill account name field on 'home menu' page with \"(.*)\"$")
    public void fillAccountNameField(String accountName) {
        accountHomeMenu.writeAccountName(accountName);
    }

    @Given("^Click 'Add' button on 'home menu' page$")
    public void clickAddButton() {
        accountHomeMenu.clickAddButton();
    }

    @Given("^Click \"(.*)\" button on 'home menu' page$")
    public void clickAccountButton(String accountId) {
        mainMenu = accountHomeMenu.clickButtonById(accountId);
        header = LoadPage.loadHeader();
    }

    @When("^Click 'Reports' button on 'main menu' page$")
    public void clickReportsButton() {
        reportsPage = mainMenu.clickReportsButton();
    }

    @And("^Select 'By category' in 'Select report type' selector on 'reports' page$")
    public void selectByCategoryOption() {
        reportsPage.selectOptionByValue("category");
    }

    @Given("^Select 'By date' in 'Select report type' selector on 'reports' page$")
    public void selectByDateOption() {
        reportsPage.selectOptionByValue("date");
    }

    @And("^Click 'Show report' button on 'reports' page$")
    public void clickShowReportButton() {
        reportsPage.clickShowReportButton();
    }

    @Given("^Click 'Personal wallet' button on 'income' page$")
    public void clickPersonalWalletButtonOnIncomePage() {
        mainMenu = incomePage.clickPersonalWalletLink();
    }

    @Given("^Click 'Personal wallet' button on 'expense' page$")
    public void clickPersonalWalletButtonOnExpensePage() {
        mainMenu = expensesPage.clickPersonalWalletLink();
    }

    @When("^Fill 'From' date picker with \"([^\"]*)\" on 'reports' page$")
    public void fillFromDatePickerOnReportsPage(String startDate) {
        reportsPage.fillStartDate(startDate);
    }

    @And("^Fill 'To' date picker with \"([^\"]*)\" on 'reports' page$")
    public void fillToDatePickerOnReportsPage(String endDate) {
        reportsPage.fillEndDate(endDate);
    }

    @Then("^The title is \"(.*)\"$")
    public void assertPageTitle(String title) {
        Assert.assertEquals(reportsPage.getTitle(), title);
    }

    @Then("^The table has \"([0-9]+)\" rows$")
    public void assertTableRows(String rows) {
        int numberOfRows = Integer.parseInt(rows);
        Assert.assertEquals(reportsPage.getNumberOfRows(), numberOfRows);
    }

    @Then("^\"(.*)\" row is red$")
    public void assertRowColorIsRed(String transactionName) {
        Assert.assertEquals(reportsPage.getElementColor(transactionName), "rgba(255, 0, 0, 1)");
    }

    @Then("^\"(.*)\" row is green$")
    public void assertRowColorIsGreen(String transactionName) {
        Assert.assertEquals(reportsPage.getElementColor(transactionName), "rgba(0, 128, 0, 1)");
    }

    @Then("^\"([^\"]*)\" error shows up on 'reports' page$")
    public void errorShowsUpOnReportsPage(String errorMessage){
        String errorMessageFromReportsPage = reportsPage.getErrorMessage();
        Assert.assertEquals(errorMessage, errorMessageFromReportsPage);
    }


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
        header = LoadPage.loadHeader();
        mainMenu = accountHomeMenu.clickButtonById(accountId);
    }

    @And("^fill 'category name' field with \"([^\"]*)\" on 'Expenses page'$")
    public void fillTheCategoryNameFieldWithOnExpensesPage(String name) throws Throwable {
        expensesPage = (ExpensesPage) expensesPage.fillCategoryRegisterField(name);
    }

    @Given("^click 'Expenses' button on 'MainMenu' page$")
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

    @And("^fill 'Date of the Transaction' field with \"([^\"]*)\" on 'Expenses Page'$")
    public void fillDateFieldFieldWithOnExpensesPage(String date) {
        expensesPage = (ExpensesPage) expensesPage.fillDateField(date);
    }

    @And("^click 'Register Transaction' button on 'Expenses Page'$")
    public void clickRegisterTransactionButtonOnExpensesPage() {
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

    @Given("^click 'Income' button on 'MainMenu' page$")
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

    @And("^click 'Register Transaction' button on 'Income Page'$")
    public void clickRegisterTransactionButtonOnIncomePage() {
        incomePage = (IncomePage) incomePage.clickRegisterTransactionButton();
    }

    @Then("^Search 'transaction success' alert on 'Income Page'$")
    public void searchTransactionSuccessAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isTransactionSuccessAlertVisible());
    }

    @Then("^check that title 'Transfer' title is visible on 'Transfer' Page$")
    public void checkThatTitleTransferTitleIsVisibleOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferTitleVisible());
    }

    @Then("^check that 'Transfer' Button is visible on 'Transfer' page$")
    public void checkThatTransferButtonIsVisibleOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferButtonVisible());
    }

    @Then("^check that 'Budget Available in BS' field is visible$")
    public void checkThatBudgetAvailableInBSFieldIsVisible() {
        Assert.assertTrue(transferPage.isBudgetAvailableFieldVisible());
    }
    @Then("^Search 'Missing or repeat data to complete register category!' alert on 'Expenses page'$")
    public void searchMissingOrRepeatDataToCompleteRegisterCategoryAlertOnExpensesPage() {
        Assert.assertTrue(expensesPage.isCategoryFailAlertVisible());
    }

    @And("^Confirm that \"([^\"]*)\" is not on 'category' selector on 'Expenses page'$")
    public void confirmThatIsNotOnCategorySelectorOnExpensesPage(String category) {
        Assert.assertFalse(expensesPage.searchCategoryOnSelector(category));
    }

    @And("^Confirm that number of options on 'category selector' is \"([^\"]*)\" on 'Expenses page'$")
    public void confirmThatNumberOfOptionsOnCategorySelectorIsOnExpensesPage(String number) {
        Assert.assertEquals(Integer.valueOf(number), Integer.valueOf(expensesPage.getCategorySelectorNumberOptions()));
    }

    @Then("^Reports table shows$")
    public void asssertReportsTable(DataTable table) {
        List< List<String> > reportsPageTable = reportsPage.getTableAsListOfLists();
        List< List<String> > tableAsList = table.raw();
        Assert.assertEquals(reportsPageTable, tableAsList);
    }

    @And("^fill the 'Date of the Transaction' date field with \"([^\"]*)\" on the 'Income' page$")
    public void fillTheDateOfTheTransactionDateFieldWithOnTheIncomePage(String date) throws Throwable {
        incomePage = (IncomePage) incomePage.fillDateField(date);
    }

    @Then("^check the 'Total Amount' label is \"([^\"]*)\" on 'Main Menu'$")
    public void checkTheTotalAmountLabelIsOnMainMenu(String amount) {
        Assert.assertEquals(mainMenu.getAmount(), "Total amount:\n"+amount+"\n Bs.");
    }

    @And("^click 'PersonalWallet' button on 'Header' page$")
    public void clickPersonalWalletButtonOnHeaderPage() {
        header = header.clickPersonalWalletButton();
    }

    @And("^Check number of transactions is \"([^\"]*)\" on 'Select a Transaction' on 'Expenses' page$")
    public void checkNumberOfTransactionsIsOnSelectATransactionOnExpensesPage(String number) {
        Assert.assertEquals(Integer.valueOf(number), Integer.valueOf(expensesPage.getTransactionNameSelectorNumberOptions()));
    }

    @And("^Search \"([^\"]*)\" option is not on 'Transaction Name' selector on 'Expenses' page$")
    public void searchOptionIsNotOnTransactionNameSelectorOnExpensesPage(String option) {
        Assert.assertTrue(expensesPage.searchOptionOnTransactionNameSelector(option));
    }
}
