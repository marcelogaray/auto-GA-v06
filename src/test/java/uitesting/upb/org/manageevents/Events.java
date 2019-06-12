package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.List;

/**
 * @autor Marcelo Garay
 */

public class Events {
    public static void click(WebElement webElement){
        DriverManager.getInstance().wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }
    public static void click(By by){
        DriverManager.getInstance().wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        DriverManager.getInstance().wait.until(ExpectedConditions.elementToBeClickable(searchTextField)).sendKeys(text);
    }

    public static WebElement GetWebElementById(String id) {
        return DriverManager.getInstance().getWebDriver().findElement(By.id(id));
    }
    public static int GetNumberOfElements(String xpathSelector) {
        List<WebElement> webElements = DriverManager.getInstance().getWebDriver().findElements(By.xpath(xpathSelector));
        return webElements.size();
    }
    public static boolean isWebElementVisible(WebElement webElement) {
        return DriverManager.getInstance().wait.until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
    }

    public static void selectOptionInSelectElement(Select selectElement, String value) {
        selectElement.selectByValue(value);
    }

    public static int getNumberOfElements(By by) {
        List<WebElement> webElements = DriverManager.getInstance().getWebDriver().findElements(by);
        return webElements.size();
    }
    public static boolean isElementOnSelector(WebElement selector, String element) {
        WebElement option = selector.findElement(By.xpath("//option[contains(.," + element + ")]"));
        if (option != null)
        {return true;}
        else {return false;}
    }

}
