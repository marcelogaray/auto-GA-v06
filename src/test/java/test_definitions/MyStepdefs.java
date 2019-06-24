package test_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.*;

import static uitesting.upb.org.handlewebsite.LoadPage.loadAccountCreator;

public class MyStepdefs {

    // No se olviden eliminar espacios innecesarios y subir hasta antes de las 5
    // En account creator esta un ejemplo de la estructura para cada linea en los features
    // accion objeto lugar (en ingles)

    private AccountCreator accountCreator;
    private AccountHome accountHome;
    private Income income;
    private AccountInfo accountInfo;
    private ExpensesPage expensesPage;
    private String accountName = "Cuenta1";
    private String accountName2;
    private String accountNameTranfer ;
    private TransferPage transferPage;

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
        boolean isAccountButtonVisible = accountCreator.isAccountNameButtonVisible(accountName);
        Assert.assertTrue(isAccountButtonVisible);
    }

    @Then("^click \"([^\"]*)\" button in the list accounts on 'Account Creator'$")
    public void clickButtonInTheListAccountsOnAccountCreator(String accountName) throws Throwable {
        accountHome = accountCreator.clickAccountButton(accountName);
    }

    @And("^'Personal Wallet' button is visible on 'Account Home'$")
    public void personalWalletButtonIsVisibleOnAccountHome() {
        boolean isPersonalWalletVisible = accountHome.isPersonalWalletButtonVisible();
        Assert.assertTrue(isPersonalWalletVisible);
    }

    @And("^click 'Account settings' button on 'Account Home'$")
    public void clickAccountSettingsButtonOnAccountHome() {
        accountInfo = accountHome.clickAccountSettingsButton();
    }

    @Then("^'Delete account' button is visible on 'Account Info'$")
    public void deleteAccountButtonIsVisibleOnAccountInfo() {
        boolean isDeleteAccountButtonVisible = accountInfo.isDeleteAccountButtonVisible();
        Assert.assertTrue(isDeleteAccountButtonVisible);
    }

    @And("^click 'Delete account' button on 'Account Info'$")
    public void clickDeleteAccountButtonOnAccountInfo() {
        accountCreator = accountInfo.clickDeleteAccountButton();
    }

    @And("^'General' button is visible on 'Account Creator'$")
    public void generalButtonIsVisibleOnAccountCreator() {
        boolean isGeneralButtonVisible = accountCreator.isGeneralButtonVisible();
    }

    @When("^click \"([^\"]*)\" button existent in the list accounts on 'Account Creator'$")
    public void clickButtonExistentInTheListAccountsOnAccountCreator(String accountName) throws Throwable {
        accountCreator = accountCreator.createNewAccount(accountName);
        accountHome = accountCreator.clickAccountButton(accountName);
    }

    @When("^'Account settings' button is visible on 'Account Home'$")
    public void accountSettingsButtonIsVisibleOnAccountHome() {
        boolean isAccountSettingsButtonVisible = accountHome.isAccountSettingsButtonIsVisible();
        Assert.assertTrue(isAccountSettingsButtonVisible);
    }

    @And("^'Account Info' label is visible on 'Account Info'$")
    public void accountInfoLabelIsVisibleOnAccountInfo() {
        boolean accountInfoLabelVisible = accountInfo.isAccountInfoLabelVisible();
        Assert.assertTrue(accountInfoLabelVisible);
    }

    @And("^clear 'Account name' text field on 'Account Info'$")
    public void clearAccountNameTextFieldOnAccountInfo() {
        accountInfo.clearAccountNameTextField();
    }

    @And("^fill \"([^\"]*)\" 'Account name' text field on 'Account Info'$")
    public void fillAccountNameTextFieldOnAccountInfo(String newAccountName) throws Throwable {
        accountInfo.fillOnTheAccountNameTextField(newAccountName);
    }

    @And("^click 'Change name' button on 'Account Info'$")
    public void clickChangeNameButtonOnAccountInfo() {
        accountInfo.clickChangeNameButton();
    }

    @Then("^click 'exit' button on 'Account Info'$")
    public void clickExitButtonOnAccountInfo() {
        accountCreator = accountInfo.clickExitButton();
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

    @Then("^verify if the category 'Salary' is visible in the page 'Income'$")
    public void verifyIfTheCategorySalaryIsVisibleInThePageIncome() {
        income.isVisibleCategorySalary();
    }

    @Then("^verify if the category 'Others' is visible in the page 'Income'$")
    public void verifyIfTheCategoryOthersIsVisibleInThePageIncome() {
        income.isVisibleCategoryOthers();
    }

    //------------- Income steps -------------//

    //EXPENSES

    @Given("^Fill \"Cuenta1\" in 'Account Name' text field on 'Account Creator'$")
    public void accountCreatorIsLoadedAndVisible() {
        accountCreator = LoadPage.loadAccountCreator();
        accountCreator.fillAccountNameTextField(accountName);
    }

    @And("^Click 'Create Account' Button on 'Account Creator'$")
    public void clickCreateAccount() {
        accountCreator.clickAddButton();
    }

    @And("^Select and Click  Account \"Cuenta1\" Button on 'Account Creator'$")
    public void clickAccountButton() {
        accountHome = accountCreator.clickAccountButton(accountName);
    }

    @And("^Check if \"Expenses\" Button is displayed and clickable on 'Account Home'$")
    public void expenseButtonIsVisible() {
        Assert.assertTrue(accountHome.expensesButtonIsVisible());
    }

    @Given("^Check if 'Expense Name' TextField is visible on 'Expenses Page'$")
    public void nameFieldVisible() {
        Assert.assertTrue(expensesPage.nameFieldVisible());
    }

    @And("^Check if 'Expense Category Selector' is visible on 'Expense Page'$")
    public void categorySelectorVisible() {
        Assert.assertTrue(expensesPage.categorySelectorVisible());
    }

    @And("^Check if 'Expense Amount' TextField is visible on 'Expenses Page'$")
    public void amountFieldVisible() {
        Assert.assertTrue(expensesPage.amountFieldVisible());
    }

    @And("^Check if 'Date Picker' is Visible on 'Expenses Page'$")
    public void datePickerVisible() {
        Assert.assertTrue(expensesPage.datePickerVisible());
    }


    @Then("^Click 'Expenses' Button on 'Account Home'$")
    public void clickExpenseButtonOnAccountHome() {
        expensesPage = accountHome.clickExpenseButton();
    }


    @And("^Fill \"Medical Bills\" in 'Expense Name' on 'Expenses Page'$")
    public void fillExpenseName() {
        expensesPage.fillExpenseName("Medical Bills");
    }

    @And("^Fill \"Expenses\" in 'Expense Category' on 'Expense Page'$")
    public void fillExpenseCategory() {
        expensesPage.fillCategorySelector("Expenses");
    }

    @And("^Fill \"1000\" in 'Expense Amount' on 'Expense Page'$")
    public void fillExpenseAmount() {
        expensesPage.fillExpenseAmount(1000);
    }

    @And("^Fill \"12/06/2019\" in 'Expense Date' on 'Expense Page'$")
    public void fillExpenseDate() {
        expensesPage.fillExpenseDate("12/06/2019");
    }

    @And("^Click 'Create Expense' Button on 'Expense Page'$")
    public void clickCreateExpense() {
        expensesPage.clickCreateExpenseButton();
    }


    @And("^Click button 'Expenses' on 'Account Home'$")
    public void clickButtonExpensesOnAccountHome() {
        expensesPage = accountCreator.clickexpenses();
    }

    @Then("^verify if the category 'Expenses' is visible$")
    public void verifyIfTheCategoryExpensesIsVisible() {
        expensesPage.visibleExpensas();
    }

    @Then("^verify if the category 'Others' is visible$")
    public void verifyIfTheCategoryOthersIsVisible() {
        expensesPage.visibleOthers();

    }

    @Then("^verify if the category 'Others' is not visible$")
    public void verifyIfTheCategoryOthersIsNotVisible() {

        expensesPage.isNotVisibleOthers();
    }




    //TRANSFER STEPS
    //==============================================================================================

    @Then("^Insert the name \"([^\"]*)\" in the field account name for create a new Account$")
    public void isertTheNameInTheFieldAccountNameForCreateANewAccount(String nameaccount) throws Throwable {
        accountNameTranfer=nameaccount;
        accountCreator.fillAccountNameTextField(nameaccount);
    }

    @And("^click in the add button for create the new accoun 'Count(\\d+)'$")
    public void clickInTheAddButtonForCreateTheNewAccounCount(int arg0) {
    accountCreator.clickAddButton();
    }

    @Then("^click in the 'Count (\\d+)'$")
    public void clickInTheCount(int arg0) {
        accountCreator.clickAccountButtonByXpath(accountNameTranfer);

    }

    @And("^click 'Income' Button in the main page 'Count(\\d+)'$")
    public void clickIncomeButtonInTheMainPageCount(int arg0) {

        accountCreator.clickIncomesButton();
    }

    @Then("^Insert \"([^\"]*)\" in the field 'Name' in the page 'Icome'$")
    public void insertInTheFieldNameInThePageIcome(String nameIcome) throws Throwable {
    accountCreator.fieldNameIncome(nameIcome);
    }

    @And("^Insert \"([^\"]*)\" in the field 'Category' in the page 'Icome'$")
    public void insertInTheFieldCategoryInThePageIcome(String categoryIcome) throws Throwable {
    accountCreator.fieldCategoryIncome(categoryIcome);
    }

    @And("^Insert \"([^\"]*)\" in the field 'Mount' in the page 'Icome'$")
    public void insertInTheFieldMountInThePageIcome(String mountIncome) throws Throwable {
        accountCreator.fieldMountIncome(mountIncome);
    }

    @And("^Insert \"([^\"]*)\" in the field 'Date' in the page 'Icome'$")
    public void insertInTheFieldDateInThePageIcome(String dateIncome) throws Throwable {
    accountCreator.fieldDateIncome(dateIncome);
    }

    @Then("^click the button 'Register Transaction' in the page 'Income'$")
    public void clickTheButtonRegisterTransactionInThePageIncome() {
        accountCreator.clickRegisteTransactionButton();
    }

    @And("^click the button 'Transfer' in the main page in the 'Count (\\d+)'$")
    public void clickTheButtonTransferInTheMainPageInTheCount(int arg0) {

    transferPage=accountCreator.clickTranferbutton();

    }

    @Then("^insert \"([^\"]*)\" in the field destination in the page 'Tranfer'$")
    public void insertInTheFieldDestinationInThePageTranfer(String nameTranfer2) throws Throwable {
       transferPage.setFieldDestinationTranfer(nameTranfer2);
    }

    @And("^insert \"([^\"]*)\" in the fiel mount in the page 'Tranfer'$")
    public void insertInTheFielMountInTheOageTranfer(String mountTranfer) throws Throwable {
        transferPage.setIngresoMountfield(mountTranfer);
    }

    @And("^click button 'Transfer' in the page 'Transfer'$")
    public void clickButtonTransferInThePageTransfer() {

        transferPage.setButtonActionTransfer();
    }

    @Then("^Verify if the mesage 'Succesfull' appears$")
    public void verifyIfTheMesageSuccesfullAppears() {

        Assert.assertTrue(transferPage.messagegood(),"IS TRUE");

    }

    @Then("^Verify if the mesage 'Bad' appears$")
    public void verifyIfTheMesageBadAppears() {
        Assert.assertTrue(transferPage.messagebad(),"IS TRUE");
    }





//
//    @Given("^Account creator is loadedd$")
//    public void accountCreatorIsLoadedd() {
//        accountCreator=loadAccountCreator();
//    }
//
//
//    @Then("^insert name count \"([^\"]*)\"$")
//    public void insertNameCount(String NameAcount) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountName=NameAcount;
//        accountCreator.fillAccountNameTextField(NameAcount);
//    }
//
//
//    @And("^click add button$")
//    public void clickAddButton() {
//    accountCreator.clickAddButton();
//    }
//
//
//    @Then("^new acount \"([^\"]*)\"$")
//    public void newAcount(String NameAccouns) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountName2=NameAccouns;
//        accountCreator.fillAccountNameTextField(NameAccouns);
//    }
//
//
//    @And("^click two add button$")
//    public void clickTwoAddButton() {
//    accountCreator.clickAddButton();
//
//    }
//
//
//    @And("^click Acount Button$")
//    public void clickAcountButton() {
//
//
//        accountHome= accountCreator.clickAccountButtonByXpath(accountName);
//    }
//
//
//    @And("^click income buttonn$")
//    public void clickIncomeButtonn() {
//        accountCreator.clickIncomesButton();
//    }
//
//
//    @And("^click button name$")
//    public void clickButtonName() {
//accountCreator.clickNameIngreso();
//    }
//
//
//    @And("^complete name \"([^\"]*)\"$")
//    public void completeName(String name) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldNameIngreso(name);
//    }
//
//
//    @And("^click Categoty$")
//    public void clickCategoty() {
//    accountCreator.clickCategoria();
//
//    }
//
//
//    @And("^complete category \"([^\"]*)\"$")
//    public void completeCategory(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldCategoriaIngreso(arg0);
//    }
//
//
//    @And("^click mont button$")
//    public void clickMontButton() {
//    accountCreator.clickMountIngreso();
//
//    }
//
//
//    @And("^field mont \"([^\"]*)\"$")
//    public void fieldMont(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldMountIngreso(arg0);
//    }
//
//
//    @And("^fill data \"([^\"]*)\"$")
//    public void fillData(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldDateIngreso(arg0);
//    }
//
//
//    @And("^click addtrnafer$")
//    public void clickAddtrnafer() {
//
//accountCreator.clickIngresoButton();
//
//    }
//
//    @Then("^click firstCount$")
//    public void clickFirstCount() {
//        accountHome = accountCreator.clickAccountButtonByXpath(accountName);
//    }
//
//
//    @And("^click Transfer Button$")
//    public void clickTransferButton() {
//        accountCreator.clickTranferButton();
//    }
//
//
//    @Then("^click destination$")
//    public void clickDestination() {
//        accountCreator.clickFieldDestination();
//    }
//
//
//    @And("^filed countname \"([^\"]*)\"$")
//    public void filedCountname(String NameDestination) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldDestination(NameDestination);
//    }
//
//
//    @And("^empty field amount$")
//    public void emptyFieldAmount() {
//        accountCreator.emptyFieldMount();
//
//
//    }
//
//    @And("^field mount tranfer \"([^\"]*)\"$")
//    public void fieldMountTranfer(String Mont) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldMountTransfer(Mont);
//    }
//
//    @Then("^click transerferButton$")
//    public void clickTranserferButton() {
//        accountCreator.clickActionTransferencia();
//    }
//
//    @And("^check msg-succesful$")
//    public void checkMsgSuccesful() {
//        org.junit.Assert.assertTrue("Se vio el mensaje",accountCreator.messagegood());
//
//
//    }
//
//    @Then("^click firstCountt$")
//    public void clickFirstCountt() {
//        accountHome=accountCreator.clickAccountButtonByXpath(accountName);
//
//    }
//
//
//    @And("^click Transfer Buttonn$")
//    public void clickTransferButtonn() {
//        accountCreator.clickTranferButton();
//    }
//
//    @Then("^click destinationn$")
//    public void clickDestinationn() {
//        accountCreator.clickFieldDestination();
//    }
//
//
//    @And("^filed countnamee \"([^\"]*)\"$")
//    public void filedCountnamee(String NameCountbad) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldDestination(NameCountbad);
//    }
//
//
//    @Then("^click transerferButtonn$")
//    public void clickTranserferButtonn() {
//
//        accountCreator.clickActionTransferencia();
//    }
//
//    @And("^check msg-error$")
//    public void checkMsgError() {
//        org.junit.Assert.assertTrue( "si abrio",accountCreator.messagebad());
//
//    }
//
//
//    @Then("^click firstCoun$")
//    public void clickFirstCoun() {
//    accountHome =  accountCreator.clickAccountButtonByXpath(accountName);
//    }
//
//
//    @And("^Click Tranfer button$")
//    public void clickTranferButton() {
//    accountCreator.clickTranferButton();
//
//    }
//
//    @And("^Click trnasfer Button$")
//    public void clickTrnasferButton() {
//
//    accountCreator.clickActionTransferencia();
//    }
//
//
//    @And("^check message error is true$")
//    public void checkMessageErrorIsTrue() {
//
//    Assert.assertTrue(accountCreator.messagebad());
//    }
//
//
//
//
//
//    @And("^click trasfer button$")
//    public void clickTrasferButton() {
//
//    accountCreator.clickTranferButton();
//    }
//
//
//    @Then("^empty fiel ammunt$")
//    public void emptyFielAmmunt() {
//    accountCreator.emptyFieldMount();
//
//    }
//
//
//    @And("^files ammount tranfer \"([^\"]*)\"$")
//    public void filesAmmountTranfer(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        accountCreator.fieldMountTransfer(arg0);
//    }
//
//
//    @Then("^try to make a biggest mount tranfer$")
//    public void tryToMakeABiggestMountTranfer() {
//
//    accountCreator.clickActionTransferencia();
//    }
//
//
//    @And("^check message error$")
//    public void checkMessageError() {
//    Assert.assertTrue(accountCreator.messagebad(),"is true");
//
//    }
//
//    @Then("^click second count$")
//    public void clickSecondCount() {
//        accountHome=accountCreator.clickAccountButtonByXpath(accountName2);
//    }
//}


    //New steps








}