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
import uitesting.upb.org.webdrivermanager.DriverManager;

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

    @When("^Click 'Account Settings' button on 'Header'$")
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

    @And("^Click 'Exit' button on 'Header'$")
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

    @Given("^clicked 'Transfer' Button on 'MainMenu' page$")
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

    @And("^click 'Transfer' Button on 'Transfer' page$")
    public void clickTheTransferButtonOnTransferPage() {
        transferPage = transferPage.clickTransferButton();
    }

    @Then("^Search 'Error Message' fail alert on 'Transfer' page$")
    public void searchTheErrorMessageFailAlertOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferErrorMessageVisible());
    }

    @And("^select \"([^\"]*)\" value on 'Destination Account' selector on 'Transfer' Page$")
    public void selectTheValueOnDestinationAccountSelectorOnTransferPage(String accountDestination) throws Throwable {
        transferPage = transferPage.selectAccountDestination(accountDestination);
    }

    @Then("^click 'Exit' button on 'Income' page$")
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
    @Then("^Search 'transaction fail' alert on 'Income Page'$")
    public void searchTransactionFailAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isTransactionFailAlertVisible());
    }

    @Then("^Search 'category fail' alert on 'Income page'$")
    public void searchCategoryFailAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isCategoryFailAlertVisible());
    }

    @And("^fill 'New name' field with \"([^\"]*)\" on 'Income page'$")
    public void fillNewNameFieldWithOnIncomePage(String newName) {
        incomePage = (IncomePage) incomePage.fillNewNameField(newName);
    }

    @And("^fill 'New category' selector with \"([^\"]*)\" on 'Income page'$")
    public void fillNewCategorySelectorWithOnIncomePage(String newCategory) {
        incomePage = (IncomePage) incomePage.fillNewCategoryField(newCategory);
    }

    @And("^fill 'New amount' field  with \"([^\"]*)\" on 'Income page'$")
    public void fillNewAmountFieldWithOnIncomePage(String newAmount) {
        incomePage = (IncomePage) incomePage.fillNewAmountField(newAmount);
    }

    @And("^fill 'New Date' field with \"([^\"]*)\" on 'Income page'$")
    public void fillNewDateFieldWithOnIncomePage(String newDate) {
        incomePage = (IncomePage) incomePage.fillNewDateField(newDate);
    }

    @And("^click 'Register Changes' button$")
    public void clickRegisterChangesButton() {
        incomePage = (IncomePage) incomePage.clickRegisterChangesButton();
    }

    @Then("^Search 'changeSuccess' alert on 'Income page'$")
    public void searchChangeSuccessAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isChangeSuccessAlertVisible());
    }

    @Then("^Search 'changeFail' alert on 'Income page'$")
    public void searchChangeFailAlertOnIncomePage() {
        Assert.assertTrue(incomePage.isChangeFailAlertVisible());
    }

    @And("^fill 'Select transaction Name' with \"([^\"]*)\" field on 'Income page'$")
    public void fillSelectTransactionNameWithFieldOnIncomePage(String oldName) {
        incomePage = (IncomePage) incomePage.fillOldTransactionNameField(oldName);

    }

    @And("^clear 'category name' field on 'Expenses page'$")
    public void clearCategoryNameFieldOnExpensesPage() {
        expensesPage = (ExpensesPage) expensesPage.clearCategoryNameField();
    }
    @Then("^search 'Success Message' alert on 'Transfer' page$")
    public void searchSuccessMessageAlertOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferSuccessMessageVisible());
    }

    @Then("^Search 'transaction success' alert on 'Expenses' page$")
    public void searchTransactionSuccessAlertOnExpensesPage() {
        Assert.assertTrue(expensesPage.isTransactionSuccessAlertVisible());
    }

    @Then("^fill 'new name' field with \"([^\"]*)\" on 'Expenses Page'$")
    public void fillNewNameFieldWithOnExpensesPage(String newname) {
        expensesPage = (ExpensesPage) expensesPage.fillNewNameField(newname);
    }

    @And("^select category \"([^\"]*)\" in 'new category' on 'expenses page'$")
    public void selectCategoryInNewCaegoryOnExpensesPage(String category) {
        if (category != ""){
            expensesPage = (ExpensesPage) expensesPage.selectNewCategory(category);
        }
    }


    @And("^fill 'new date' field with \"([^\"]*)\" on 'expense page'$")
    public void fillNewDateFieldWithOnExpensePage(String date) throws Throwable {
        expensesPage = (ExpensesPage)expensesPage.fillNewDateField(date);
    }


    @And("^fill 'new amount' with \"([^\"]*)\" on 'expense page'$")
    public void fillNewAmountWithOnExpensePage(String arg0) throws Throwable {
        expensesPage = (ExpensesPage)expensesPage.fillNewAmountField(arg0);
    }


    @And("^click 'Register Changes' button' on 'Expense' page$")
    public void clickRegisterChangesButtonOnExpensePage() {
        expensesPage = (ExpensesPage)expensesPage.clickRegisterChangesButton();
    }

    @Then("^Search 'changeFail' alert on 'Expenses page'$")
    public void searchChangeFailAlertOnExpensesPage() {
        Assert.assertTrue(expensesPage.isChangeFailAlertVisible());
    }

    @Then("^Select 'name' \"([^\"]*)\" on 'Expenses Page'$")
    public void selectNameOnExpensesPage(String name) throws Throwable {
        if (name != "") {
            expensesPage = (ExpensesPage) expensesPage.selectTransactionName(name);
        }
    }

    @Then("^Search 'changeSuccess' alert on 'Expenses page'$")
    public void searchChangeSuccessAlertOnExpensesPage() {
        Assert.assertTrue(expensesPage.isChangeSuccessAlertVisible());
    }

    @And("^Close Browser$")
    public void closeBrowser() {
        DriverManager.getInstance().closeWebDriver();
    }

    @And("^\"([^\"]*)\" row is visible on 'Reports' page$")
    public void rowShouldBeVisibleOnReportsPage(String row) {
        Assert.assertTrue(reportsPage.isRowVisible(row));
    }

    @Then("^Click on 'x' button in row \"([^\"]*)\" on 'Reports' page$")
    public void clicOnXButtonInRowOnReportsPage(String row) {
        reportsPage = reportsPage.deleteRow(row);
    }

    @And("^\"([^\"]*)\" row is not visible on 'Reports' page$")
    public void rowIsNotVisibleOnReportsPage(String row) {
        Assert.assertFalse(reportsPage.isRowVisible(row));
    }

    @Then("^click 'new amount' field on 'Expenses' page$")
    public void clickNewAmountFieldOnExpensesPage() {
        expensesPage = (ExpensesPage) expensesPage.clickNewAmountField();
    }

    @And("^'new amount' field should be empty on 'Expenses' page$")
    public void newAmountFieldShouldBeEmptyOnExpensesPage() {
        Assert.assertEquals("", expensesPage.getNewAmountFieldText());
    }
    @And("^Change 'Account name' field on 'AccountSettings' to \"([^\"]*)\"$")
    public void changeAccountNameFieldOnAccountSettingsTo(String arg0) {
        accountSettingsPage.setNewAccountName(arg0);
    }

    @Then("^'Delete account' button is visible$")
    public void deleteAccountButtonIsVisible() {
        Assert.assertTrue(accountSettingsPage.deleteAccountButtonIsVisible());
    }

    @And("^'Change name' button is visible$")
    public void changeNameButtonIsVisible() {
        Assert.assertTrue(accountSettingsPage.changeNameButtonIsVisible());
    }
}