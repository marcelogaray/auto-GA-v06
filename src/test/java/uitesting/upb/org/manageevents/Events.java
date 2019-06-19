package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Mateo Puña
 */
public class Events {

    public static void click(WebElement webElement) {
        DriverManager.getInstance().wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    public static void click(By by){

        DriverManager.getInstance().wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }
    public static void  clearField(WebElement texField){
        texField.clear();
    }

    public static boolean isVisibleWebElement(WebElement webElement) {
        return webElement.isDisplayed();
    }
    public static void clearFieldText(WebElement webElement){
        webElement.clear();
    }

    public static void selectByText(WebElement element, String text) {
        Select selectElement = new Select(element);
        selectElement.selectByVisibleText(text);
    }

    public static void hover(WebDriver driver, WebElement element){

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public static String getText(WebElement element){
        return DriverManager.getInstance().wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }


}
