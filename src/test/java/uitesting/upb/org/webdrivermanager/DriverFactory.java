package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uitesting.upb.org.manageevents.Events;

import java.util.HashMap;
import java.util.Map;

/**
 * @autor Marcelo Garay
 */
public class DriverFactory {

    private DriverFactory(){}

    public Browser getBrowser(String nameBrowser){
        if(nameBrowser == null){
            return null;
        }
        if(nameBrowser.equalsIgnoreCase("CHROME")){
            return new Chrome();

        } else if(nameBrowser.equalsIgnoreCase("FIREFOX")){
            return new Firefox();

        }

        return null;
    }

    public static WebDriver getWebDriver(BrowserType browserType){
        Map<BrowserType, Browser> browserPickUp = new HashMap<>();
        browserPickUp.put(BrowserType.CHROME, new Chrome());
        browserPickUp.put(BrowserType.FIREFOX, new Firefox());
        return browserPickUp.get(browserType).initializeDriver();
    }

    public void exampleMap(){
        Map<String, String > students = new HashMap<>();

        students.put("123456", "Nombre1");
        students.put("456789", "Nombre2");
        students.put("654123", "Nombre3");

        students.get("456789");

    }


    public static void main(String[] args) {
        DriverFactory a = new DriverFactory();
        a.getBrowser("FIREFOX").initializeDriver();
        a.getBrowser("CHROME").initializeDriver();
        a.getBrowser("IE").initializeDriver();
        a.getBrowser("SAFARI").initializeDriver();

        a.getWebDriver(BrowserType.CHROME)
                .findElement(
                        By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
                ).sendKeys();


//        a.getWebDriver(BrowserType.CHROME)
//                .findElement(
//                        By.xpath("//form[@id='tsf']//div[contains(@class,'FPdoLc VlcLAe')]//input[@value='Buscar con Google']")
//                ).click();

        a.getWebDriver(BrowserType.CHROME).quit();

        Events.click(By.xpath(""));
    }
}
