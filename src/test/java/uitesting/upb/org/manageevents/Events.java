package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.List;

/**
 * @autor Marcelo Garay
 */
public class Events {
    public static void click(WebElement webElement){
        webElement.click();
    }
    public static void click(By by){
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }
    public static WebElement GetWebElementById(String id) {
        return DriverManager.getInstance().getWebDriver().findElement(By.id(id));
    }
    public static int GetNumberOfElements(String xpathSelector) {
        List<WebElement> webElements = DriverManager.getInstance().getWebDriver().findElements(By.xpath(xpathSelector));
        return webElements.size();
    }
}
