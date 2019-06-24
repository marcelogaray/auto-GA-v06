package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Income extends BasePage {

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id = "buttonCategory")
    private WebElement addCategoryButton;

    @FindBy(id = "categoryRegister")
    private WebElement addCategoryField;

    @FindBy(id = "name")
    private WebElement addIncomeNameField;

    @FindBy(id = "category")
    private WebElement addIncomeCategorySelector;

    @FindBy(id = "amount")
    private WebElement addIncomeAmountField;

    @FindBy(id = "dateSpace")
    private WebElement addIncomeDateField;

    @FindBy(id = "buttonTransaction")
    private WebElement addIncomeButton;

    @FindBy(id = "old-name")
    private WebElement editIncomeNameSelector;

    @FindBy(id = "new-name")
    private WebElement editIncomeNameField;

    @FindBy(id = "new-category")
    private WebElement editIncomeCategorySelector;

    @FindBy(id = "new-date")
    private WebElement editIncomeDateField;

    @FindBy(id = "new-amount")
    private WebElement editIncomeAmountField;

    @FindBy(id = "buttonChange")
    private WebElement editIncomeButton;

    @FindBy(id = "categorySuccess")
    private WebElement addCategorySuccessAlert;

    @FindBy(id = "categoryFail")
    private WebElement addCategoryFailAlert;

    @FindBy(id = "transactionSuccess")
    private WebElement addIncomeSuccessAlert;

    @FindBy(id = "transactionFail")
    private WebElement addIncomeFailAlert;

    @FindBy(id = "changeSuccess")
    private WebElement editIncomeSuccessAlert;

    @FindBy(id = "changeFail")
    private WebElement editIncomeFailAlert;

    public void isVisibleCategorySalary(){
        Select visible = new Select(addIncomeCategorySelector);
        visible.selectByVisibleText("Salary");
    }


    public void isVisibleCategoryOthers(){
        Select visible = new Select(addIncomeCategorySelector);
        visible.selectByVisibleText("Others");
    }

    public boolean isCategoryButtonVisible() {
        return Events.isVisibleWebElement(addCategoryButton);
    }

    public boolean isCategoryFieldVisible() {
        return Events.isVisibleWebElement(addCategoryField);
    }

    public boolean isIncomeNameFieldVisible() {
        return Events.isVisibleWebElement(addIncomeNameField);
    }

    public void fillCategoryField(String nameAccount) {
        Events.fillField(addCategoryField, nameAccount);
    }

    public void clickRegisterCategoryButton() {
        Events.click(addCategoryButton);
    }

    public boolean isIncomeCategorySelectorVisible() {
        return Events.isVisibleWebElement(addIncomeCategorySelector);
    }

    public boolean isIncomeAmountFieldVisible() {
        return Events.isVisibleWebElement(addIncomeAmountField);
    }

    public boolean isIncomeDateFieldVisible() {
        return Events.isVisibleWebElement(addIncomeDateField);
    }

    public boolean isIncomeButtonVisible() {
        return Events.isVisibleWebElement(addIncomeButton);
    }

    public void fillIncomeNameField(String name) {
        Events.fillField(addIncomeNameField, name);
    }

    public void fillIncomeAmountField(int amount) {
        Events.fillNumberField(addIncomeAmountField, amount);
    }

    public void selectIncomeDefaultCategory(String category) {
        Events.fillField(addIncomeCategorySelector, category);
    }

    public void fillIncomeDateField(String date) {
        Events.fillField(addIncomeDateField, date);
    }

    public void clickRegisterTransactionButton() {
        Events.click(addIncomeButton);
    }

    public boolean isModifyIncomeNameSelectorVisible() {
        return  Events.isVisibleWebElement(editIncomeNameSelector);
    }

    public boolean isModifyIncomeNameFieldVisible() {
        return Events.isVisibleWebElement(editIncomeNameField);
    }

    public boolean isModifyIncomeCategorySelectorVisible() {
        return Events.isVisibleWebElement(editIncomeCategorySelector);
    }

    public boolean isModifyIncomeDateFieldVisible() {
        return Events.isVisibleWebElement(editIncomeDateField);
    }

    public boolean isModifyIncomeAmountFieldVisible() {
        return Events.isVisibleWebElement(editIncomeAmountField);
    }

    public boolean isModifyIncomeButtonVisible() {
        return Events.isVisibleWebElement(editIncomeButton);
    }

    public void selectIncomeOldName(String oldName) {
        Events.fillField(editIncomeNameSelector,oldName);
    }

    public void fillIncomeNewNameField(String newName) {
        Events.fillField(editIncomeNameField,newName);
    }

    public void selectIncomeNewCategory(String newCategory) {
        Events.fillField(editIncomeCategorySelector,newCategory);
    }

    public void fillIncomeNewDateField(String newDate) {
        Events.fillField(editIncomeDateField,newDate);
    }

    public void fillIncomeNewAmountField(String newAmount) {
        Events.fillField(editIncomeAmountField,newAmount);
    }

    public void clickRegisterChangesButton() {
        Events.click(editIncomeButton);
    }

    public boolean isCategorySuccessAlertVisible() {
        return Events.isVisibleWebElement(addCategorySuccessAlert);
    }

    public boolean isCategoryFailedAlertVisible() {
        return Events.isVisibleWebElement(addCategoryFailAlert);
    }

    public boolean isIncomeSuccessAlertVisible() {
        return Events.isVisibleWebElement(addIncomeSuccessAlert);
    }

    public boolean isIncomeFailAlertVisible() {
        return Events.isVisibleWebElement(addIncomeFailAlert);
    }

    public boolean isModifyIncomeFailAlertVisible() {
        return Events.isVisibleWebElement(editIncomeFailAlert);
    }

    public boolean isModifyIncomeSuccessAlertVisible() {
        return Events.isVisibleWebElement(editIncomeSuccessAlert);
    }
}
