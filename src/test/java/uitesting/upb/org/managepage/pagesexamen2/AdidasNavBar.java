package uitesting.upb.org.managepage.pagesexamen2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class AdidasNavBar extends BasePage {

    @FindBy(xpath = "//*[@manual_cm_sp=\"header-_-hombre-_-tenis-_-fútbol\" and @href=\"/calzado_de_futbol-hombre\"]")
    private WebElement submenuFutbol;

    @FindBy(xpath = "//*[@href=\"/hombre\"]")
    private WebElement hombreMenu;

    public ShoeButton clickSubMenuFutbol() {
        Events.click(submenuFutbol);
        return new ShoeButton();
    }

    public void hoverHombre(){
        Events.hover(DriverManager.getInstance().getWebDriver(),hombreMenu);

    }
}
