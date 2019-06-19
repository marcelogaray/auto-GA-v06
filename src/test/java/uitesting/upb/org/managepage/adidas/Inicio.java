package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;

public class Inicio extends BasePage {
    @FindBy (xpath = "//*[@class=\"label\" and @manual_cm_sp=\"header-_-HOMBRE\"]")
    public WebElement hombretab;


}
