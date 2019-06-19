package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;

public class AdidasShopMenu extends BasePage {
    @FindBy(xpath = "//*[@id='app']//div[@class='col-s-6 col-m-4 col-l-8 col-xl-6 no-gutters plp-column___3gy6t single-row___2Co_p']")
    private WebElement firstItem;
}
