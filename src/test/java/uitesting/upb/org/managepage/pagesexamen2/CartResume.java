package uitesting.upb.org.managepage.pagesexamen2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class CartResume extends BasePage {

    @FindBy(xpath = "//*[@title=\"Calzado de Fútbol Nemeziz 19.3 Terreno Firme\" and @class=\"name\"]")
    private WebElement calzadoTitle;

    @FindBy(xpath = "//*[@data-ci-test-id=\"orderTotalCartValue\"]")
    private WebElement totalTitle;

    public String getTitle(){
        return Events.getText(calzadoTitle);
    }

    public String getTotal(){
        return Events.getText(totalTitle);
    }


}
