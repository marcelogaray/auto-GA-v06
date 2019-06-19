package uitesting.upb.org.managepage.pagesexamen2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class AdidasNavBar extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement submenuFutbol;

    @FindBy(xpath = "//*[@id=\"header-mobile_men\"]/div/div/a")
    private WebElement hombreMenu;

    public void clickSubMenuFutbol() {
        Events.click(submenuFutbol);

       // return new ShoeButton();

    }

    public void hoverHombre() throws InterruptedException{

        WebDriver driver = DriverManager.getInstance().getWebDriver();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header-mobile_men\"]/div/div/a"));

        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();
        Thread.sleep(1000);


    }
}
