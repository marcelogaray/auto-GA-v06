package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.managefile.PropertyAccessor;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {
    private WebDriver webDriver;
    public WebDriverWait wait;
    private static DriverManager ourInstance = new DriverManager();

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccessor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver,45);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

}
