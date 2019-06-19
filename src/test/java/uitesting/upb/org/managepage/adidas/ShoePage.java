package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ShoePage extends BasePage {
    @FindBy(xpath = "//*[@id='app']//button[@title='Elige tu talla']")
    private WebElement sizeSelectButton;

    @FindBy(xpath ="//*[@id='app']//button[@title='MX 8.5']")
    private WebElement size8point5Button;

    @FindBy(xpath = "//*[@id='app']//button[@data-auto-id='add-to-bag']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//*[@id='modal-root']//span[@data-auto-id='add-to-bag-product-info-qty']")
    private WebElement amountText;

    @FindBy(xpath = "//*[@id='modal-root']//a[@data-auto-id='view-bag-desktop']")
    private WebElement viewBagButton;

    public ShoePage clickSizeSelectButton() {
        Events.click(sizeSelectButton);
        return this;
    }
    public ShoePage clickSizeButton() {
        Events.click(size8point5Button);
        return this;
    }
    public ShoePage clickAddToBagButton() {
        Events.click(addToBagButton);
        return this;
    }
    public String getAmountText() {
        return amountText.getText();
    }
    public boolean isAmountTextVisible() {
        return Events.isWebElementVisible(amountText);
    }
    public BagPage clickViewBagButton() {
        Events.click(viewBagButton);
        return new BagPage();
    }
}
