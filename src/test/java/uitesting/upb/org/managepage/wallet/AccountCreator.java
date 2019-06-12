package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountCreator extends BasePage {
    //@FindBy(id = "accountNameInput")
    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/form/div[1]/input")
    private WebElement accountNameTextField;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "general")
    private WebElement generalAccountButton;

    @FindBy(id = "buttonCategory")
    private WebElement addCategoryButton;

    @FindBy(id = "categoryRegister")
    private WebElement addCategoryField;

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id = "name")
    private WebElement ingresoNamefield;

    @FindBy(id ="category")
    private WebElement ingresoCategoriafield;

    @FindBy (id = "amount")
    private  WebElement ingresoMountfield;

    @FindBy(id = "dateSpace")
    private WebElement ingresoDateField;

    @FindBy (id="buttonTransaction")
    private  WebElement ingresoButton;

    @FindBy(id="Transfer")
    private WebElement buttonTranfer;

    @FindBy(id="destinationAccount")
    private WebElement fieldDestinationTranfer;

    @FindBy(id="amount")
    private WebElement  fieldMountTransfer;

    @FindBy(id="btn-transfer")
    private WebElement buttonActionTransfer;

    @FindBy(id="msg-successful")
    private  WebElement successful;

    @FindBy(id="msg-error")
    private WebElement bad;

    public void clickNameIngreso(){
        Events.click(ingresoNamefield);
    }
    public void fieldNameIngreso (String fieldNameIngreso){
        Events.fillField(ingresoNamefield,fieldNameIngreso);
    }

    public void clickCategoria(){
        Events.click(ingresoCategoriafield);
    }

    public void fieldCategoriaIngreso(String CategoriaName){
        Events.fillField(ingresoCategoriafield,CategoriaName);
    }

    public void clickMountIngreso(){
        Events.click(ingresoMountfield);
    }

    public void fieldMountIngreso(String MountField){
        Events.fillField(ingresoMountfield,MountField);
    }

    public void fieldDateIngreso(String Date){
        Events.fillField(ingresoDateField,Date);
    }

    public void clickIngresoButton (){
        Events.click(ingresoButton);
    }

    public void clickTranferButton(){
        Events.click(buttonTranfer);
    }

    public void clickFieldDestination(){
        Events.click(fieldDestinationTranfer);
    }

    public void fieldDestination(String NameDestination){
        Events.fillField(fieldDestinationTranfer,NameDestination);
    }

    public void emptyFieldMount(){
        Events.clearField(fieldMountTransfer);
    }

    public void fieldMountTransfer(String Mount){
        Events.fillField(fieldMountTransfer,Mount);
    }

    public void clickActionTransferencia(){
        Events.click(buttonActionTransfer);
    }

    public boolean messagegood(){
        return Events.isVisibleWebElement(successful);
    }

    public boolean messagebad(){
        return Events.isVisibleWebElement(bad);
    }

    public AccountHome clickAccountButtonByXpath(String nameAccount){
        Events.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div/a/button"));
        return  new AccountHome();}

    public void clickIncomesButton(){
        Events.click(incomeButton);
    }

    public AccountCreator fillAccountNameTextField(String nameAccount){
        Events.fillField(accountNameTextField, nameAccount);
        return this;
    }

    public void clickAddButton(){
        Events.click(addAccountButton);
    }

    public AccountCreator enterNameAndClickAddButton(String accountName){
        fillAccountNameTextField(accountName).clickAddButton();
        return this;
    }

    public AccountCreator createNewAccount(String accountName){
        this.fillAccountNameTextField(accountName).clickAddButton();
        return this;
    }

    public AccountHome clickAccountButton(String accountName){
        Events.click(By.id(accountName));
        return new AccountHome();
    }

    public boolean isAccountNameFieldAndButtonVisible() {
        return Events.isVisibleWebElement(accountNameTextField) && Events.isVisibleWebElement(addAccountButton);
    }

    public boolean isAccountNameButtonVisible(String accountName) {
        return Events.isVisibleWebElement(webDriver.findElement(By.id(accountName)));
    }

    public boolean isGeneralButtonVisible() {
        return Events.isVisibleWebElement(generalAccountButton);
    }
}
