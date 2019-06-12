package uitesting.upb.org.managepage.google.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

/**
 * @autor Marcelo Garay
 */
public class Home extends BasePage {

    @FindBy(xpath = "")
    private WebElement searchTextField;

    @FindBy(css = "")
    private WebElement searchButton;

    public Home searchText(String text){
        Events.fillField(searchTextField, text);
        return this;
    }

    public void clickSearchButton(){
        Events.click(searchButton);
    }

    public void searchTextAndClickSearchButton(String text){
        searchText(text).clickSearchButton();
    }
}
