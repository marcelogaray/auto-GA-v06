package uitesting.upb.org.managepage.pagesexamen2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;


public class ShoeButton extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div")
    private WebElement shoeButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/a/div[2]/div[2]/span")
    private WebElement priceTag;



    public String getPrecio(){
        return priceTag.getText();
    }

    public ShoeDescription clickShoeButton(){

        Events.click(shoeButton);
        return new ShoeDescription();
    }
}
