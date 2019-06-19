package uitesting.upb.org.managepage.pagesexamen2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;


public class ShoeButton extends BasePage {

    @FindBy(xpath = "//*[@class=\"gl-product-card__image performance-item\" and @title=\"Calzado de Fútbol Nemeziz 19.3 Terreno Firme\"]")
    private WebElement shoeButton;

    @FindBy(xpath = "//*[@class=\"gl-price__value\" and contains(.,'$2,199')]")
    private WebElement priceTag;



    public String getPrecio(){

        return Events.getText(priceTag);
    }

    public void clickShoeButton(){

        Events.click(shoeButton);
    }
}
