package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

    public static void selectOptionInSelectElement(Select selectElement, String value) {
        selectElement.selectByValue(value);
    }

    public static int getNumberOfElements(By by) {
        List<WebElement> webElements = DriverManager.getInstance().getWebDriver().findElements(by);
        return webElements.size();
    }
}
