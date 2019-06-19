package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AdidasHeader extends BasePage {
    @FindBy(xpath = "//*[@id=\"app\"]//div[@data-auto-id='glass-navigation-flyout']")
    private WebElement hombreLink;
    @FindBy(xpath = "//*[@id='app']//div[@class='col-5']//a[@manual_cm_sp='header-_-hombre-_-tenis-_-fútbol']")
    private WebElement futbolLink;

    public AdidasHeader hoverHombreItem() {
        Events.hoverElement(hombreLink);
        return this;
    }
    public AdidasShopMenu clickFutbolOption() {
        Events.click(futbolLink);
        return new AdidasShopMenu();
    }

}
