package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ExpensesPage extends BasePage {

    @FindBy(id = "name")
    private WebElement expenseNameField;

    @FindBy(id = "category")
    private WebElement expenseCategorySelector;

    @FindBy(id = "amount")
    private WebElement expenseAmountField;

    @FindBy(id = "dateSpace")
    private WebElement datePicker;

    @FindBy(id = "buttonTransaction")
    private WebElement createExpenseButton;

    public  void visibleExpensas(){
        Select categoryExpense = new Select(expenseCategorySelector);
        categoryExpense.selectByVisibleText("Expenses");

    }

    public  void visibleOthers(){
        Select categoryExpense = new Select(expenseCategorySelector);
        categoryExpense.selectByVisibleText("Others");

    }


    public  void isNotVisibleOthers(){
        Select categoryExpense = new Select(expenseCategorySelector);
       categoryExpense.deselectByVisibleText("Others");

    }
    public ExpensesPage fillExpenseName(String name){
        Events.fillField(expenseNameField,name);
        return this;
    }

    public ExpensesPage fillCategorySelector(String category){
        Events.fillField(expenseCategorySelector,category);
        return this;
    }
    public ExpensesPage fillExpenseAmount(int amount){
        Events.fillNumberField(expenseAmountField,amount);
        return this;
    }
    public ExpensesPage fillExpenseDate(String date){
        Events.fillField(datePicker,date);
        return this;
    }

    public ExpensesPage clickCreateExpenseButton(){
        Events.click(createExpenseButton);
        return this;
    }

    public Boolean nameFieldVisible(){
        return Events.isVisibleWebElement(expenseNameField);
    }
    public Boolean categorySelectorVisible(){
        return Events.isVisibleWebElement(expenseCategorySelector);
    }
    public Boolean amountFieldVisible(){
        return Events.isVisibleWebElement(expenseAmountField);
    }
    public Boolean datePickerVisible(){
        return Events.isVisibleWebElement(datePicker);
    }

    public void createExpense(String name, String category, int amount, String date){
        this.fillExpenseName(name).fillCategorySelector(category).fillExpenseAmount(amount).fillExpenseDate(date).clickCreateExpenseButton();
    }

}
