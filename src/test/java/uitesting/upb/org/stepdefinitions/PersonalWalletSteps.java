package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.Transactions.ExpensesPage;
import uitesting.upb.org.managepage.personalwallet.Transactions.IncomePage;

public class PersonalWalletSteps {

    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ExpensesPage expensesPage;
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

    @Given("^clicked 'Income' button on 'MainMenu' page$")
    public void clickedIncomeButtonOnMainMenuPage() {
        incomePage = mainMenu.clickIncomeButton();
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
}
