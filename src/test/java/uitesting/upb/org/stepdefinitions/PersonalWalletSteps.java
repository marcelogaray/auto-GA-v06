package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.Transactions.ExpensesPage;

public class PersonalWalletSteps {

    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ExpensesPage expensesPage;

    @cucumber.api.java.en.Given("^The main page is loaded$")
    public void theMainPageIsLoaded() {
        accountHomeMenu = LoadPage.loadHomeMenu();
    }

    @Given("^filled the 'Account name' field on 'AccountHomeMenu' with \"([^\"]*)\"$")
    public void filledTheAccountNameFieldOnAccountHomeMenuWith(String name) {
        accountHomeMenu = accountHomeMenu.writeAccountName(name);
    }

    @And("^clicked the 'Add' button on 'AccountHomeMenu'$")
    public void clickedTheAddButtonOnAccountHomeMenu() {
        accountHomeMenu = accountHomeMenu.clickAddButton();
    }

    @Given("^clicked the \"([^\"]*)\" button on 'AccountHomeMenu'$")
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

    @And("^Search 'category option' \"([^\"]*)\" on 'category selector' on 'Expenses page'$")
    public void searchTheCategoryOptionOnTheCategorySelectorOnExpensesPage(String category) {
        Assert.assertTrue(expensesPage.searchCategoryOnSelector(category));
    }

    @And("^fill 'expense name' field with \"([^\"]*)\" on 'Expenses Page'$")
    public void fillExpenseNameFieldWithOnExpensesPage(String name) {
        expensesPage = (ExpensesPage) expensesPage.fillTransactionNameField(name);
    }

    @And("^select \"([^\"]*)\" values on category selector on 'Expenses Page'$")
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
}
