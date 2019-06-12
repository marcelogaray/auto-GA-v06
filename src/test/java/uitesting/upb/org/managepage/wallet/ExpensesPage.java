package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    public ExpensesPage fillExpenseName(){
        Events.fillField(expenseNameField,"Expensa1");
        return this;
    }

    public ExpensesPage fillCategorySelector(){
        Events.fillField(expenseCategorySelector,"Expenses");
        return this;
    }
    public ExpensesPage fillExpenseAmount(){
        Events.fillNumberField(expenseAmountField,100);
        return this;
    }
    public ExpensesPage fillExpenseDate(){
        Events.fillField(datePicker,"06/11/2019");
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

    public void createExpense(){
        this.fillExpenseName().fillCategorySelector().fillExpenseAmount().fillExpenseDate().clickCreateExpenseButton();
    }

}
