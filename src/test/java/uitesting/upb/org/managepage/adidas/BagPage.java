package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class BagPage extends BasePage {
    @FindBy(xpath = "//*[@id='shipment_wrapper_0_0']//a[@class='name']")
    private WebElement shoeTitle;

    @FindBy(xpath = "//*[@id='shipment_wrapper_0_0']//a[@class='ffSelectButton']/span")
    private WebElement elementQuantity;

    @FindBy(xpath = "//*[@id='content']//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement shoePrice;

    @FindBy(xpath = "//*[@id='content']//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement shoeTotal;

    public boolean isTitleVisible() {
        return Events.isWebElementVisible(shoeTitle);
    }
    public String getQuantity() {
        return elementQuantity.getText();
    }
    public String getShoePrice() {
        return shoePrice.getText();
    }
    public String getBagTotal() {
        return shoeTotal.getText();
    }
}
