package test_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.AccountCreator;
import uitesting.upb.org.managepage.wallet.AccountHome;
import uitesting.upb.org.managepage.wallet.Income;

public class MyStepdefs {

    // No se olviden eliminar espacios innecesarios y subir hasta antes de las 5
    // En account creator esta un ejemplo de la estructura para cada linea en los features_
    // accion objeto lugar (en ingles)

    private AccountCreator accountCreator;
    private AccountHome accountHome;
    private Income income;

    @Given("^'Account creator' is loaded$")
    public void accountCreatorIsLoaded() {
        accountCreator = LoadPage.loadAccountCreator();
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

    @Then("^click on \"([^\"]*)\" button$")
    public void clickOnButton(String account) throws Throwable {
        accountHome = accountCreator.clickAccountButton(account);
    }

    //------------- Income steps -------------//
    @And("^the 'Income' button is visible$")
    public void theIncomeButtonIsVisible() {
        Assert.assertTrue(accountHome.isIncomeButtonVisible());
    }

    @When("^the  button 'Register Category' is visible$")
    public void theButtonRegisterCategoryIsVisible() {
        Assert.assertTrue(income.isCategoryButtonVisible());
    }

    @Then("^click 'Income' Button$")
    public void clickIncomeButton() {
        income = accountHome.clickIncomeButton();
    }

    @And("^fill \"([^\"]*)\" on the category field$")
    public void fillOnTheCategoryField(String arg0) throws Throwable {
        income.fillCategoryField(arg0);
    }

    @Then("^click Register category Button$")
    public void clickRegisterCategoryButton() {
        income.clickRegisterCategoryButton();
    }

    @And("^window is maximized$")
    public void windowIsMaximized() {
        LoadPage.maximizeWindow();
    }

    @And("^the field 'Name' on Register Category is visible$")
    public void theFieldNameOnRegisterCategoryIsVisible() {
        Assert.assertTrue(income.isCategoryFieldVisible());
    }

    @When("^the field 'Name' on Incomes is visible$")
    public void theFieldNameOnIncomesIsVisible() {
        Assert.assertTrue(income.isIncomeNameFieldVisible());
    }

    @And("^the selector 'category' on Incomes is visible$")
    public void theSelectorCategoryOnIncomesIsVisible() {
        Assert.assertTrue(income.isIncomeCategorySelectorVisible());
    }

    @And("^the field 'Amount BS' on Incomes is visible$")
    public void theFieldAmountBSOnIncomesIsVisible() {
        Assert.assertTrue(income.isIncomeAmountFieldVisible());
    }

    @And("^the field 'Date' on Incomes is visible$")
    public void theFieldDateOnIncomesIsVisible() {
        Assert.assertTrue(income.isIncomeDateFieldVisible());
    }

    @And("^the button 'Register Transaction' on Incomes is visible$")
    public void theButtonRegisterTransactionOnIncomesIsVisible() {
        Assert.assertTrue(income.isIncomeButtonVisible());
    }

    @And("^fill \"([^\"]*)\" on the Income name field$")
    public void fillOnTheIncomeNameField(String name) throws Throwable {
        income.fillIncomeNameField(name);
    }

    @And("^fill \"([^\"]*)\" on the Income amount field$")
    public void fillOnTheIncomeAmountField(int amount) throws Throwable {
        income.fillIncomeAmountField(amount);
    }

    @And("^select \"([^\"]*)\" on the Income category selector$")
    public void selectOnTheIncomeCategorySelector(String category) throws Throwable {
        income.selectIncomeDefaultCategory(category);
    }

    @And("^fill \"([^\"]*)\" on the Income date field$")
    public void fillOnTheIncomeDateField(String date) throws Throwable {
        income.fillIncomeDateField(date);
    }

    @Then("^click on 'Register Transaction' Income button$")
    public void clickOnRegisterTransactionIncomeButton() {
        income.clickRegisterTransactionButton();
    }

    @And("^close Window$")
    public void closeWindow() {
        LoadPage.closeWindow();
    }

    @When("^the selector 'Select transaction Name' on Modify Income is visible$")
    public void theSelectorSelectTransactionNameOnModifyIncomeIsVisible() {
        Assert.assertTrue(income.isModifyIncomeNameSelectorVisible());
    }

    @And("^the field 'New Name' on Modify Income is visible$")
    public void theFieldNewNameOnModifyIncomeIsVisible() {
        Assert.assertTrue(income.isModifyIncomeNameFieldVisible());
    }

    @And("^the selector 'New Category' on Modify Income is visible$")
    public void theSelectorNewCategoryOnModifyIncomeIsVisible() {
        Assert.assertTrue(income.isModifyIncomeCategorySelectorVisible());
    }

    @And("^the field 'Date' on Modify Income is visible$")
    public void theFieldDateOnModifyIncomeIsVisible() {
        Assert.assertTrue(income.isModifyIncomeDateFieldVisible());
    }

    @And("^the field 'Amount' on Modify Income is visible$")
    public void theFieldAmountOnModifyIncomeIsVisible() {
        Assert.assertTrue(income.isModifyIncomeAmountFieldVisible());
    }

    @And("^the button 'Register Changes' on Modify Income is visible$")
    public void theButtonRegisterChangesOnModifyIncomeIsVisible() {
        Assert.assertTrue(income.isModifyIncomeButtonVisible());
    }

    @And("^select \"([^\"]*)\" on the Modify name selector$")
    public void selectOnTheModifyNameSelector(String oldName) throws Throwable {
        income.selectIncomeOldName(oldName);
    }

    @And("^fill \"([^\"]*)\" on the Modify name field$")
    public void fillOnTheModifyNameField(String newName) throws Throwable {
        income.fillIncomeNewNameField(newName);
    }

    @And("^select \"([^\"]*)\" on the Modify category selector$")
    public void selectOnTheModifyCategorySelector(String newCategory) throws Throwable {
        income.selectIncomeNewCategory(newCategory);
    }

    @And("^fill \"([^\"]*)\" on the Modify date field$")
    public void fillOnTheModifyDateField(String newDate) throws Throwable {
        income.fillIncomeNewDateField(newDate);
    }

    @And("^fill \"([^\"]*)\" on the modify amount field$")
    public void fillOnTheModifyAmountField(String newAmount) throws Throwable {
        income.fillIncomeNewAmountField(newAmount);
    }

    @Then("^click 'Register Changes' button$")
    public void clickRegisterChangesButton() {
        income.clickRegisterChangesButton();
    }

    @And("^category creation succeeded$")
    public void categoryCreationSucceeded() {
        Assert.assertTrue(income.isCategorySuccessAlertVisible());
    }

    @And("^category creation failed$")
    public void categoryCreationFailed() {
        Assert.assertTrue(income.isCategoryFailedAlertVisible());
    }

    @And("^Income creation succeeded$")
    public void incomeCreationSucceeded() {
        Assert.assertTrue(income.isIncomeSuccessAlertVisible());
    }

    @And("^Income creation failed$")
    public void incomeCreationFailed() {
        Assert.assertTrue(income.isIncomeFailAlertVisible());
    }

    @And("^edit Income failed$")
    public void editIncomeFailed() {
        Assert.assertTrue(income.isModifyIncomeFailAlertVisible());
    }

    @And("^edit Income succeeded$")
    public void editIncomeSucceeded() {
        Assert.assertTrue(income.isModifyIncomeSuccessAlertVisible());
    }

    //------------- Income steps -------------//
}
