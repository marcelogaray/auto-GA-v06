package uitesting.upb.org.prueba1;

import org.openqa.selenium.WebDriver;

/**
 * @autor Marcelo Garay
 */
public class DriverPadre {
    public DriverPadre(WebDriver webdriver) {
        WebDriver webDriver = webdriver;
        webDriver.get("https://phptravels.com/");

        System.out.println("FirstCodeSelenium.main ");

        try {
            Thread.sleep(6000);
        }catch (Exception e){
            System.out.println("args = [" + e.fillInStackTrace() + "]");
        }

        webDriver.quit();
    }
}
