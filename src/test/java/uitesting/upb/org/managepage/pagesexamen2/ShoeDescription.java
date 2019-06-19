package uitesting.upb.org.managepage.pagesexamen2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;

import java.awt.*;

public class ShoeDescription {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[3]/div[2]/div/div/form/div[2]/div[1]/div/div/button")
    private WebElement eligeTuTalla;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[3]/div[3]/div[2]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[6]/button")
    private  WebElement talla85;



    public void clickEligeTuTalla(){
        Events.click(eligeTuTalla);
    }



    public void clickTalla85(){
        Events.click(talla85);
    }
}
