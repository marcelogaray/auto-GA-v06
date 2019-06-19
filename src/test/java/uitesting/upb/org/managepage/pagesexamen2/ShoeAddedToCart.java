package uitesting.upb.org.managepage.pagesexamen2;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ShoeAddedToCart extends BasePage {

    @FindBy(xpath = "//*[@data-auto-id=\"add-to-bag-product-info-qty\" and contains(.,'Cantidad: 1')]")
    private WebElement cantidadigual1;


    @FindBy(xpath = "//*[@href=\"//www.adidas.mx/on/demandware.store/Sites-adidas-MX-Site/es_MX/Cart-Show\" " +
                    "and @class=\"gl-cta gl-cta--primary gl-cta--full-width gl-vspacing-s\" ]")
    private  WebElement buttonVerCarrito;



    public String getCantidad(){
        return Events.getText(cantidadigual1);
    }


    public CartResume clickButtonVerCarrito(){
        Events.click(buttonVerCarrito);
        return new CartResume();
    }


}
