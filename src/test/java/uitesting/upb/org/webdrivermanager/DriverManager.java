package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.managefile.PropertyAccessor;

import java.util.concurrent.TimeUnit;

/**
 * @autor Mateo Puña
 */
public class DriverManager {
    private WebDriver webDriver;
    public WebDriverWait wait;
    public WebDriverWait webDriverWait;


    private static DriverManager ourInstance = new DriverManager();

    private static final int IMPLICIT_TIME_WAIT = PropertyAccessor.getInstance().getImplicitTimeWait();
    private static final int EXPLICIT_TIME_WAIT = PropertyAccessor.getInstance().getExplicitTimeWait();

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

    public void restoreWaiters() {
        setImplicitTimeWait(IMPLICIT_TIME_WAIT);
        setExplicitTimeWait(EXPLICIT_TIME_WAIT);
    }

    public void setImplicitTimeWait(int implicitTimeWait) {
        webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    public void setExplicitTimeWait(int explicitTimeWait) {
        webDriverWait = new WebDriverWait(webDriver, explicitTimeWait);
    }


}
