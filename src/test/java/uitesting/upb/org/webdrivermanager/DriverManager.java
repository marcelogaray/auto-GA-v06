package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.managefile.PropertyAccesor;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {
    private WebDriver webDriver;
    private static DriverManager ourInstance = new DriverManager();
    public WebDriverWait wait;

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver, 10);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
    public void closeWebDriver () {
        webDriver.close();
    }
}
