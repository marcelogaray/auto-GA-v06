package uitesting.upb.org.managepage.pagesexamen2;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ShoeDescription extends BasePage {

    @FindBy(xpath = "//*[@class=\"gl-dropdown__select label dropdown-select\" and @title=\"Elige tu talla\"]")
    private WebElement eligeTuTalla;


    @FindBy(xpath = "//*[@class=\"gl-menu__element\" and @title=\"MX 8.5\"]")
    private  WebElement talla85;

    @FindBy(xpath = "//*[@class=\"gl-cta gl-cta--primary gl-cta--full-width btn-bag\"]")
    private  WebElement anadirAlCarritoButton;

    public void clickEligeTuTalla(){
        Events.click(eligeTuTalla);
    }

    public void clickTalla85(){
        Events.click(talla85);
    }

    public ShoeAddedToCart clickAnadirCarrito(){
        Events.click(anadirAlCarritoButton);
        return new ShoeAddedToCart();
    }

}
